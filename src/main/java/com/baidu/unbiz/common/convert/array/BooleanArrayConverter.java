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
 * @version create on 2014年9月19日 上午3:56:53
 */
public class BooleanArrayConverter extends ObjectConverter<boolean[]> implements TypeConverter<boolean[]> {

    protected final ConvertBean convertBean;

    public BooleanArrayConverter() {
        this.convertBean = ConvertUtil.getInstance();
        register(boolean[].class);
        typeConverters.put(Boolean[].class, new ArrayConverter<Boolean>(Boolean.class));
    }

    public BooleanArrayConverter(ConvertBean convertBean) {
        this.convertBean = convertBean;
        register(boolean[].class);
        typeConverters.put(Boolean[].class, new ArrayConverter<Boolean>(Boolean.class));
    }

    @Override
    public boolean[] toConvert(String value) {
        String[] values = StringUtil.splitc(value, ArrayConverter.NUMBER_DELIMITERS);
        return convertArray(values);
    }

    @Override
    public String fromConvert(boolean[] value) {
        return Arrays.toString(value);
    }

    public boolean[] toConvert(Object value) {
        Class<? extends Object> type = value.getClass();
        if (!type.isArray()) {
            if (type == String.class) {
                String[] values = StringUtil.splitc(value.toString(), ArrayConverter.NUMBER_DELIMITERS);
                return convertArray(values);
            }

            return new boolean[] { convertBean.toBooleanValue(value) };
        }

        PrimitiveArrayType arrayType = PrimitiveArrayType.find(type);
        if (arrayType != null) {
            return arrayType.convert2Boolean(value);
        }

        return convertArray((Object[]) value);
    }

    // FIXME
    private boolean[] convertArray(Object[] values) {
        boolean[] result = new boolean[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = convertBean.toBooleanValue(values[i]);
        }
        return result;
    }

}