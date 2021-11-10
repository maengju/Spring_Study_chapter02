package sample06;

import java.util.List;

import lombok.Setter;

public class SalaryPrintAll implements Salary {
	@Setter
	private List<SalaryDTO> salaryList;
	
	@Override
	public void execute() {
		System.out.println("이름\t\t직급\t\t기본급\t\t수당\t\t세율\t\t월급\t\t");
		for(SalaryDTO salaryDTO : salaryList) {
			System.out.println(salaryDTO);
		}
	}

}
