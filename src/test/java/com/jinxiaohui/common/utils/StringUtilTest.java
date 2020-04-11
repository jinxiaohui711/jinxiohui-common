package com.jinxiaohui.common.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.jinixaohui.domain.Person;

public class StringUtilTest {

	@Test
	public void TESTHASLENGTH() {
		String src =null;
		boolean hasLength = StringUtil.hasLength(src);
		System.out.println(hasLength);
	}

	@Test
	public void testHasText() {
		String src = " ";
		boolean hasText = StringUtil.hasText(src);
		System.out.println(hasText);
	}

	@Test
	public void testRandomChineseString() {
		String randomChineseString = StringUtil.randomChineseString(100);
		System.out.println(randomChineseString);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}
	@Test
	public void testPerson() throws ParseException {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 10);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < 100; i++) {
			Date date = DateUtil.randomDate(c.getTime(), new Date());
			String format = sdf.format(date);
			Person person = new Person(StringUtil.generateChineseName(), RandomUtil.random(1, 120), 
					StringUtil.randomChineseString(140),sdf.parse(format));
			System.out.println(person);
		}
	}
	
	@Test
	public void testIsPhone() {
		boolean phone = StringUtil.isPhone("13711111111");
		System.out.println(phone);
	}
	@Test
	public void testIsEmail() {
		boolean email = StringUtil.isEmail("1823845989@qq.com");
		System.out.println(email);
	}
	@Test
	public void testIsNumber() {
		boolean number = StringUtil.isNumber("-12");
		System.out.println(number);
	}
}
