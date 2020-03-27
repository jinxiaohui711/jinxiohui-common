package com.jinxiaohui.common.utils;

import java.util.Calendar;
import java.util.Date;
/**
 * 
    * @ClassName: DateUtil
    * @Description: TODO(日期处理类)
    * @author 靳晓辉
    * @date 2020年3月27日
    *
 */
public class DateUtil {
	/**
	 * 
	    * @Title: randomDate
	    * @Description: TODO(随机产生一段时间内的日期)
	    * @param @param statDate
	    * @param @param endDate
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date randomDate(Date statDate,Date endDate) {
		long t1 = statDate.getTime();
		long t2 = endDate.getTime();
		if (t2<t1) {
			throw new RuntimeException("开始日期不能大于结束日期");
		}
		long t = (long) ((Math.random()*(t2-t1+1))+t1);
		Date date = new Date(t);
		return date;
	}
	/**
	 * 
	    * @Title: getInitMonth
	    * @Description: TODO(返回传入日期的月初)
	    * @param @param date
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date getInitMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	/**
	 * 
	    * @Title: getLastMonth
	    * @Description: TODO(返回传入日期的月末)
	    * @param @param date
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date getEndMonth(Date date) {
		//先初始化日历类
		Calendar c = Calendar.getInstance();
		c.setTime(date);//传入的值初始化日历类
		//让月份加1 变成月初  2010-12-12 00:00:00 再减去1秒
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());
		c.setTime(initMonth);//变成月初 再次初始化日历类
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	
	public static int getAgeByBirthday(Date date) {
		int age =0;
		Calendar c = Calendar.getInstance();//获取日历类 系统时间初始化
		//获取系统的年月日
		int s_year = c.get(Calendar.YEAR);
		int s_month = c.get(Calendar.MONTH);
		int s_day = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(date);//使用生日初始化日历类
		//获取生日的年月日
		int b_year = c.get(Calendar.YEAR);
		int b_month = c.get(Calendar.MONTH);
		int b_day = c.get(Calendar.DAY_OF_MONTH);
		if (s_year - b_year>0) {
			age = s_year-b_year;
			if (s_month-b_month<0) {
				age=age-1;//系统月份小于生日月份 年龄减1
			}else if (s_month-b_month==0) {
				if (s_day-b_day<0) {
					age=age-1;//如果系统月份与生日月份相等 但系统天小于生日天年龄减1
				}
			}
		}
		return age;
	}
}
