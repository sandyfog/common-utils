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
 * @version create on 2014年9月22日 下午3:07:38
 */
public class StringArrayConverterTest {

    @Test
    public void toConvert() {
        StringArrayConverter stringArrayConverter = (StringArrayConverter) ConverterManager.lookup(String[].class);

        Assert.assertArrayEquals(arrs(Double.class.getName()), stringArrayConverter.toConvert(Double.class));
        Assert.assertArrayEquals(arrs("173"), stringArrayConverter.toConvert("173"));
        Assert.assertArrayEquals(arrs("173", "1022"), stringArrayConverter.toConvert("173,1022"));
        Assert.assertArrayEquals(arrs("173", " 1022"), stringArrayConverter.toConvert("173, 1022"));
        Assert.assertArrayEquals(arrs("173", "1022"), stringArrayConverter.toConvert(arrs("173", "1022")));
        Assert.assertArrayEquals(arrs("1", "7", "3"), stringArrayConverter.toConvert(arri(1, 7, 3)));
        Assert.assertArrayEquals(arrs("1", "7", "3"), stringArrayConverter.toConvert(arrl(1, 7, 3)));
        Assert.assertArrayEquals(arrs("1.0", "7.0", "3.0"), stringArrayConverter.toConvert(arrd(1, 7, 3)));
        Assert.assertArrayEquals(arrs("1.0", "7.0", "3.0"), stringArrayConverter.toConvert(arrf(1, 7, 3)));
        Assert.assertArrayEquals(arrs("173", "true"), stringArrayConverter.toConvert(arro("173", Boolean.TRUE)));
        Assert.assertArrayEquals(arrs("173", "java.lang.String"),
                stringArrayConverter.toConvert(arro("173", String.class)));
    }

}
