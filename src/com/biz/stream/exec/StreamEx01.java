package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamEx01 {

	public static void main(String[] args) {
		String imgFile="src/com/biz/stream/2019 (1).png";
		
		/*
		 * 파일을 byte단위로 읽을수 있는 클래스. 모든파일 읽기 가능.
		 */
		FileInputStream fs=null;
		try {
			fs=new FileInputStream(imgFile);
			int input=0;
			while(true) {
				input=fs.read();
				if(input==-1) {
					break;
				}
				System.out.printf("%02x\n",input); //16진수로 표현
				
			}
			fs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
