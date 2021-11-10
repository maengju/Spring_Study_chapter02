package sample06;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SalaryDTO {
	String name;
	String position;
	int base;
	int extra;
	double taxRate;
	int salary;
	
	@Override
	public String toString() {
		
		return name+"\t\t"+position+"\t\t"+base+"\t\t"+extra+"\t\t"+((int)(taxRate*100))+"%\t\t"+salary;
	}
}
