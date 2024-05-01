package inClassApr29;

public class OurHashTable {
	
	private HashNode[] hashTable;
	private int size;
	
	public OurHashTable(int size) {
		this.size = size;
		hashTable = new HashNode[this.size];
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
		String value=null;
		boolean notFound=true;
		int hashkey = getHash(key,this.size);
		int index = hashkey;
		
		//*** Find Node ****
		while(notFound) {
			if(this.hashTable[index]!=null) {
				if(this.hashTable[index].key.equals(key)) {
					notFound=false;
					value = this.hashTable[index].value;
					break;
				}	
			}
			index++;
			if(index==this.size) {
				index=0;
			}
			if(index == hashkey) {	//** Key not in  HashTable
				notFound=false;
			}
		}	
		return value;
	}
	
	public String put(String key, String value) {
		boolean notInserted=true;
		HashNode newNode = new HashNode(key,value);
		int hashkey = getHash(key,this.size);
		int index = hashkey;
		
		//*** Insert Node ****
		while(notInserted) {
			if(this.hashTable[index]==null) {
				hashTable[index] = newNode;
				notInserted=false;
			}else {
				index++;
				if(index==this.size) {
					index=0;
				}
			}
		}	
		return hashkey + "->" + index;
	}

	public static void main(String[] args) {
		OurHashTable htable = new OurHashTable(5);
		
		System.out.printf("%s\n", htable.put("car","Honda"));
		System.out.printf("%s\n", htable.put("dog","Buddy"));
		System.out.printf("%s\n", htable.put("instructor","Me"));
		System.out.printf("%s\n", htable.put("course","Programming II"));
		System.out.printf("%s\n", htable.put("9","Collision"));
		
		System.out.printf("%s\n", htable.get("car"));
		System.out.printf("%s\n", htable.get("dog"));
		System.out.printf("%s\n", htable.get("instructor"));
		System.out.printf("%s\n", htable.get("course"));
		System.out.printf("%s\n", htable.get("9"));
	}

}
