package sample03;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SungJukDTO {
	String name;
	int kor,eng,math,tot;
	double avg;
	
	@Override
	public String toString() {
		
		return name+"\t\t"+kor+"\t\t"+eng+"\t\t"+math+"\t\t"+tot+"\t\t"+String.format("%.2f", avg);
	}
	
}
