package api;

import java.text.DecimalFormat;

public class DecimalFormatExam {

	public static void main(String[] args) {
		double num = 1234567.89;
		DecimalFormat df = new DecimalFormat("#,###.0");   //소수점 한자리 수만 나타내라~
		//String str = df.format(num);
		//System.out.println(df.format(num));
		//System.out.println(str);
		
		DecimalFormat df2 = new DecimalFormat("000");
		
		for(int i = 0; i < 100; i++) {
			System.out.println(df2.format(i + 1)); 
			//+1 을 안해주면 000부터 099까지만 나온다. +1을 해주면 001부터 100까지 나옴!
		}
	}

}
