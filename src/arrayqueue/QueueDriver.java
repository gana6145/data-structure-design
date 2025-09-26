package arrayqueue;

public class QueueDriver {

	public static void main(String[] args) {
		ArrayQueue<String> list=new ArrayQueue<String>();
		list.add("Ganesh");
		list.add("pratik");
		list.add("harshal");
		list.add("nagesh");
		list.add("ganesh");
		list.add("ajinkya");
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.size());
		list.add("ganesh");
		list.add("ajinkya");
		System.out.println(list);
		System.out.println(list.size());
		
}

}
