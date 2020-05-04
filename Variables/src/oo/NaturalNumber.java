package oo;

public class NaturalNumber {
	public static void main(String[] args) 
	{
		if(args.length==0){
			System.out.println("你没有输入命令行参数。");
			return;
		}
		else{	

                        boolean nonNumber=false;
			String text=args[0];
			for(int i=0;i<text.length()&&!nonNumber;i++){
				char x=text.charAt(i);
				if(x>'9'||x<'0')
					nonNumber=true;
			}
		if(nonNumber){
			System.out.println("你输入的参数不是一个自然数。");}
		else{
			System.out.println("你输入的参数是一个自然数。");}
	}
  }
}
