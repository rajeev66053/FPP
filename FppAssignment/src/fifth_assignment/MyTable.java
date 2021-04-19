package fifth_assignment;

public class MyTable {
	private Entry[] entries=new Entry[26];
	
	public static void main(String[] args) {
		
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('g',"George");
		t.add('w',"Willie");
		
		String s = t.get('w');
		System.out.println(s);
		
		System.out.println(t);
	}
	
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		//implement
		int index = (int)c;
		Entry e = entries[getIndex(c)];
		return e.str;
	}
	public int getIndex(char c) {
		int asciiOfChar = (int)c;
		return asciiOfChar-97;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		//implement
		entries[getIndex(c)] = new Entry(c,s);
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		//implement
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 26; ++i){
			if(entries[i] != null) {
				sb.append(entries[i].toString());
				sb.append('\n');
			}
		}
		return sb.toString();
	}
	private class Entry {
		char ch;
		String str;
		Entry(char ch, String str){
			//implement
			this.ch=ch;
			this.str=str;
		}
		//returns a String of the form "ch->str"
		public String toString() {
			//implement
			return ch+"->"+str;
		}
	}
}

