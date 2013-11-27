package withon;

interface Calculate1 {
	
	public int add(int a, int b);
}

interface Calculate2{
	public int multiple(int a, int b);
}

public class InterfaceTest implements Calculate1, Calculate2{
	public InterfaceTest(){
		
	}
	
	public int add(int a, int b){
		return a+b;
	}
	
	public int multiple(int a, int b){
		return a*b;
	}
	
	public static void main(String[] args){
		InterfaceTest interfaceTest = new InterfaceTest();
		System.out.println(interfaceTest.add(10,10));
		System.out.println(interfaceTest.multiple(10, 10));
	}
}
