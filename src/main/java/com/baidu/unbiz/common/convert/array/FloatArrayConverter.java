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
 * @version create on 2014年9月19日 下午2:37:27
 */
public class FloatArrayConverter extends ObjectConverter<float[]> implements
		TypeConverter<float[]> {

	protected final ConvertBean convertBean;

	public FloatArrayConverter() {
		this.convertBean = ConvertUtil.getInstance();
		register(float[].class);
		typeConverters.put(Float[].class,
				new ArrayConverter<Float>(Float.class));
	}

	public FloatArrayConverter(ConvertBean convertBean) {
		this.convertBean = convertBean;
		register(float[].class);
		typeConverters.put(Float[].class,
				new ArrayConverter<Float>(Float.class));
	}

	@Override
	public float[] toConvert(String value) {
		String[] values = StringUtil.splitc(value,
				ArrayConverter.NUMBER_DELIMITERS);
		return convertArray(values);
	}

	@Override
	public String fromConvert(float[] value) {
		return Arrays.toString(value);
	}

	public float[] toConvert(Object value) {
		Class<?> type = value.getClass();
		if (!type.isArray()) {
			if (type == String.class) {
				String[] values = StringUtil.splitc(value.toString(),
						ArrayConverter.NUMBER_DELIMITERS);
				return convertArray(values);
			}

			return new float[] { convertBean.toFloatValue(value) };
		}

		PrimitiveArrayType arrayType = PrimitiveArrayType.find(type);
		if (arrayType != null) {
			return arrayType.convert2Float(value);
		}

		return convertArray((Object[]) value);
	}

	protected float[] convertArray(Object[] values) {
		float[] results = new float[values.length];
		for (int i = 0; i < values.length; i++) {
			results[i] = convertBean.toFloatValue(values[i]);
		}
		return results;
	}

}