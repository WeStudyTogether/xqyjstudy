package oo;

public class NaturalNumber {
	public static void main(String[] args) 
	{
		if(args.length==0){
			System.out.println("��û�����������в�����");
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
			System.out.println("������Ĳ�������һ����Ȼ����");}
		else{
			System.out.println("������Ĳ�����һ����Ȼ����");}
	}
  }
}
