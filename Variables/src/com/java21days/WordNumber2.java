package com.java21days;
//����Ҳ�̫������������return�ᱨ����Ϊ��˵void����û�з���ֵ�ģ������Ҹ��ˣ���֮���ǲ�̫����
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
