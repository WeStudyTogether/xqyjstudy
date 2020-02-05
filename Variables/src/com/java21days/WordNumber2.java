package com.java21days;
//����Ҳ�̫������������return�ᱨ����Ϊ��˵void����û�з���ֵ�ģ������Ҹ��ˣ���֮���ǲ�̫����
public class WordNumber2 {
    
    public long oneToTen(String nums) {
        long num = 0L;
        switch (nums) {
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
        default:
            System.out.println("the default is :" + num);
        }
        return num;
    }
    
	public static void main(String[] arguments) {
	    WordNumber2 wordNumber2 = new WordNumber2();
		if (arguments.length > 0) {
		    System.out.println(wordNumber2.oneToTen(arguments[0]));
		} else {
		    System.out.println("请在控制台输入参数");
		}
	}
}
