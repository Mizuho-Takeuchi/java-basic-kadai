package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void main (String[] args) {
		list.add("apple");
		list.add("banana");
		list.add("grape");
		list.add("orange");
		
		Dictionary_Chapter21.add();
		
		for (int i = 0; i < list.size(); i++) {
			String target =  list.get(i);
			
			if(Dictionary_Chapter21.hashMap.containsKey(target)){
				String mean = Dictionary_Chapter21.hashMap.get(target);
				System.out.println(target+"の意味は"+mean);
			}else {
				System.out.println(target+"は辞書に存在しません");
			}
		}
	}

}
