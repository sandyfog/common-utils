/**
 * 
 */
package com.baidu.unbiz.common.convert.object;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.baidu.unbiz.common.convert.object.BigDecimalConverter;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月22日 下午1:45:34
 */
public class BigDecimalConverterTest {

	@Test
	public void toConvert() {
		BigDecimalConverter bigDecimalConverter = new BigDecimalConverter();

		assertEquals(new BigDecimal("1.2345"),
				bigDecimalConverter.toConvert(new BigDecimal("1.2345")));
		assertEquals(new BigDecimal("1.2345"),
				bigDecimalConverter.toConvert("1.2345"));
		assertEquals(new BigDecimal("1.2345"),
				bigDecimalConverter.toConvert(" 1.2345 "));
		assertEquals(new BigDecimal("1.2345"),
				bigDecimalConverter.toConvert(Double.valueOf(1.2345D)));
		assertEquals(new BigDecimal("123456789"),
				bigDecimalConverter.toConvert(Long.valueOf(123456789)));
	}

}
