package com.baidu.unbiz.common.convert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 */
public class EnumTest {

	public enum EnumSample {
		ONE, TWO
	}

	@Test
	public void testCastEnums() {
		EnumSample sample = ConverterManager.convertType("ONE", EnumSample.class);
		assertEquals(EnumSample.ONE, sample);
		sample = ConverterManager.convertType("TWO", EnumSample.class);
		assertEquals(EnumSample.TWO, sample);
	}

}