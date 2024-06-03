package com.task.string;

public class Nonrepeatchar {

	public static void main(String[] args) {
		String s = "amrutha".toLowerCase();
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;

				}
			}
			if (count == 1) {
				System.out.println(ch[i]);
				break;
			}
			count = 0;
		}

	}

}
