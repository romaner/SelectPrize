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

import DrawFunction.FunctionRun6;

public class frame04 {

	public JFrame frame04;
	public JLabel jlabel04;
	public JTextArea ja04;
	public JButton ensurebutton04;
	public JScrollPane jscrollPane04;

	public void go04() {

		frame04 = new JFrame();
		frame04.setLayout(null);
		// ��������С��λ��
		frame04.setBounds(670, 200, 450, 800);
		frame04.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame04.setUndecorated(true);
		frame04.setVisible(true);

		// ����ȷ�ϰ�ť
		ensurebutton04 = new JButton("�ر�");
		ensurebutton04.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		ensurebutton04.setBackground(Color.orange);
		ensurebutton04.setBounds(150, 720, 120, 50);
		ensurebutton04.addActionListener(new Myensure04ButtonListener());
		// ��ӽ�����ť
		frame04.add(ensurebutton04);

		// ����label033
		jlabel04 = new JLabel("������");
		jlabel04.setBackground(Color.black);
		jlabel04.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		jlabel04.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel04.setBounds(100, 20, 200, 50);
		frame04.add(jlabel04);

		// ���û�������ʾ��
		ja04 = new JTextArea();
		ja04.setTabSize(4);
		ja04.setBackground(Color.white);
		ja04.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		ja04.setLineWrap(true);// �����Զ����й���
		ja04.setWrapStyleWord(true);// ������в����ֹ���
		jscrollPane04 = new JScrollPane(ja04);
		jscrollPane04.setBounds(100, 80, 230, 600);
		ja04.append(FunctionRun6.result06);
		ja04.setEditable(false);
		frame04.add(jscrollPane04);
	}

	// ȷ�ϰ�ť������
	class Myensure04ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame04.dispose();
		}
	}
}

