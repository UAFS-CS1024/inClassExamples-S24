package arrayListFeb28;

public class TestDriver {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(2);
		
		list.add("Hello");
		list.add("GoodBye");
		list.add("Hello Again");
		list.add("Get Lost");
		String str;
		
		int index;
		
		for(index=0;index<list.size();index++) {
			str = (String) list.get(index);
			System.out.printf("[%d]: %s\n", index,str);
		}
		
		list.status();
	}

}
