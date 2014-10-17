package com.baidu.unbiz.common.convert.array;

import com.baidu.unbiz.common.ArrayUtil;
import com.baidu.unbiz.common.StringPool;
import com.baidu.unbiz.common.StringUtil;
import com.baidu.unbiz.common.convert.ConvertBean;
import com.baidu.unbiz.common.convert.ConvertUtil;
import com.baidu.unbiz.common.convert.TypeConverter;

/**
 * FIXME ArrayConverter
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月19日 下午7:18:18
 */
@TypeConverter.Convert
public class ClassArrayConverter extends ArrayConverter<Class<?>> implements
		TypeConverter<Class<?>[]> {

	protected final ConvertBean convertBean;

	@SuppressWarnings("unchecked")
	public ClassArrayConverter() {
		this.convertBean = ConvertUtil.getInstance();
		converterManagerBean.register(Class[].class, this);
		
		this.targetComponentType = (Class<Class<?>>) Class[].class.getComponentType();
	}

	public ClassArrayConverter(ConvertBean convertBean) {
		this.convertBean = convertBean;
		converterManagerBean.register(Class[].class, this);
	}

	@Override
	protected Class<?>[] createArray(int length) {
		return new Class[length];
	}

	@Override
	protected String[] convertStringToArray(String value) {
		String[] strings = StringUtil.splitc(value, NUMBER_DELIMITERS);

		int count = 0;

		for (int i = 0; i < strings.length; i++) {
			strings[count] = strings[i].trim();
			if (strings[count].length() == 0) {
				continue;
			}

			if (!strings[count].startsWith(StringPool.Symbol.HASH)) {
				count++;
			}
		}

		if (count != strings.length) {
			return ArrayUtil.subarray(strings, 0, count);
		}

		return strings;
	}

}