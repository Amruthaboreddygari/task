package com.task.string;

public class Duplicatechar {

	public static void main(String[] args) {
		String s = "Amrutha".toLowerCase();
		String emp = "";
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;

				}
			}
			if (count == 1) {
				emp = emp.concat(ch[i] + "");
			}
			count = 0;

			
		}
		System.out.println(emp);

	}

}
