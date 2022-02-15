package api;

import java.util.Arrays;

public class ArraysCopyExam {

	public static void main(String[] args) {
		char [] arr1 = {'J','A','V','A'};
		char [] arr2 = Arrays.copyOf(arr1, 5); //4를 넣으면 =>다 가져오겠다. 5를 넣으면 => 빈공간이 추가 된다. char 초기값은 '0' 
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
