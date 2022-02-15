package api;

import java.util.regex.Pattern;

public class PatternExam {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-8654-3420";
		
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}
	}

}
