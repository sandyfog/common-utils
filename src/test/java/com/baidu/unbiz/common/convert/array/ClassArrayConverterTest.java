/**
 * 
 */
package com.baidu.unbiz.common.convert.array;

import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrc;

import org.junit.Assert;
import org.junit.Test;

import com.baidu.unbiz.common.convert.ConverterManager;
import com.baidu.unbiz.common.convert.TypeConverter;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月22日 下午2:17:48
 */
public class ClassArrayConverterTest {

	@Test
	public void toConvert() {
		@SuppressWarnings({ "unchecked" })
		TypeConverter<Class<?>[]> classArrayConverter = (TypeConverter<Class<?>[]>) ConverterManager
				.lookup(Class[].class);

		Assert.assertArrayEquals(arrc(String.class),
				classArrayConverter.toConvert(String.class));
		Assert.assertArrayEquals(arrc(String.class, Integer.class),
				classArrayConverter
						.toConvert(arrc(String.class, Integer.class)));
		Assert.assertArrayEquals(arrc(Integer.class),
				classArrayConverter.toConvert("java.lang.Integer"));
		Assert.assertArrayEquals(arrc(Integer.class, String.class),
				classArrayConverter
						.toConvert("java.lang.Integer,    java.lang.String"));

		Assert.assertArrayEquals(
				arrc(Integer.class, String.class),
				classArrayConverter
						.toConvert("java.lang.Integer\n\n  java.lang.String  \n\n#java.lang.Long"));
	}

	@Test
	public void testMoreClassArrayConverter() {
		Assert.assertArrayEquals(arrc(String.class), ConverterManager
				.convertType("java.lang.String,\n\r", Class[].class));
		Assert.assertArrayEquals(arrc(String.class), ConverterManager
				.convertType("java.lang.String,\r\n", Class[].class));
		Assert.assertArrayEquals(arrc(String.class), ConverterManager
				.convertType("java.lang.String,\r\r", Class[].class));
		Assert.assertArrayEquals(arrc(String.class), ConverterManager
				.convertType("java.lang.String,\r\r\r", Class[].class));
		Assert.assertArrayEquals(arrc(String.class), ConverterManager
				.convertType("java.lang.String,\n\n\n", Class[].class));
		Assert.assertArrayEquals(arrc(String.class), ConverterManager
				.convertType("java.lang.String,\n", Class[].class));
		Assert.assertArrayEquals(arrc(String.class), ConverterManager
				.convertType("java.lang.String,\r", Class[].class));

		Assert.assertArrayEquals(arrc(String.class), ConverterManager
				.convertType("java.lang.String,\r\n\r", Class[].class));
		Assert.assertArrayEquals(arrc(String.class), ConverterManager
				.convertType("\r\njava.lang.String,\r\n", Class[].class));
	}

}