package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName;
	public String address = "住所は東京都中野区〇×です";
	
	public void commonIntroduce(){
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
	}
	
	abstract void eachIntroduce();
	
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
	}
}
