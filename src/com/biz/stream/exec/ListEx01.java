package com.biz.stream.exec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.biz.stream.domain.BookVO;

public class ListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String objSaveFile="src/com/biz/stream/bookList.dat";
		List<BookVO> bookList=new ArrayList<BookVO>();
		BookVO bookVO=new BookVO();
		bookVO.title="Java";
		bookVO.comp="명진출판사";
		bookVO.price=5000;
		bookList.add(bookVO);
		
		bookVO=new BookVO();
		bookVO.title="오라클";
		bookVO.comp="생능출판사";
		bookVO.price=15000;
		bookList.add(bookVO);
		
		bookVO=new BookVO();
		bookVO.title="Do it Java";
		bookVO.comp="이지퍼블";
		bookVO.price=25000;
		bookList.add(bookVO);
		
		/*
		 * 인터페이스와 유사한 추상클래스를 사용하여 선언.
		 */
		OutputStream os=null;
		ObjectOutput obj=null;
		
		try {
			/*
			 * 파일을 기록하기위한 상태로 open
			 */
			os=new FileOutputStream(objSaveFile);
			/*
			 * app 내에서 사용되는 변수, 객체 값을 파일로 저장하기위한 보조 stream을 연결
			 */
			obj=new ObjectOutputStream(os);
			
			/*
			 * 자바 내부 변수(bookList)를 파일로 기록
			 */
			obj.writeObject(bookList);
			obj.flush();
			obj.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
