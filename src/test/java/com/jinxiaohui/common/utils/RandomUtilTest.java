package com.jinxiaohui.common.utils;


import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int random = RandomUtil.random(1, 3);
		System.out.println(random);
	}

	@Test
	public void testSubRandom() {
		int[] subRandom = RandomUtil.subRandom(1, 10, 3);
		for (int i : subRandom) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char randomCharacter = RandomUtil.randomCharacter();
		System.out.println(randomCharacter);
	}

	@Test
	public void testRandomString() {
	String randomString = RandomUtil.randomString(4);
	System.out.println(randomString);
	}

	
}
