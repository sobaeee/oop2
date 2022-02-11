package impl;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 캐스팅
 * 
 * @author smart20
 *
 */
public class Test {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Hi");
		al.add("JAVA");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();   //ob를 st으로 캐스팅을 사용해서 변환함
								//↑ob
			System.out.println(str);
		}

	}

}


//ArrayList<String> al = new ArrayList<String>();
//al.add("Hi");
//al.add("JAVA");
//Iterator<String> it = al.iterator();
//while (it.hasNext()) {
//	String str = it.next();
//<String>을 붙이면 it 앞에 (String)을 붙이지 않아도 String으로 변환되어 있다.