package api;

public class ByteToStringExam {

	public static void main(String[] args) {
		                //H   e    l    l    o        J   a   v   a => 바이트 배열을 영문으로 옮겨 적었을때 나오는 글자 
						//0   1    2    3    4   5    6   7   8   9   => index 순서 
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 }; // 32는 띄어쓰기
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}

}
