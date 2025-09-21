package arraylistimplementation;

public class ArrayListDriver {

	public static void main(String[] args) {
		ArrayList<String> a1 =new ArrayList<String>();
		a1.add("Ganesh");
		a1.add("Staish");
		a1.add("Jadhav");
//		System.out.println(a1);
		
//		System.out.println(a1);
		a1.rightShift(1);
		System.out.println(a1);
		System.out.println(a1.size());
	  }

}