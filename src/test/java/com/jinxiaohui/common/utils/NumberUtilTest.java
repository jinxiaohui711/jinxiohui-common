package com.jinxiaohui.common.utils;
import org.junit.Test;

public class NumberUtilTest {

	@Test
	public void test() {
		int percent = NumberUtil.getPercent(51, 68);
		System.out.println(percent);
	}

}
