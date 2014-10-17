/**
 * 
 */
package com.baidu.unbiz.common.convert.array;

import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrb;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrd;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrf;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arri;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrl;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arro;
import static com.baidu.unbiz.common.convert.ConverterTestHelper.arrs;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.baidu.unbiz.common.convert.ConverterManager;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月22日 下午2:40:35
 */
public class FloatArrayConverterTest {

	@Test
	public void toConvert() {
		FloatArrayConverter floatArrayConverter = (FloatArrayConverter) ConverterManager.lookup(float[].class);

		assertEq(arrf((float) 1.73), floatArrayConverter.toConvert(Float.valueOf((float) 1.73)));
		assertEq(arrf((float) 1.73, (float) 10.22), floatArrayConverter.toConvert(arrf((float) 1.73, (float) 10.22)));
		assertEq(arrf((float) 1.73, (float) 10.22), floatArrayConverter.toConvert(arrd(1.73, 10.22)));
		assertEq(arrf((float) 1.73, (float) 10.22), floatArrayConverter.toConvert(arrf(1.73f, 10.22f)));
		assertEq(arrf((float) 1.0, (float) 7.0, (float) 3.0), floatArrayConverter.toConvert(arri(1, 7, 3)));
		assertEq(arrf((float) 1.0, (float) 7.0, (float) 3.0), floatArrayConverter.toConvert(arrl(1, 7, 3)));
		assertEq(arrf((float) 1.0, (float) 7.0, (float) 3.0), floatArrayConverter.toConvert(arrb(1, 7, 3)));
		assertEq(arrf((float) 1.0, (float) 7.0, (float) 3.0), floatArrayConverter.toConvert(arrs(1, 7, 3)));
		assertEq(arrf((float) 1.73, (float) 10.22), floatArrayConverter.toConvert(arrs("1.73", "10.22")));
		assertEq(arrf((float) 1.73, (float) 10.22), floatArrayConverter.toConvert(arrs(" 1.73 ", " 10.22 ")));
		assertEq(arrf((float) 1.73, 10), floatArrayConverter.toConvert(arro("1.73", 10)));
		assertEq(arrf((float) 1.73, 10), floatArrayConverter.toConvert("1.73 \n 10"));
	}

	private void assertEq(float[] arr1, float[] arr2) {
		assertEquals(arr1.length, arr2.length);
		for (int i = 0; i < arr1.length; i++) {
			assertEquals(arr1[i], arr2[i], 0.0001);
		}
	}

}
