package withon;

//�߻� Ŭ���� ����
abstract class Calculate {

	public abstract int triple(int a);
}

// �߻� Ŭ������ ����Ͽ����Ƿ� �߻� Ŭ������
//�߻� �޼ҵ带 �����Ͽ��� �Ѵ�.
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