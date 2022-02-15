package common;

public class JavaUtil {
	
	/**
	 * round 함수(반올림)
	 * @param double 실수값
	 * @param int 소수점 자리수
	 * @return double
	 */
	
	public static double round(double d, int i) {
		//					Math.round(Math.random()*1000)/1000.
		return Math.round(d*Math.pow(10, i))/Math.pow(10, i);
						// ↑ 1번으로 실행. (실수에 10의 제곱~n제곱을 곱해줌. -> 정수로 만들어짐. /Math.pow(10, i) :실수 로 나눠줌 ->실수로 만듬
		//Math.pow 자체가 double로 리턴이 되어 1000. 과 같이 . 을 안찍어도 된다.
		//round -> 반올림
	}
	/**
	 * 문자열이 null일때 빈값으로 처리
	 * @param 문자열
	 * @return null 일 때 빈값 or null 아닐때 문자열 
	 */
	
	public static String nullToBlank(String s) {
		if(s == null){
			s = "";
		}
		return s;
	}
}
