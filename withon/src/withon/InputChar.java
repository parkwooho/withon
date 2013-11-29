package withon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = null;
		String result = null;
		BufferedReader br = null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자를 입력하세요 : ");
		//readLine 메소드에서 예외가 발생할 수 있으므로 처리
		
		try{
			input = br.readLine();
		}catch(Exception e){
			System.out.println("입력을 읽는데 문제가 발생하였습니다.");
		}
		
		result = String.valueOf(Integer.parseInt(input) * 2);
		System.out.println("결과는 : " + result);
	}

}
