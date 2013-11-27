package withon;

//추상 클래스 선언
abstract class Calculate {

	public abstract int triple(int a);
}

// 추상 클래스를 상속하였으므로 추상 클래스의
//추상 메소드를 구현하여야 한다.
public class AbstractTest extends Calculate{
	
	public int triple(int a){
		return a*3;
	}
	
	public AbstractTest(){
		
	}
	
	public static void main(String[] args){
		AbstractTest abstractTest = new AbstractTest();
		System.out.println(abstractTest.triple(10));
	}
}