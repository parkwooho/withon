package withon;

import java.lang.Exception;

class ExceptionTest{
	
	public ExceptionTest(){
		
	}
	
	public void exceptionTest() throws Exception{
		
		throw new Exception("Test Exception");
	}
	
	public static void main(String[] args){
		ExceptionTest exceptionTest = new ExceptionTest();
	
		try{
			exceptionTest.exceptionTest();
		}
		catch(Exception e){
			System.out.println("예외 발생 :" + e.toString());
		}
	}
}