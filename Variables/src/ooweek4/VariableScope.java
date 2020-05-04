package ooweek4;

public class VariableScope {
   
	
    //calssVariableName is a class variableName.The scope is whole class
	static public String classVariableName = "类变量";
	
	//instanceVariableName's scope is the whole class
	private int instanceVariableName = 0;
	
	//intParamter's scope is the whole body of oneMethod method
	public void oneMethod(int intParameter) {
		//local variable temp's scope is the body of method
		int temp = 5;
		if(intParameter > temp) {
			
			//  It is not allowed to declaring variables with the same name in different
			//int temp = 1;
			System.out.println("方法内部可以访问局部变量，局部变量temp = " + temp);
			instanceVariableName = instanceVariableName + intParameter;				
			}
		}
	
	public void anotherMethod() {
		System.out.println("类变量是" + classVariableName);
		System.out.println("实例变量 instanceVariableName = " + instanceVariableName);
	}
	
	public static void main(String[] args) {
		//create a VairableScope object
		//The JVM loads the VariableScope class
		VariableScope object1 = new VariableScope();
		
		//You can access variableScope via the name of class 
		System.out.println("使用类名访问" + VariableScope.classVariableName);
		System.out.println("使用对象名访问" + object1.classVariableName);
		
		//object1对象的实例变量instancevariable1,2's life cycle begin
		object1.oneMethod(6);
		object1.anotherMethod();	
	}		
}
