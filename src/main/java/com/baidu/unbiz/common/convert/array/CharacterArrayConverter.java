package com.baidu.unbiz.common.convert.array;

import java.util.Arrays;

import com.baidu.unbiz.common.ArrayUtil;
import com.baidu.unbiz.common.convert.ConvertBean;
import com.baidu.unbiz.common.convert.ConvertUtil;
import com.baidu.unbiz.common.convert.ObjectConverter;
import com.baidu.unbiz.common.convert.TypeConverter;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月19日 下午2:34:15
 */
public class CharacterArrayConverter extends ObjectConverter<char[]> implements
		TypeConverter<char[]> {

	protected final ConvertBean convertBean;

	public CharacterArrayConverter() {
		this.convertBean = ConvertUtil.getInstance();
		register(char[].class);
		typeConverters.put(Character[].class, new ArrayConverter<Character>(
				Character.class));
	}

	public CharacterArrayConverter(ConvertBean convertBean) {
		this.convertBean = convertBean;
		register(char[].class);
		typeConverters.put(Character[].class, new ArrayConverter<Character>(
				Character.class));
	}

	@Override
	public char[] toConvert(String value) {
		String[] values = ArrayUtil.toStringArray(value.toString());
		return convertArray(values);
	}

	@Override
	public String fromConvert(char[] value) {
		return Arrays.toString(value);
	}

	public char[] toConvert(Object value) {
		Class<?> type = value.getClass();
		if (!type.isArray()) {
			return value.toString().toCharArray();
		}

		PrimitiveArrayType arrayType = PrimitiveArrayType.find(type);
		if (arrayType != null) {
			return arrayType.convert2Char(value);
		}

		return convertArray((Object[]) value);
	}

	protected char[] convertArray(Object[] values) {
		char[] results = new char[values.length];
		for (int i = 0; i < values.length; i++) {
			results[i] = convertBean.toCharValue(values[i]);
		}
		return results;
	}

}
