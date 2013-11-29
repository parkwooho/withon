package withon;

class A{
	public A(){
		System.out.println("Class A Constructor invoked");
	}
	
	public static int unumber = 200;
}
	
class B extends A{
	public B(){
		super();
		System.out.println("Class B Constructor invoked");
		System.out.println("this.unumber : " + this.unumber);
		System.out.println("super.unumber : " + super.unumber);
	}
	
	public static int unumber = 100;
}
	
public class SuperAndThis {
	
	public SuperAndThis(){
		B b = new B();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperAndThis test = new SuperAndThis();
	}

}
