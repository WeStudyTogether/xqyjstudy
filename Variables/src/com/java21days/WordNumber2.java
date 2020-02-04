package com.java21days;
//这个我不太懂。而且我用return会报错，因为他说void这是没有返回值的，所以我改了，总之就是不太明白
public class WordNumber2 {
	public static void main(String[] arguments) {
		if (arguments.length > 0) {
			  long num = 0;
				  num = Integer.parseInt(arguements[0]);
switch (num) {
  case "one" :
	  num = 1L;
      break;
  case  "two":
	  num = 2L;
	  break;
  case "three":
	  num = 3L;
      break;
  case " four":
	  num = 4L;
	  break;
  case "five":
	  num = 5L;
	  break;
  case "six":
	  num = 6L;
	  break;
  case "seven":
	  num = 7L;
	  break;
  case "eight":
	  num = 8L;
	  break;
  case "nine":
	  num = 9L;
	  break;
  case "ten":
	  num = 10L;
	  break;
	  System.out.println("the number is :" + num);
	  default:
		  
}
