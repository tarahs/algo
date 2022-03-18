package com.interview.algorithms;

/**
 * Created by tara on 2/5/17.
 */
public class ReplaceNumByChar {

    public static void main(String[] args){
        char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String num = "1123";
        StringBuilder resString = new StringBuilder();
        for(int i=0;i<num.length();i++){
            int number = Integer.parseInt(num.substring(i,i+1));
            resString.append(alphabets[number-1]);
        }
        System.out.println(resString);


        for(int i=0;i<num.length();i++){
            String charOutput = "";
            for(int j = 0; j<num.length(); j++){
                int number = Integer.parseInt(num.substring(i,i+1));
                charOutput = charOutput+alphabets[number-1];
            }
        }
    }
}
