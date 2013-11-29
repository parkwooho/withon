package withon;

import java.util.StringTokenizer;

public class Tokenize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = new String("C:\\Program Files\\Internet Explorer\\IExplore.exe");
		StringTokenizer tokenizer = new StringTokenizer(path, "\\");
		
		System.out.println("Token Count :" + tokenizer.countTokens());
		System.out.println("Token Count :" + tokenizer.countTokens());
		while(tokenizer.hasMoreTokens()){
			System.out.println("Tokenized String : " + tokenizer.nextToken());
		}
	}

}
