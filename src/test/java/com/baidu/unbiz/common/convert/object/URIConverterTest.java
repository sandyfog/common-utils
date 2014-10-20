/**
 * 
 */
package com.baidu.unbiz.common.convert.object;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.net.URI;

import org.junit.Test;

import com.baidu.unbiz.common.convert.object.URIConverter;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月22日 下午3:13:38
 */
public class URIConverterTest {

    @Test
    public void toConvert() {
        URIConverter uriConverter = new URIConverter();

        File f = new File("/folder/file.ext");
        URI uri = uriConverter.toConvert(f);
        assertNotNull(uri);
    }

}
