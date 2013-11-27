package withon;

public class ArrayCopy {
	
	public ArrayCopy(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src = new int[10];
		int[] dest = new int[10];
		
		src[3] = 10;
		src[9] = 5;
		
		// arraycopy(대상, 시작위치, 타켓, 시작, 마지막)
		System.arraycopy(src,  0,  dest,  0,  10);
		
		System.out.println("src[3]=" + src[3] + ", src[9]=" + src[9]);
		System.out.println("dest[3]=" + dest[3] + ", dest[9]=" + dest[9]);
		
	}

}
