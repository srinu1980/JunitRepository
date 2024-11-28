package com.cts.junit5;

public class MyUtils {

	public static int add(int num1, int num2) {
		return num1 + num2;

	}

	public static StringBuffer reverse(String str) {

		StringBuffer sb = new StringBuffer(str);
		StringBuffer s = sb.reverse();

		return s;

	}
}
