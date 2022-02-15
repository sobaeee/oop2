package api;

public class StringToPrimitiveValueExam {

	public static void main(String[] args) {
		String number = "10";
		int value1 = Integer.parseInt(number); //언박싱
		Integer intValue = value1; // 자동 박싱
		//박싱과 언박싱의 순서는 상관이 없음.
		System.out.println(intValue);
		System.out.println(intValue.MAX_VALUE);
		System.out.println(intValue.MIN_VALUE);
		//MAX_VALUE와 MIN_VALUE를 쓰면 실제 그 데이터타입이 표현할 수 있는 숫자의 범위 중 가장작은 숫자와가장 큰 숫자 값이 할당 된다.
	}

}
