/**
 * 
 */
package com.baidu.unbiz.common.convert.primitive;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月22日 下午2:44:44
 */
public class IntegerConverterTest {

	@Test
	public void toConvert() {
		IntegerConverter integerConverter = new IntegerConverter();

		assertEquals(Integer.valueOf(1),
				integerConverter.toConvert(Integer.valueOf(1)));
		assertEquals(Integer.valueOf(1),
				integerConverter.toConvert(Short.valueOf((short) 1)));
		assertEquals(Integer.valueOf(1),
				integerConverter.toConvert(Double.valueOf(1.0D)));
		assertEquals(Integer.valueOf(1), integerConverter.toConvert("1"));
		assertEquals(Integer.valueOf(1), integerConverter.toConvert(" 1 "));

		assertEquals(Integer.valueOf(1), integerConverter.toConvert(" +1 "));
		assertEquals(Integer.valueOf(-1), integerConverter.toConvert(" -1 "));
		assertEquals(Integer.valueOf(2147483647),
				integerConverter.toConvert(" +2147483647 "));
		assertEquals(Integer.valueOf(-2147483648),
				integerConverter.toConvert(" -2147483648 "));

	}
}
