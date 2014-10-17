package com.baidu.unbiz.common.convert;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.Test;

import com.baidu.unbiz.common.convert.object.FileConverter;

/**
 * 
 * @author <a href="mailto:xuchen06@baidu.com">xuc</a>
 * @version create on 2014年9月22日 下午3:12:26
 */
public class ConverterManagerTest {

	@Test
	public void testRegistration() {
		FileConverter fileTypeConverter = (FileConverter) ConverterManager
				.lookup(File.class);

		assertNotNull(fileTypeConverter);

	}
}
