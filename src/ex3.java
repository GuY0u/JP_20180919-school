
interface Mamma1{
	abstract void bear();
}

abstract class Fish{
	abstract void swim();
}

class Whale extends Fish implements Mamma1{
	public void bear() {
		System.out.println("고래는 새끼를 낳습니다.");
	}
	void swim() {
		System.out.println("물고기는 헤엄치며 움직입니다.");
	}
}

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whale whale1 = new Whale();
		
		whale1.swim();
		whale1.bear();
	}

}
