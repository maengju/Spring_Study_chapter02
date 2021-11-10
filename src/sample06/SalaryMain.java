package sample06;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SalaryMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SalaryMain salaryMain = context.getBean("salaryMain",SalaryMain.class);
		salaryMain.menu(context);
		System.out.println();
		System.out.println("*****EXIT*****");
	}

	private void menu(ApplicationContext context) {
		Scanner scan = new Scanner(System.in);
		Salary salary=null;
		int num=0;
		
		while (true) {
			System.out.println();
			System.out.println("**************");
			System.out.println("   1. 입력");
			System.out.println("   2. 출력");
			System.out.println("   3. 종료");
			System.out.println("**************");
			System.out.print("번호 입력 : ");

			num = scan.nextInt();

			if (num == 3)
				break;

			if (num == 1) {
				salary = context.getBean("salaryInsert", Salary.class);
			} else if (num == 2) {
				salary = context.getBean("salaryPrintAll", Salary.class);
			} 
			
			salary.execute(); // 호출
			
		} // while
	}

}
