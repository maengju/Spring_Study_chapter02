package sample05;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Setter;

public class SungJukInput implements SungJuk {
	@Setter
	private SungJukDTO2 sungJukDTO2;
	
	@Setter
	private List<SungJukDTO2> list;
	
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("국어 점수 입력 : ");
		int kor =scan.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng =scan.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = scan.nextInt();
		
		int tot = kor+eng+math;
		double avg = tot/3.0;
		
		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);
		
		list.add(sungJukDTO2);
		
		System.out.println(name+"님의 데이터를 입력 하였습니다.");
	}

}
