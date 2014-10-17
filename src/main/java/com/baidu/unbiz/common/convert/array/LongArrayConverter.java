package com.baidu.unbiz.common.convert.array;

import java.util.Arrays;

import com.baidu.unbiz.common.StringUtil;
import com.baidu.unbiz.common.convert.ConvertBean;
import com.baidu.unbiz.common.convert.ConvertUtil;
import com.baidu.unbiz.common.convert.ObjectConverter;
import com.baidu.unbiz.common.convert.TypeConverter;

public class LongArrayConverter extends ObjectConverter<long[]> implements
		TypeConverter<long[]> {

	protected final ConvertBean convertBean;

	public LongArrayConverter() {
		this.convertBean = ConvertUtil.getInstance();
		register(long[].class);
		typeConverters.put(Long[].class, new ArrayConverter<Long>(Long.class));
	}

	public LongArrayConverter(ConvertBean convertBean) {
		this.convertBean = convertBean;
		register(long[].class);
		typeConverters.put(Long[].class, new ArrayConverter<Long>(Long.class));
	}

	@Override
	public long[] toConvert(String value) {
		String[] values = StringUtil.splitc(value,
				ArrayConverter.NUMBER_DELIMITERS);
		return convertArray(values);
	}

	@Override
	public String fromConvert(long[] value) {
		return Arrays.toString(value);
	}

	public long[] toConvert(Object value) {
		Class<?> type = value.getClass();
		if (!type.isArray()) {
			if (type == String.class) {
				String[] values = StringUtil.splitc(value.toString(),
						ArrayConverter.NUMBER_DELIMITERS);
				return convertArray(values);
			}

			return new long[] { convertBean.toLongValue(value) };
		}

		PrimitiveArrayType arrayType = PrimitiveArrayType.find(type);
		if (arrayType != null) {
			return arrayType.convert2Long(value);
		}

		return convertArray((Object[]) value);
	}

	protected long[] convertArray(Object[] values) {
		long[] results = new long[values.length];
		for (int i = 0; i < values.length; i++) {
			results[i] = convertBean.toLongValue(values[i]);
		}
		return results;
	}

}