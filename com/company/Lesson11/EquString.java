package com.company.Lesson11;

public class EquString {
    public static void main(String[] args) {
        String str1 = "I Like Java!!!";
        String str2 = "I Hate Java!!!";
        String str3 = "I Like Java.";
        String str4 = "I Like a Boss!!!";
        String str5 = "I Like.";
        beg(str1);
        end(str1);
        beg(str2);
        end(str2);
        beg(str3);
        end(str3);
        beg(str4);
        end(str4);
        beg(str5);
        end(str5);
        last(str1);
        last(str2);
        last(str3);
        last(str4);
        last(str5);
        System.out.println(str1.indexOf("Java"));
        System.out.println(str1.lastIndexOf("Java"));
        str5=str1.replace("a","o" );
        System.out.println(str5);
        str5=str1.toLowerCase();
        System.out.println((str5));
        str5=str1.toUpperCase();
        System.out.println(str5);
            }
    public static void beg(String str1){
        System.out.print(str1.startsWith("I Like") +"\t");
        }
    public static void end(String str1){
        System.out.println (str1.endsWith("!!!")+"\t");
    }
    public static void last(String str){
        System.out.println(str.charAt((str.length()-1)));
    }
    public static subs(String str){
        String i =  "Java" ;
        str1.indexOf("Java")

    }
}

