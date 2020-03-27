package com.jinxiaohui.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandomDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		c.set(2010, 1, 12);
		Date randomDate = DateUtil.randomDate(c.getTime(), new Date());
		System.out.println(sdf.format(randomDate));
	}

	@Test
	public void testGetInitMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2010, 1, 12);
		Date initMonth = DateUtil.getInitMonth(calendar.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(initMonth));
	}
	@Test
	public void testGetEndMonth() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date endMonth = DateUtil.getEndMonth(new Date());
		System.out.println(sdf.format(endMonth));
	}

	@Test
	public void testGetAgeByBirthday() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2010, 1, 12);
		int ageByBirthday = DateUtil.getAgeByBirthday(calendar.getTime());
		System.out.println(ageByBirthday);
	}
}
