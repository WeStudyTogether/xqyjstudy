package oo;

//SwitchWithoutBreak.java
//Demonstrates a switch selection structure
//without break statements

public class SwitchWithoutBreak  {
public static void main(String[] args)  {
   for ( int i = 0; i < 4; i++ )  {
      switch ( i ) {
         case 3:
            System.out.print(" 3");
         case 2:
            System.out.print(" 2");
         case 1:
            System.out.print(" 1");
         default:  // case 0:
            System.out.print(" 0");
      }  // switch i
      System.out.println("");
   }  // for i
}  // method main(String[])
}  // class SwitchWithoutBreak