/**
 * 
 */
package com.baidu.unbiz.common.convert.object;

import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrb;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrc;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrs;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringConverterTest {

	@Test
	public void toConvert() {
		StringConverter stringConverter = new StringConverter();

		assertEquals("123", stringConverter.toConvert("123"));
		assertEquals("65,66", stringConverter.toConvert(arrb(65, 66)));
		// assertEquals("Ab", stringConverter.toConvert(arrc('A', 'b')));
		assertEquals("A,b", stringConverter.toConvert(arrc('A', 'b')));
		assertEquals("One,two", stringConverter.toConvert(arrs("One", "two")));
		assertEquals("123", stringConverter.toConvert(Integer.valueOf(123)));
		assertEquals("java.lang.String",
				stringConverter.toConvert(String.class));
	}
}
