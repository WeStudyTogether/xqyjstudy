package ooweek4;

public class ClassifyChar {
    public static void main(String[] args) {
    	if (args.length == 0 || args[0].length() > 15 ) {
    		System.out.println("�˳���ʹ����Character��һЩ�������б�");
    		System.out.println("����Ĳ�����15�������в������Ե����");
    		System.exit(0);
    	}
    	
    	System.out.println();
    	System.out.println("λ��          �ַ�           ���");
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
    			System.out.println("����");
    		else if (Character.isUpperCase(x))
    			System.out.println("��д��ĸ");
    		else 
    			System.out.println("���ַ��������ַ�");
    	}
    }
}
