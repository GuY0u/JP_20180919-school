
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
		
		JLabel label = new JLabel("자바 카페에 오신 것을 환영합니다. 커피의 종류를 선택하시오");
		panelA.add(label);
		
		JButton button1 = new JButton("아메리카노");
		JButton button2 = new JButton("카페라떼");
		JButton button3 = new JButton("카라멜마끼아또");
		
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
