/**
 * 
 */
package com.baidu.unbiz.common.convert.primitive;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月22日 下午2:04:16
 */
public class BooleanConverterTest {

	@Test
	public void toConvert() {
		BooleanConverter booleanConverter = new BooleanConverter();

		assertEquals(Boolean.TRUE, booleanConverter.toConvert(Boolean.TRUE));

		assertEquals(Boolean.TRUE, booleanConverter.toConvert("yes"));
		assertEquals(Boolean.TRUE, booleanConverter.toConvert(" yes "));
		assertEquals(Boolean.TRUE, booleanConverter.toConvert("YES"));
		assertEquals(Boolean.TRUE, booleanConverter.toConvert("y"));
		assertEquals(Boolean.TRUE, booleanConverter.toConvert("Y"));
		assertEquals(Boolean.TRUE, booleanConverter.toConvert("on"));
		assertEquals(Boolean.TRUE, booleanConverter.toConvert("ON"));
		assertEquals(Boolean.TRUE, booleanConverter.toConvert("1"));

		assertEquals(Boolean.FALSE, booleanConverter.toConvert("no"));
		assertEquals(Boolean.FALSE, booleanConverter.toConvert(" no "));
		assertEquals(Boolean.FALSE, booleanConverter.toConvert("NO"));
		assertEquals(Boolean.FALSE, booleanConverter.toConvert("n"));
		assertEquals(Boolean.FALSE, booleanConverter.toConvert("N"));
		assertEquals(Boolean.FALSE, booleanConverter.toConvert("off"));
		assertEquals(Boolean.FALSE, booleanConverter.toConvert("OFF"));
		assertEquals(Boolean.FALSE, booleanConverter.toConvert("0"));
	}
}
