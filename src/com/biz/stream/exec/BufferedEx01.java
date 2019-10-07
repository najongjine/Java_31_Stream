package com.biz.stream.exec;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imgFile="src/com/biz/stream/2019 (2).png";
		FileInputStream fs=null;
		BufferedInputStream buffer=null;
		/*
		 * BufferedInputStream:= FileInputSteam으로 open된 파일을 읽어서 buffer 메모리에 임시 저장을 하고
		 * read() method를 통해서 buffer로 부터 값을 읽는다.
		 */
		try {
			fs=new FileInputStream(imgFile);
			buffer=new BufferedInputStream(fs);
			
			byte[] bytes=new byte[32];
			buffer.read(bytes);
			for(int i=0;i<bytes.length;i++) {
				System.out.printf("%02X\n",bytes[i]);
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
