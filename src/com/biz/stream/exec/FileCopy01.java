package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class FileCopy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imgSrcFile="src/com/biz/stream/2019 (3).png";
		String imgCopyPath="src/com/biz/stream/";
		Random rnd=new Random();
		
		/*
		 * 인터페이스와 기능이 비슷한 추상클래스
		 */
		InputStream is=null;
		OutputStream os=null;
		try {
			is=new FileInputStream(imgSrcFile); //원본파일 오픈
			imgCopyPath+=Math.abs(rnd.nextInt())+".png";//랜덤 파일이름 생성
			os=new FileOutputStream(imgCopyPath);
			
			byte[] bytes=new byte[1024];//한번에 파일을 읽어서 복사할 용량.
			while(true) {
				/*
				 * FileInputStream의 read() method에 byte 배열을 매개변수로
				 * 전달을 하면 파일에서 읽은 내용(data)을 byte 배열에 담아 전달을 하고
				 * byte 배열에 담은 데이터 개수를 return 해준다.
				 */
				int length=is.read(bytes);
				if(length<1)break;
				os.write(bytes);
			}
			is.close();
			os.close();
			System.out.println("File copy Complete!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
