package com.dell.example;

/**
 * Created by 20304 on 2017/12/12.
 */
public class MatchingAlgorithmTest {
    public static void main(String[] args) {
        String a = "GoogleIsBetterThanBaiDu";
        String b = "Than";
        int test =  MatchingTest(a,b);
        System.out.println(test);
    }

    private static int MatchingTest(String S,String T) {
       for(int i = 0; i < S.length(); i++)
       {
           int k = i;
           for(int j  = 0; j < T.length();j++)
           {
               if(S.charAt(k) != T.charAt(j))
               {
                   break;
               }
               else
               {
                   k++;
                   if(j == T.length()-1)
                   {
                       return i;
                   }
               }
           }
       }
       return -1;
    }
}