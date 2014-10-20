/**
 * 
 */
package com.baidu.unbiz.common.convert.object;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.net.URL;

import org.junit.Test;

import com.baidu.unbiz.common.convert.object.URLConverter;

public class URLConverterTest {

    @Test
    public void toConvert() {
        URLConverter urlConverter = new URLConverter();

        File f = new File("/folder/file.ext");
        URL url = urlConverter.toConvert(f);
        assertNotNull(url);
    }
}
