
interface Car{
	abstract void work();
}

interface Cannon{
	abstract void fire();
}

class Tank implements Car, Cannon{
	public void work() {
		System.out.println("��ũ�� ������ �������ϴ�.");
	}
	public void fire() {
		System.out.println("��ũ���� ������ �߻��մϴ�.");
	}
}



public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank1 = new Tank();
		tank1.work();
		tank1.fire();
		

	}

}
