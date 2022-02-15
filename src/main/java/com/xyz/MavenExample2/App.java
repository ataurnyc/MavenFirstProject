package com.xyz.MavenExample2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String []array;
    	
        String str1 = "Buffalo Bangla is the first Bengali Newspaper in Buffalo, NY. It's the main source of News in Bengal";
        
        array = str1.split("\\s");
        for(String s:array) {
        	System.out.println(s);
        }
        System.out.println(array.length);
        
    }
}
