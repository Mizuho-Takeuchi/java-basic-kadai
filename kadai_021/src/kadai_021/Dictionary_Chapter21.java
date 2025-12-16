package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> hashMap =new HashMap<String,String> ();
	
	public void add() {
		hashMap.put("apple", "りんご");
		hashMap.put("peach", "桃");
		hashMap.put("banana", "バナナ");
		hashMap.put("lemon", "レモン");
		hashMap.put("pear", "梨");
		hashMap.put("kiwi", "キウィ");
		hashMap.put("strawberry", "いちご");
	    hashMap.put("grape", "ぶどう");
	    hashMap.put("muscat", "マスカット");
	    hashMap.put("cherry", "さくらんぼ");
	}
	
	public void search(String target) { 
		if(hashMap.containsKey(target)){
			String mean = hashMap.get(target);
			System.out.println(target+"の意味は"+mean);
		}else {
			System.out.println(target+"は辞書に存在しません");
		}
	}
}
