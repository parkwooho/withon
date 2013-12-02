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
			
			//X.509 형태의 CertificateFactory 객체를 가져온다.
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			
			//FileInputStream을 읽어  Certificate을 만든다.
			X509Certificate cert = (X509Certificate)cf.generateCertificate(fis);
			
			//cert의 정보를 출력한다.
			System.out.println(cert);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
