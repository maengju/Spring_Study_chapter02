package sample06;

import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SalaryInsert implements Salary {
	@Setter
	private SalaryDTO salaryDTO;
	@Setter
	private List<SalaryDTO> salaryList;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("직급 입력 : ");
		String position =scan.next();
		System.out.print("기본급 입력 : ");
		int base =scan.nextInt();
		System.out.print("수당 입력 : ");
		int extra = scan.nextInt();
		
		int total = base+extra;
		double taxRate=0;
		
		if(total<=2000000) {
			taxRate=0.01;
		}else if(total<=4000000) {
			taxRate=0.02;
		}else taxRate=0.03;
		
		int salary = (int)(total-(total*taxRate));
		
		salaryDTO.setName(name);
		salaryDTO.setPosition(position);
		salaryDTO.setBase(base);
		salaryDTO.setExtra(extra);
		salaryDTO.setTaxRate(taxRate);
		salaryDTO.setSalary(salary);
		
		salaryList.add(salaryDTO);
		
		System.out.println(name+" "+position+"님의 월급 계산이 완료되었습니다.");
	}

}
