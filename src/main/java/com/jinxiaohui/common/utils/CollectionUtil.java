package com.jinxiaohui.common.utils;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
    * @ClassName: CollectionUtil
    * @Description: TODO(集合处理类)
    * @author 靳晓辉
    * @date 2020年3月26日
    *
 */
public class CollectionUtil {
		/**
		 * 
		    * @Title: hasValue
		    * @Description: TODO(空为true)
		    * @param @return    参数
		    * @return boolean    返回类型
		    * @throws
		 */
		//方法1：判断是否有值，空引号(空白字符串)也算没值 (5分)
		public static boolean isEmpey(Collection<?> collection){
			return collection == null || collection.isEmpty();
		}
	
	
		
	
	
	
}
