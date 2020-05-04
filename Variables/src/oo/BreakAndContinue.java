package oo;

//BreakAndContinue.java
//Demonstrates break and continue keywords

public class BreakAndContinue {
public static void main(String[] args) {
 for(int i = 0; i < 50; i++) {
   if(i == 25) break; // Out of for loop
   if(i % 9 != 0) continue; // Next iteration
   System.out.println(i);
 }
 int i = 0;
 // An "infinite loop":
 while(true) {
   i++;
   int j = i * 30;
   if(j == 777) break; // Out of loop
   if(i % 10 != 0) continue; // Top of loop
   System.out.println(i);
 }
}  //main
} // BreakAndContinue