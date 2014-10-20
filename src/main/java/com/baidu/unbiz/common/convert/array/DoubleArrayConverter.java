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
 * @version create on 2014年9月19日 下午2:36:11
 */
public class DoubleArrayConverter extends ObjectConverter<double[]> implements TypeConverter<double[]> {

    protected final ConvertBean convertBean;

    public DoubleArrayConverter() {
        this.convertBean = ConvertUtil.getInstance();
        register(double[].class);
        typeConverters.put(Double[].class, new ArrayConverter<Double>(Double.class));
    }

    public DoubleArrayConverter(ConvertBean convertBean) {
        this.convertBean = convertBean;
        register(double[].class);
        typeConverters.put(Double[].class, new ArrayConverter<Double>(Double.class));
    }

    @Override
    public double[] toConvert(String value) {
        String[] values = StringUtil.splitc(value, ArrayConverter.NUMBER_DELIMITERS);
        return convertArray(values);
    }

    @Override
    public String fromConvert(double[] value) {
        return Arrays.toString(value);
    }

    public double[] toConvert(Object value) {
        Class<?> type = value.getClass();
        if (!type.isArray()) {
            if (type == String.class) {
                String[] values = StringUtil.splitc(value.toString(), ArrayConverter.NUMBER_DELIMITERS);
                return convertArray(values);
            }

            return new double[] { convertBean.toDoubleValue(value) };
        }

        PrimitiveArrayType arrayType = PrimitiveArrayType.find(type);
        if (arrayType != null) {
            return arrayType.convert2Double(value);
        }

        return convertArray((Object[]) value);
    }

    protected double[] convertArray(Object[] values) {
        double[] results = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            results[i] = convertBean.toDoubleValue(values[i]);
        }
        return results;
    }

}