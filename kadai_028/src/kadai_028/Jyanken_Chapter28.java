package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String input;
		do {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			input = scanner.next();
			
			if(!(input.equals("r"))&&!(input.equals("s"))&&!(input.equals("p"))) {
				System.out.println("グーのr、チョキのs、パーのpのどれかを入力してください");
			}
			
		}while(!(input.equals("r"))&&!(input.equals("s"))&&!(input.equals("p")));
		
		scanner.close();
		return input;
		
	}

	
	public String getRandom() {
		String[] hands = new String[3];
		hands[0]="r";
		hands[1]="s";
		hands[2]="p";
		
		int i =(int)Math.floor(Math.random()*3);
		String hand = hands[i];
		return hand;
	}
	
	public void playGame(String me_alphabet, String you_alphabet) {
		//アルファベットを文字にするルール
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("r", "グー");     // r → グー
        map.put("s", "チョキ");   // s → チョキ
        map.put("p", "パー");     // p → パー
        
        //変換
        String me = map.get(me_alphabet);
        String you = map.get(you_alphabet);
       		
		System.out.println("自分の手は"+me+",対戦相手の手は"+you);
		
		//結果を格納
		HashMap<String,String> results = new HashMap<String,String>();
		results.put("グー-グー", "あいこです");
        results.put("グー-チョキ", "自分の勝ちです");
        results.put("グー-パー", "自分の負けです");
        results.put("チョキ-グー", "自分の負けです");
        results.put("チョキ-チョキ", "あいこです");
        results.put("チョキ-パー", "自分の勝ちです");
        results.put("パー-グー", "自分の勝ちです");
        results.put("パー-チョキ", "自分の負けです");
        results.put("パー-パー", "あいこです");

        //結果を取得
      	String meAndYou = me + "-" + you;
      	String result= results.get(meAndYou);
      	
      	System.out.println(result);
	}

}
