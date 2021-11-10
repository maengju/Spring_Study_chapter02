package sample03;

import java.util.Scanner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SungJukImpl implements SungJuk {
	private SungJukDTO sungJukDTO;

	
//	public SungJukImpl(SungJukDTO sungJukDTO) {
//		super();
//		this.sungJukDTO = sungJukDTO;
//	} @AllArgsConstructor로 잡으면 지워도댐
	

	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath());
	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot()/3.0);
		

	}

	@Override
	public void display() {
		System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t");
		System.out.println(sungJukDTO);

	}

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		sungJukDTO.setName(scan.next());
		System.out.print("국어 점수 입력 : ");
		sungJukDTO.setKor(scan.nextInt());
		System.out.print("영어 점수 입력 : ");
		sungJukDTO.setEng(scan.nextInt());
		System.out.print("수학 점수 입력 : ");
		sungJukDTO.setMath(scan.nextInt());
		calcTot();
		calcAvg();
		display();
	}

}
