package com.jinxiaohui.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testReadFileToList() {
		InputStream inputStream = this.getClass().getResourceAsStream("/data3.txt");
		try {
			List<String> list = StreamUtil.readFileToList(inputStream);
			for (String string : list) {
				System.out.println(string);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
