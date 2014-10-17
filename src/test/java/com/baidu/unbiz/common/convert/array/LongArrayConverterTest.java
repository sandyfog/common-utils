/**
 * 
 */
package com.baidu.unbiz.common.convert.array;

import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrd;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrf;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arri;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrl;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arro;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrs;

import org.junit.Assert;
import org.junit.Test;

import com.baidu.unbiz.common.convert.ConverterManager;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月22日 下午2:45:44
 */
public class LongArrayConverterTest {

	@Test
	public void toConvert() {
		LongArrayConverter longArrayConverter = (LongArrayConverter) ConverterManager
				.lookup(long[].class);

		Assert.assertArrayEquals(arrl(173),
				longArrayConverter.toConvert(Double.valueOf(173)));
		Assert.assertArrayEquals(arrl(173, 1022, 29929),
				longArrayConverter.toConvert(arrf(173, 1022, 29929)));
		Assert.assertArrayEquals(arrl(173, 1022, 29929),
				longArrayConverter.toConvert(arrd(173, 1022, 29929)));
		Assert.assertArrayEquals(arrl(173, 1022, 29929),
				longArrayConverter.toConvert(arri(173, 1022, 29929)));
		Assert.assertArrayEquals(arrl(173, 1022, 29929),
				longArrayConverter.toConvert(arrl(173, 1022, 29929)));
		Assert.assertArrayEquals(arrl(173, 1022),
				longArrayConverter.toConvert(arrs("173", "1022")));
		Assert.assertArrayEquals(arrl(173, 1022),
				longArrayConverter.toConvert(arro("173", Long.valueOf(1022))));

		Assert.assertArrayEquals(arrl(111, 777, 333),
				longArrayConverter.toConvert(arrs("111", "   777     ", "333")));
		Assert.assertArrayEquals(arrl(111, 777, 333),
				longArrayConverter.toConvert("111,  777,  333"));
	}

}