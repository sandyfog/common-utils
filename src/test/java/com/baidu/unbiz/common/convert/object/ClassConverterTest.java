/**
 * 
 */
package com.baidu.unbiz.common.convert.object;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月22日 下午2:20:47
 */
public class ClassConverterTest {

	@Test
	public void toConvert() {
		ClassConverter classConverter = new ClassConverter();

		assertEquals(String.class, classConverter.toConvert(String.class));
		assertEquals(Integer.class,
				classConverter.toConvert("java.lang.Integer"));

	}

}
