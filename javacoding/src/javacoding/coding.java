package javacoding;

@FunctionalInterface
interface Mysam{
	void show();
	String toString();
}
class A extends Object implements Mysam{

	@Override
	public void show() {
		System.out.println("Hi All");
		
	}
	
}
public class coding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mysam m=()-> System.out.println("Hello All");
		m.show();

	}

}
