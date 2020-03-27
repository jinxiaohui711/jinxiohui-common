package com.jinxiaohui.common.utils;
import java.util.ArrayList;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testHasValue() {
		ArrayList<Object> arrayList = new ArrayList<Object>();
		//arrayList.add("123");
		boolean hasValue = CollectionUtil.isEmpey(arrayList);
		System.out.println(hasValue);
	}

}
