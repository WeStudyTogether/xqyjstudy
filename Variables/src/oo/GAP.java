package oo;
import java.text.DecimalFormat;

public class GAP {
    public static void main(String args[]) {
    	int index = 0;
    	float gradesum = 0;
    	float countcredit = 0;
    	float grade = 0;
    	float gap = 0;
                if(args.length==0){
                System.out.println("java GPA grade1 credit1 grade2 credit2 ......calculates the GPA.");
                }
                else{
    	while(index < args.length) {
    			float score = Float.parseFloat(args[index]);
    			if(grade>=95)
    				grade = 4.0f;
    			else if (score>=90)
    				grade = 3.5f;
    			else if (score>=85)
    				grade = 3.0f;
    			else if (score>=80)
    				grade = 2.6f;
    			else if (score>=75)
    				grade = 2.2f;
    			else if (score>=70)
    				grade = 1.8f;
    			else if (score>=65)
    				grade = 1.2f;
    			else if (score>=60)
    				grade = 1.0f;
    			else
    				grade = 0;
    			float credit = Float.parseFloat(args[index + 1]);
    			gradesum = gradesum + grade*credit;	
    			countcredit = countcredit + credit;	
    		                index = index + 2;
    	}
     gap = gradesum / countcredit;
     DecimalFormat df2 = new DecimalFormat("0.00");
     System.out.println("Your GAP is " + df2.format(gap));
       }
    }
}