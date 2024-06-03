package com.task.string;

public class Palindromestr {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		}
		if(s==rev) {
			System.out.println(s+" is palindrome ");
		}
		else {
			System.out.println(s+" is not palindrome");
		}

	}

}
