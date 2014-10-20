/**
 * 
 */
package com.baidu.unbiz.common.convert.primitive;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月22日 下午2:42:32
 */
public class FloatConverterTest {

    @Test
    public void toConvert() {
        FloatConverter floatConverter = new FloatConverter();

        assertEquals(Float.valueOf(1), floatConverter.toConvert(Integer.valueOf(1)));
        assertEquals(Float.valueOf((float) 1.73), floatConverter.toConvert(Double.valueOf(1.73D)));
        assertEquals(Float.valueOf((float) 1.73), floatConverter.toConvert("1.73"));
        assertEquals(Float.valueOf((float) 1.73), floatConverter.toConvert(" 1.73 "));
        assertEquals(Float.valueOf((float) 1.73), floatConverter.toConvert(" +1.73 "));
        assertEquals(Float.valueOf((float) -1.73), floatConverter.toConvert(" -1.73 "));
        assertEquals(Float.valueOf((float) 1.73), floatConverter.toConvert(new BigDecimal("1.73")));

    }
}
