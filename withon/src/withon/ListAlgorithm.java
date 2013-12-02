package withon;

import java.security.Security;
import java.security.Provider;
import java.util.Iterator;
import java.util.Set;

public class ListAlgorithm {

	public ListAlgorithm(){
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provider[] providers = Security.getProviders();
		Provider curr = null;
		Set keys = null;
		Iterator iterator = null;
		
		String value = null;
		String alias = "Alg.Alias.";
		String service = null;
		
		for(int i=0; i<providers.length; i++){
			curr = providers[i];
			System.out.println("Provider : " + curr.getName());
			keys = curr.keySet();
			iterator = keys.iterator();
			
			while(iterator.hasNext()){
				value = (String)iterator.next();
				
				if(value.startsWith(alias)){
					service = value.substring(alias.length());
				}
				else{
					service = value;
				}
				
				System.out.println("\t" + service);
			}
		}
	}

}
