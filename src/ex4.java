
import java.awt.*;
import javax.swing.*;;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label = new JLabel("�ڹ� ī�信 ���� ���� ȯ���մϴ�. Ŀ���� ������ �����Ͻÿ�");
		panelA.add(label);
		
		JButton button1 = new JButton("�Ƹ޸�ī��");
		JButton button2 = new JButton("ī���");
		JButton button3 = new JButton("ī��Ḷ���ƶ�");
		
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		panel.add(panelA);
		panel.add(panelB);
		
		panel.setBackground(Color.YELLOW);
		panelA.setBackground(Color.GREEN);
		panelB.setBackground(Color.RED);
		
		add(panel);
		setVisible(true);
		
	}
}

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}

}
