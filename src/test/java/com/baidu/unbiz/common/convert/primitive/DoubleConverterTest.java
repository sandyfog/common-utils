package com.baidu.unbiz.common.convert.primitive;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月22日 下午2:39:34
 */
public class DoubleConverterTest {

    @Test
    public void toConvert() {
        DoubleConverter doubleConverter = new DoubleConverter();

        assertEquals(Double.valueOf(1), doubleConverter.toConvert(Integer.valueOf(1)));
        assertEquals(Double.valueOf(1.73), doubleConverter.toConvert(Double.valueOf(1.73D)));
        assertEquals(Double.valueOf(1.73), doubleConverter.toConvert("1.73"));
        assertEquals(Double.valueOf(1.73), doubleConverter.toConvert(" 1.73 "));
        assertEquals(Double.valueOf(1.73), doubleConverter.toConvert(" +1.73 "));
        assertEquals(Double.valueOf(-1.73), doubleConverter.toConvert(" -1.73 "));
        assertEquals(Double.valueOf(1.73), doubleConverter.toConvert(new BigDecimal("1.73")));

    }
}
