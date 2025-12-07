package kadai_015;

public class Car_Chapter15 {
	private int gear=1;
	private int speed=10;
	
	public void changeGear(int afterGear){
		if(afterGear == 1) {
			this.speed = 10;
		}else if(afterGear == 2) {
			this.speed = 20;
		}else if(afterGear == 3) {
			this.speed = 30;
		}else if(afterGear == 4) {
			this.speed = 40;
		}else if(afterGear == 5) {
			this.speed = 50;
		}else {
			this.speed = 10;
		}
		
		System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
	}
	
	public void run(){
		System.out.println("速度は時速"+speed+"kmです");
	}
}
