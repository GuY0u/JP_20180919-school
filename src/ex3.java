
interface Mamma1{
	abstract void bear();
}

abstract class Fish{
	abstract void swim();
}

class Whale extends Fish implements Mamma1{
	public void bear() {
		System.out.println("���� ������ �����ϴ�.");
	}
	void swim() {
		System.out.println("������ ���ġ�� �����Դϴ�.");
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
