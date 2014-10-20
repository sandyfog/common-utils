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
 * @version create on 2014年9月19日 下午2:41:29
 */
public class ShortArrayConverter extends ObjectConverter<short[]> implements TypeConverter<short[]> {

    protected final ConvertBean convertBean;

    public ShortArrayConverter() {
        this.convertBean = ConvertUtil.getInstance();
        register(short[].class);
        typeConverters.put(Short[].class, new ArrayConverter<Short>(Short.class));
    }

    public ShortArrayConverter(ConvertBean convertBean) {
        this.convertBean = convertBean;
        register(short[].class);
        typeConverters.put(Short[].class, new ArrayConverter<Short>(Short.class));
    }

    @Override
    public short[] toConvert(String value) {
        String[] values = StringUtil.splitc(value, ArrayConverter.NUMBER_DELIMITERS);
        return convertArray(values);
    }

    @Override
    public String fromConvert(short[] value) {
        return Arrays.toString(value);
    }

    public short[] toConvert(Object value) {
        Class<?> type = value.getClass();
        if (!type.isArray()) {
            if (type == String.class) {
                String[] values = StringUtil.splitc(value.toString(), ArrayConverter.NUMBER_DELIMITERS);
                return convertArray(values);
            }

            return new short[] { convertBean.toShortValue(value) };
        }

        PrimitiveArrayType arrayType = PrimitiveArrayType.find(type);
        if (arrayType != null) {
            return arrayType.convert2Short(value);
        }

        return convertArray((Object[]) value);
    }

    protected short[] convertArray(Object[] values) {
        short[] results = new short[values.length];
        for (int i = 0; i < values.length; i++) {
            results[i] = convertBean.toShortValue(values[i]);
        }
        return results;
    }

}