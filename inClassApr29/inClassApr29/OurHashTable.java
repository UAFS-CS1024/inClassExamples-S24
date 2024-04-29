package inClassApr29;

public class OurHashTable {
	
	private String[] hashTable;
	private int size;
	
	public OurHashTable(int size) {
		this.size = size;
		hashTable = new String[this.size];
	}
	
	public int getHash(String key, int size) {
		int hash=0;
		int sum=0;
		int index;
		char ch;
		
		for(index=0;index<key.length();index++) {
			ch = key.charAt(index);
			sum = sum + ch;
		}
		hash = sum % size;
		return hash;
	}
	
	public String get(String key) {
		int hashkey = getHash(key,this.size);
		return this.hashTable[hashkey];
	}
	
	public int put(String key, String value) {
		int hashkey = getHash(key,this.size);
		this.hashTable[hashkey] = value;
		return hashkey;
	}

	public static void main(String[] args) {
		OurHashTable htable = new OurHashTable(100);
		
		System.out.printf("%d\n", htable.put("car","Honda"));
		System.out.printf("%d\n", htable.put("dog","Buddy"));
		System.out.printf("%d\n", htable.put("instructor","Me"));
		System.out.printf("%d\n", htable.put("course","Programming II"));
		System.out.printf("%d\n", htable.put("9","Collision"));
		
		System.out.printf("%s\n", htable.get("car"));
		System.out.printf("%s\n", htable.get("dog"));
		System.out.printf("%s\n", htable.get("instructor"));
		System.out.printf("%s\n", htable.get("course"));
		System.out.printf("%s\n", htable.get("9"));

	}

}
