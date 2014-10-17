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
 * @version create on 2014年9月19日 下午2:23:39
 */
public class ByteArrayConverter extends ObjectConverter<byte[]> implements
		TypeConverter<byte[]> {

	protected final ConvertBean convertBean;

	public ByteArrayConverter() {
		this.convertBean = ConvertUtil.getInstance();
		register(byte[].class);
		typeConverters.put(Byte[].class, new ArrayConverter<Byte>(Byte.class));
	}

	public ByteArrayConverter(ConvertBean convertBean) {
		this.convertBean = convertBean;
		register(byte[].class);
		typeConverters.put(Byte[].class, new ArrayConverter<Byte>(Byte.class));
	}

	@Override
	public byte[] toConvert(String value) {
		String[] values = StringUtil.splitc(value,
				ArrayConverter.NUMBER_DELIMITERS);
		return convertArray(values);
	}

	@Override
	public String fromConvert(byte[] value) {
		return Arrays.toString(value);
	}

	public byte[] toConvert(Object value) {
		Class<?> type = value.getClass();

		if (!type.isArray()) {
			return convert(value, type);
		}

		PrimitiveArrayType arrayType = PrimitiveArrayType.find(type);
		if (arrayType != null) {
			return arrayType.convert2Byte(value);
		}

		return convertArray((Object[]) value);
	}

	private byte[] convert(Object value, Class<?> type) {
		if (type == String.class) {
			String[] values = StringUtil.splitc(value.toString(),
					ArrayConverter.NUMBER_DELIMITERS);
			return convertArray(values);
		}

		return new byte[] { convertBean.toByteValue(value) };
	}

	protected byte[] convertArray(Object[] values) {
		byte[] result = new byte[values.length];
		for (int i = 0; i < values.length; i++) {
			result[i] = convertBean.toByteValue(values[i]);
		}
		return result;
	}

}