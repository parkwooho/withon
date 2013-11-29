package withon;

public class GarbageCollector {

	public GarbageCollector(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] test = new byte[1024];
		
		Runtime runtime = Runtime.getRuntime();
		System.out.println("사용메모리 : " + (runtime.totalMemory() - runtime.freeMemory()/1024 + "k"));
		
		test = null;
		
		System.gc();
		runtime = Runtime.getRuntime();
		System.out.println("사용메모리 : " + (runtime.totalMemory() - runtime.freeMemory())/1024 + "k");
	}

}
