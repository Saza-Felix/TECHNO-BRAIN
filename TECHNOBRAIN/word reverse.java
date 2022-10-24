import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
         
        String str = "Techno Brain, empowering lives";
        System.out.println("Given an input string:" + str);
        //Write code to reverse the order of the words
        String result=Solution.reverseWords(str);
        System.out.println("Revered words: " + result);
    }
}
class Solution {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String ans ="";
        for(int i=words.length-1; i>=0; i--)
        {
            if (words[i] != " "){
                System.out.println(words[i]);
                ans+=words[i]+ " ";
            }
        }
        return ans;
    }
}