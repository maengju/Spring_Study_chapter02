package sample04;

import java.io.FileWriter;
import java.io.IOException;

//파일 출력
public class FileOutputter implements Outputter {
	private String filePath,fileName;
	
	
	
	public void setFilePath(String filePath) {
		System.out.println("2.setFilePath(String filePath)");
		this.filePath = filePath;
	}





	public void setFileName(String fileName) {
		System.out.println("3.setFileName(String fileName)");
		this.fileName = fileName;
	}





	@Override
	public void output(String message) {
		
		try {
			FileWriter fileWriter = new FileWriter(filePath+fileName);
			fileWriter.write(message);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
