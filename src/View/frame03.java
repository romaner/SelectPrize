package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import DrawFunction.FunctionRun5;

public class frame03 {

	public JFrame frame03;
	public JLabel jlabel033;
	public JLabel jlabel031;
	public JTextArea ja03;
	public JButton ensurebutton03;
	public JScrollPane jscrollPane;

	public void go03() {

		frame03 = new JFrame();
		frame03.setLayout(null);

		// ��������С��λ��
		frame03.setBounds(1400, 200, 460, 380);
		frame03.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame03.setUndecorated(true);
		frame03.setVisible(true);

		// ����ȷ�ϰ�ť
		ensurebutton03 = new JButton("�ر�");
		ensurebutton03.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		ensurebutton03.setBackground(Color.orange);
		ensurebutton03.setBounds(190, 320, 100, 50);
		ensurebutton03.addActionListener(new Myensure03ButtonListener());
		// ��ӽ�����ť
		frame03.add(ensurebutton03);

		// ����label033
		jlabel033 = new JLabel("�������ý��");
		jlabel033.setBackground(Color.black);
		jlabel033.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		jlabel033.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel033.setBounds(125, 20, 200, 50);
		frame03.add(jlabel033);

		// ���ý����ʾ��
		ja03 = new JTextArea(6, 3);
		ja03.setTabSize(4);
		ja03.setBackground(Color.white);
		ja03.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		ja03.setLineWrap(true);// �����Զ����й���
		ja03.setWrapStyleWord(true);// ������в����ֹ���
		jscrollPane = new JScrollPane(ja03);
		jscrollPane.setBounds(50, 75, 360, 220);
		ja03.append(FunctionRun5.result);
		ja03.setEditable(false);
		frame03.add(jscrollPane);
	}

	// ȷ�ϰ�ť������
	class Myensure03ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame03.dispose();
		}
	}

}