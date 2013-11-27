package withon;

import java.util.Properties;

public class ReadSystemPath {

	public ReadSystemPath(){
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = System.getProperties();
		System.out.println("java.library.path :" + prop.get("java.library.path"));
		
	}

}
