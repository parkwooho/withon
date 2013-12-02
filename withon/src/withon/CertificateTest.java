package withon;

import java.security.cert.CertificateFactory;
import java.io.FileInputStream;
import java.security.cert.X509Certificate;

public class CertificateTest {
	
	public CertificateTest(){
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fis = new FileInputStream("C:\\javatest.cer");
			
			//X.509 ������ CertificateFactory ��ü�� �����´�.
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			
			//FileInputStream�� �о�  Certificate�� �����.
			X509Certificate cert = (X509Certificate)cf.generateCertificate(fis);
			
			//cert�� ������ ����Ѵ�.
			System.out.println(cert);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
