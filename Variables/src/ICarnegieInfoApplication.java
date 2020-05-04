import  java.io.*;
import  java.util.*;

import oo.MyException;

public class ICarnegieInfoApplication  {

	private static BufferedReader  stdIn =
		new  BufferedReader(new  InputStreamReader(System.in));
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	public static void main(String[]  args) throws IOException  {

		ICarnegieInfo companyInfo = ICarnegieInfo.getInstance();

		int  choice = getChoice();

		while (choice != 0)  {

			if (choice == 1)  {
				stdOut.println(companyInfo.getName());
			} else if (choice == 2)  {
				stdOut.println(companyInfo.getAddress());
			} else if (choice == 3)  {
				stdOut.println(companyInfo.getTelephone());
			} else if (choice == 4)  {
				stdOut.println(companyInfo.getEmail());
			} else if (choice == 5)  {
				stdOut.println(companyInfo.getUrl());
			}

			choice = getChoice();
		}
	}

	private static int  getChoice() {
		System.out.println("0 - quit");
		System.out.println("1 – Display name");
		System.out.println("2 – Display address");
		System.out.println("3 – Display telephone");
		System.out.println("4 – Display email");
		System.out.println("5 – Display URL");
		System.out.println("choice>");
		Scanner choice=new Scanner(System.in);
		System.out.printf("请输入你的选择：");
		String Choice = choice.next();
		int Num ;
		try {
		    Num = Integer.parseInt(Choice);
		    if (Num < 0 || Num > 5) {
		        throw new MyException();
		    }
		    return Num;
		} catch (NumberFormatException e) {
            stdErr.println(Choice);
            return 7;
        } catch (MyException e) {
            stdErr.println("输入数字不在范围内");
            return 7;
        }
	}
}