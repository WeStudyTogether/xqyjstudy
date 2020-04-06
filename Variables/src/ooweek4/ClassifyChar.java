package ooweek4;

public class ClassifyChar {
    public static void main(String[] args) {
    	if (args.length == 0 || args[0].length() > 15 ) {
    		System.out.println("此程序使用类Character的一些方法来判别");
    		System.out.println("输入的不多于15个命令行参数各自的类别");
    		System.exit(0);
    	}
    	
    	System.out.println();
    	System.out.println("位置          字符           类别");
    	System.out.println("----  -----  -----");
    	System.out.println();
    	
    	String text = args[0];
    	
    	for(int i = 0; i < text.length(); i++) {
    		
    		String positionText = Integer.toString(i);
    		for (int j = positionText.length(); j < 2; j++)
    			positionText = " " + positionText;
    		System.out.print("     " + positionText);
    		
    		char x = text.charAt(i);
    		System.out.print("         " + x + "         ");
    		
    		if(Character.isDigit(x))
    			System.out.println("数字");
    		else if (Character.isUpperCase(x))
    			System.out.println("大写字母");
    		else 
    			System.out.println("非字符或数字字符");
    	}
    }
}
