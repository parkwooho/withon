package withon;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.Cipher;

public class SecretKeyTest {
	
	public SecretKeyTest(){
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] salt = {(byte)0x24, (byte)0x85, (byte)0x62, (byte)0x79,
				(byte)0xfe, (byte)0x10, (byte)0xa6, (byte)0xb2
		};
		
		int iteration = 9;
		
		String password = "hello";
		String plaintext = "고구마 장사가 안되요, 백원만 주세요";
		byte[] encryptedtext = null;
		byte[] decryptedtext = null;
		
		try{
			//원문 출력
			System.out.println("PlainText   :  " + plaintext);
			
			//원문을  base64  인코딩한 결과를 출력한다.
			System.out.println("B64PlainText    :  " + new sun.misc.BASE64Encoder().encode(plaintext.getBytes("euc-kr")));
			
			//PBEWithMD5AndDES 암호 방식에서
			//사용될 비밀키를 생성할 KeyFactory를 가져온다.
			SecretKeyFactory skf = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
			
			//주어진 password를 이용하여
			//Password Based Encryption에 사용될 비밀키를 생성한다.
			PBEKeySpec pks = new PBEKeySpec(password.toCharArray());
			SecretKey sk = skf.generateSecret(pks);
			
			//PBE에서 사용하는 파라미터를 설정한다.
			PBEParameterSpec pps = new PBEParameterSpec(salt, iteration);
			
			//"PBEWithMD5AndDES" 암호화를 담당할 Cipher 객체를 가져온다.
			Cipher cipher = Cipher.getInstance("PBEWithMD5AndDES");
			
			//비밀키와 파라미터를 이용하여 암호화 모드로 초기화 한다.
			cipher.init(Cipher.ENCRYPT_MODE, sk, pps);
			
			//원문을   byte[]로 변환한 후 암호화 한다.
			encryptedtext = cipher.doFinal(plaintext.getBytes("euc-kr"));
			
			//암호화된   byte[]를 바로 출력할 수 없으므로
			//base64  인코딩하여 출력한다.
			System.out.println("B64EncryptedText  : " + new sun.misc.BASE64Encoder().encode(encryptedtext));
			
			//비밀키와 파라미터를 이용하여 복호화 모드로 초기화 한다.
			cipher.init(Cipher.DECRYPT_MODE, sk, pps);
			
			//암호화된  byte[]를 복호화 한다.
			decryptedtext = cipher.doFinal(encryptedtext);
			
			//복호화된  byte[]를 바로 출력할 수 없으므로
			//base64 인코딩하여 출력한다.
			System.out.println("B64DecryptedText  : " + new sun.misc.BASE64Encoder().encode(decryptedtext));
			
			System.out.println("PlainText   : " + new String(decryptedtext,"euc-kr"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
