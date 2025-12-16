package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void main (String[] args) {
		list.add("apple");
		list.add("banana");
		list.add("grape");
		list.add("orange");
		
		Dictionary_Chapter21 dictionaly = new Dictionary_Chapter21();
		dictionaly.add();
		
		for (int i = 0; i < list.size(); i++) {
			String target =  list.get(i);
			dictionaly.search(target);
		}
	}

}
