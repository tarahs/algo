package com.interview.algorithms;

public class Palindrome {

	static String inputText = "MADAM";
	static int inputNum = 19867891;

	public static void main( String[] args )
	{

		System.out.println("is palindrome for " + inputText + " is " + isTextPalindrome());
		System.out.println("Reverse number of " + inputNum + " is " + reversNum());
		System.out.println("is palindrome for " + inputNum + " is " + isNumPalindrome());
        System.out.println(reverseString("Tara"));
    }

	/**
	 * Is Text Palindrome
	 * 
	 * @return
	 */
	public static Boolean isTextPalindrome()
	{
		int length = inputText.length();
		int firstIndex = 0;
		int lastIndex = length - 1;
		while( lastIndex > firstIndex )
		{
			if( inputText.charAt(firstIndex) != inputText.charAt(lastIndex) )
				return false;
			firstIndex++;
			lastIndex--;
		}
		return true;
	}

	/**
	 * Is number Palindrome
	 * 
	 * @return
	 */
	public static Boolean isNumPalindrome()
	{
		if( inputNum == reversNum() )
			return true;
		else
			return false;
	}

	/**
	 * Reversing a Number
	 * 
	 * @return
	 */
	public static int reversNum()
	{
		int n = inputNum;
		int reverse = 0;
		while( n > 0 )
		{
			reverse = reverse * 10 + n % 10;
			n = n / 10;
		}

		return reverse;

	}

	public static String reverseString(String s){

	    int l=0;
	    int h=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
	    while(l<h){

            char cur = sb.charAt(l);
            char end = sb.charAt(h);

            sb.setCharAt(l++, end);
            sb.setCharAt(h--, cur);

        }
        return sb.toString();
    }



}
