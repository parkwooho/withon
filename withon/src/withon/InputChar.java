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
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		//readLine �޼ҵ忡�� ���ܰ� �߻��� �� �����Ƿ� ó��
		
		try{
			input = br.readLine();
		}catch(Exception e){
			System.out.println("�Է��� �дµ� ������ �߻��Ͽ����ϴ�.");
		}
		
		result = String.valueOf(Integer.parseInt(input) * 2);
		System.out.println("����� : " + result);
	}

}
