package com.baidu.unbiz.common.convert.array;

import java.util.Arrays;

import com.baidu.unbiz.common.StringUtil;
import com.baidu.unbiz.common.convert.ConvertBean;
import com.baidu.unbiz.common.convert.ConvertUtil;
import com.baidu.unbiz.common.convert.ObjectConverter;
import com.baidu.unbiz.common.convert.TypeConverter;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月19日 下午2:39:02
 */
public class IntegerArrayConverter extends ObjectConverter<int[]> implements TypeConverter<int[]> {

    protected final ConvertBean convertBean;

    public IntegerArrayConverter() {
        this.convertBean = ConvertUtil.getInstance();
        register(int[].class);
        typeConverters.put(Integer[].class, new ArrayConverter<Integer>(Integer.class));
    }

    public IntegerArrayConverter(ConvertBean convertBean) {
        this.convertBean = convertBean;
        register(int[].class);
        typeConverters.put(Integer[].class, new ArrayConverter<Integer>(Integer.class));
    }

    @Override
    public int[] toConvert(String value) {
        String[] values = StringUtil.splitc(value, ArrayConverter.NUMBER_DELIMITERS);
        return convertArray(values);
    }

    @Override
    public String fromConvert(int[] value) {
        return Arrays.toString(value);
    }

    public int[] toConvert(Object value) {
        Class<?> type = value.getClass();
        if (!type.isArray()) {
            if (type == String.class) {
                String[] values = StringUtil.splitc(value.toString(), ArrayConverter.NUMBER_DELIMITERS);
                return convertArray(values);
            }

            return new int[] { convertBean.toIntValue(value) };
        }

        PrimitiveArrayType arrayType = PrimitiveArrayType.find(type);
        if (arrayType != null) {
            return arrayType.convert2Int(value);
        }

        // array
        return convertArray((Object[]) value);
    }

    protected int[] convertArray(Object[] values) {
        int[] results = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            results[i] = convertBean.toIntValue(values[i]);
        }
        return results;
    }

}