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
		String plaintext = "���� ��簡 �ȵǿ�, ����� �ּ���";
		byte[] encryptedtext = null;
		byte[] decryptedtext = null;
		
		try{
			//���� ���
			System.out.println("PlainText   :  " + plaintext);
			
			//������  base64  ���ڵ��� ����� ����Ѵ�.
			System.out.println("B64PlainText    :  " + new sun.misc.BASE64Encoder().encode(plaintext.getBytes("euc-kr")));
			
			//PBEWithMD5AndDES ��ȣ ��Ŀ���
			//���� ���Ű�� ������ KeyFactory�� �����´�.
			SecretKeyFactory skf = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
			
			//�־��� password�� �̿��Ͽ�
			//Password Based Encryption�� ���� ���Ű�� �����Ѵ�.
			PBEKeySpec pks = new PBEKeySpec(password.toCharArray());
			SecretKey sk = skf.generateSecret(pks);
			
			//PBE���� ����ϴ� �Ķ���͸� �����Ѵ�.
			PBEParameterSpec pps = new PBEParameterSpec(salt, iteration);
			
			//"PBEWithMD5AndDES" ��ȣȭ�� ����� Cipher ��ü�� �����´�.
			Cipher cipher = Cipher.getInstance("PBEWithMD5AndDES");
			
			//���Ű�� �Ķ���͸� �̿��Ͽ� ��ȣȭ ���� �ʱ�ȭ �Ѵ�.
			cipher.init(Cipher.ENCRYPT_MODE, sk, pps);
			
			//������   byte[]�� ��ȯ�� �� ��ȣȭ �Ѵ�.
			encryptedtext = cipher.doFinal(plaintext.getBytes("euc-kr"));
			
			//��ȣȭ��   byte[]�� �ٷ� ����� �� �����Ƿ�
			//base64  ���ڵ��Ͽ� ����Ѵ�.
			System.out.println("B64EncryptedText  : " + new sun.misc.BASE64Encoder().encode(encryptedtext));
			
			//���Ű�� �Ķ���͸� �̿��Ͽ� ��ȣȭ ���� �ʱ�ȭ �Ѵ�.
			cipher.init(Cipher.DECRYPT_MODE, sk, pps);
			
			//��ȣȭ��  byte[]�� ��ȣȭ �Ѵ�.
			decryptedtext = cipher.doFinal(encryptedtext);
			
			//��ȣȭ��  byte[]�� �ٷ� ����� �� �����Ƿ�
			//base64 ���ڵ��Ͽ� ����Ѵ�.
			System.out.println("B64DecryptedText  : " + new sun.misc.BASE64Encoder().encode(decryptedtext));
			
			System.out.println("PlainText   : " + new String(decryptedtext,"euc-kr"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
