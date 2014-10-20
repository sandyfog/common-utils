/**
 * 
 */
package com.baidu.unbiz.common.convert.primitive;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月22日 下午2:17:14
 */
public class CharacterConverterTest {

    @Test
    public void toConvert() {
        CharacterConverter characterConverter = new CharacterConverter();

        assertEquals(Character.valueOf((char) 1), characterConverter.toConvert(Character.valueOf((char) 1)));
        assertEquals(Character.valueOf((char) 1), characterConverter.toConvert(Integer.valueOf(1)));
        assertEquals(Character.valueOf((char) 1), characterConverter.toConvert(Short.valueOf((short) 1)));
        assertEquals(Character.valueOf((char) 1), characterConverter.toConvert(Double.valueOf(1.0D)));
        assertEquals(new Character('1'), characterConverter.toConvert("1"));

    }
}
