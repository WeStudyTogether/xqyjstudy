package ooweek4;

public class VariableScope {
   
	
    //calssVariableName is a class variableName.The scope is whole class
	static public String classVariableName = "�����";
	
	//instanceVariableName's scope is the whole class
	private int instanceVariableName = 0;
	
	//intParamter's scope is the whole body of oneMethod method
	public void oneMethod(int intParameter) {
		//local variable temp's scope is the body of method
		int temp = 5;
		if(intParameter > temp) {
			
			//  It is not allowed to declaring variables with the same name in different
			//int temp = 1;
			System.out.println("�����ڲ����Է��ʾֲ��������ֲ�����temp = " + temp);
			instanceVariableName = instanceVariableName + intParameter;				
			}
		}
	
	public void anotherMethod() {
		System.out.println("�������" + classVariableName);
		System.out.println("ʵ������ instanceVariableName = " + instanceVariableName);
	}
	
	public static void main(String[] args) {
		//create a VairableScope object
		//The JVM loads the VariableScope class
		VariableScope object1 = new VariableScope();
		
		//You can access variableScope via the name of class 
		System.out.println("ʹ����������" + VariableScope.classVariableName);
		System.out.println("ʹ�ö���������" + object1.classVariableName);
		
		//object1�����ʵ������instancevariable1,2's life cycle begin
		object1.oneMethod(6);
		object1.anotherMethod();	
	}		
}
