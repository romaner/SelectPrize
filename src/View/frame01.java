package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import DrawFunction.*;

public class frame01 {

	public static JFrame frame;
	public JLabel jlabel;
	public JLabel jl_bg;
	public JButton startButton;
	public JButton stopButton;
	public JButton setButton;
	public JButton winlistbutton;
	public JButton closeButton;
	public JButton dataButton;
	public JPanel panel;
	public ImageIcon img;
	public Image temp;
	public static JTextField textnamephone;
	public JComboBox<String> prizeList;
	public static JTextField text01;
	public static JTextField text02;
	public static JTextField text03;
	public JLabel jlabel01;
	public JLabel jlabel02;
	public JLabel jlabel03;
	public JLabel jlabel04;
	public static String b0;
	public static String bcd1;
	public static String bcd2;
	public static String bcd3;
	public static boolean abc1 = false;
	public static boolean abc2 = true;
	public static boolean abc3 = false;
	public static boolean delete = false;
	public static String s2;
	public static boolean abc4 = false;
	@SuppressWarnings("rawtypes")
	public static List listnum = new ArrayList();

	public void go() {
		frame = new JFrame();
		frame.setLayout(null);

		// ����label
		jlabel = new JLabel("�齱ϵͳ");
		jlabel.setBackground(Color.black);
		jlabel.setFont(new Font("΢���ź�", Font.PLAIN, 30));
		jlabel.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel.setBounds(820, 21, 136, 50);
		frame.add(jlabel);

		// ���ÿ�ʼ��ť
		startButton = new JButton("��ʼ");
		startButton.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		startButton.setBackground(Color.green);
		startButton.setBounds(1760, 700, 100, 50);
		startButton.addActionListener(new MyStartButtonListener());
		// ��ӿ�ʼ��ť
		frame.add(startButton);

		// �������ð�ť
		setButton = new JButton("�齱����");
		setButton.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		setButton.setBackground(Color.GRAY);
		setButton.setBounds(1710, 600, 150, 50);
		setButton.addActionListener(new MySetButtonListener());
		// ��ӿ�ʼ��ť
		frame.add(setButton);
		
		// �����н�������ť
		winlistbutton = new JButton("�н������鿴");
		winlistbutton.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		winlistbutton.setBackground(Color.GRAY);
		winlistbutton.setBounds(1650, 120, 200, 50);
		winlistbutton.addActionListener(new MyWinlistButtonListener());
		// ��ӿ�ʼ��ť
		frame.add(winlistbutton);

		// ���ý�����ť
		stopButton = new JButton("ֹͣ");
		stopButton.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		stopButton.setBackground(Color.orange);
		stopButton.setBounds(1760, 800, 100, 50);
		stopButton.addActionListener(new MyStopButtonListener());
		// ��ӽ�����ť
		frame.add(stopButton);

		// �����˳�����
		closeButton = new JButton("�˳�");
		closeButton.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		closeButton.setBackground(Color.cyan);
		closeButton.setBounds(50, 950, 150, 70);
		closeButton.addActionListener(new MycloseButtonListener());
		// ����˳���ť
		// frame.add(closeButton);

		// ���õ����ı�
		textnamephone = new JTextField("");
		textnamephone.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		textnamephone.setBounds(750, 130, 300, 50);
		textnamephone.setColumns(10);
		textnamephone.setEditable(false);
		// ��ӵ����ı�
		frame.add(textnamephone);
		frame.repaint();
		frame.validate();
		frame.invalidate();
		frame.validate();

		// ���ý��������˵�
		String[] prizeString = { "��Ƚ�", "�ĵȽ�", "���Ƚ�", "���Ƚ�", "һ�Ƚ�", "�صȽ�" };
		prizeList = new JComboBox<String>(prizeString);
		// ����Ĭ��ѡ��
		prizeList.setSelectedIndex(5);
		// �����Ŀѡ��״̬�ı�ļ�����
		prizeList.addItemListener(new MyItemLister());
		prizeList.setBounds(1700, 200, 150, 40);
		frame.add(prizeList);

		// ���ý�Ʒ�����ı���
		text01 = new JTextField("");
		text01.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		text01.setBounds(1700, 300, 160, 40);
		text01.setColumns(20);
		text01.setEditable(false);
		text01.addCaretListener(new MyCaretListener001());
		// ��ӵ����ı�
		frame.add(text01);

		// ���ý�Ʒ�����ı���
		text02 = new JTextField("");
		text02.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		text02.setBounds(1700, 400, 160, 40);
		text02.setColumns(10);
		text02.setEditable(false);
		text02.addActionListener(new MyActionListener002());
		// ��ӵ����ı�
		frame.add(text02);

		// ���ý�Ʒ�����ı���
		text03 = new JTextField("");
		text03.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		text03.setBounds(1700, 500, 160, 40);
		text03.setColumns(10);
		text03.setEditable(false);
		text03.addActionListener(new MyActionListener003());
		// ��ӵ����ı�
		frame.add(text03);
		// text03ʵʱˢ��
		frame.repaint();
		frame.validate();
		frame.invalidate();
		frame.validate();

		// ����label01
		jlabel01 = new JLabel("��ǰ��Ʒ�ȼ�");
		jlabel01.setBackground(Color.black);
		jlabel01.setFont(new Font("΢���ź�", Font.PLAIN, 30));
		jlabel01.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel01.setBounds(1400, 200, 190, 50);
		frame.add(jlabel01);

		// ����label02
		jlabel02 = new JLabel("��Ʒ����");
		jlabel02.setBackground(Color.black);
		jlabel02.setFont(new Font("΢���ź�", Font.PLAIN, 30));
		jlabel02.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel02.setBounds(1400, 300, 136, 50);
		frame.add(jlabel02);

		// ����label03
		jlabel03 = new JLabel("�ý�Ʒ����");
		jlabel03.setBackground(Color.black);
		jlabel03.setFont(new Font("΢���ź�", Font.PLAIN, 30));
		jlabel03.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel03.setBounds(1400, 400, 150, 50);
		frame.add(jlabel03);

		// ����label04
		jlabel04 = new JLabel("ʣ������");
		jlabel04.setBackground(Color.black);
		jlabel04.setFont(new Font("΢���ź�", Font.PLAIN, 30));
		jlabel04.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel04.setBounds(1400, 500, 136, 50);
		frame.add(jlabel04);

		// ���ñ���ͼƬ
		img = new ImageIcon("Image/BackGround/4900.gif");// ����ͼƬ����
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();// �õ�������Ļ�Ĵ�С
		img.getImage();
		temp = img.getImage().getScaledInstance((int) screenSize.getWidth(), (int) screenSize.getHeight(),
				Image.SCALE_DEFAULT);// ����ͼƬ��С����Ļ��Сһ��
		img = new ImageIcon(temp);// ����ͼƬ�������úú��С��ͼƬ
		jl_bg = new JLabel(img);
		jl_bg.setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());
		frame.getLayeredPane().add(jl_bg, new Integer(Integer.MIN_VALUE));
		((JPanel) frame.getContentPane()).setOpaque(false); // �����ϲ㱳��͸�����ײ�ͼƬ������ʾ����

		// ��������С��λ��
		frame.setLocation(0, 0);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);// JFrame���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.addMouseListener(new MouseAdapter() {
			// �����˳�
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 3) {
					frame.dispose();
				}
			}
		});
	}

	public static JTextField getTextField() {
		return textnamephone;
	}

	public static JTextField getTextField01() {
		return text01;
	}

	public static JTextField getTextField02() {
		return text02;
	}

	// ��ʼ��ť������
	class MyStartButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (frame02.a6 > 0) {
				abc2 = false;
				abc3 = true;
				s2 = String.valueOf(--frame02.a4);
				text03.setText(s2);
				text03.getText();
				if (frame02.a4 >= 0) {
					// if(delete){
					// try {
					// //�����ֹͣ��ťʱ�����¼���е���Ϣ�����Ѹ���Ա����Ϣ����ɾ����������Ϣ��
					// ExcelShiftRows.ShiftRows();
					// } catch (IOException e1) {
					// String st1 = "�������";
					// new JOptionPane();
					// JOptionPane.showMessageDialog(null, st1);
					// }
					// }
					FunctionRun3.run3();
				} else {
					String st1 = "�õȼ���Ʒ������ϣ����������";
					new JOptionPane();
					JOptionPane.showMessageDialog(null, st1);
					return;
				}
			} else {
				String st1 = "�������뽱Ʒ��Ϣ";
				new JOptionPane();
				JOptionPane.showMessageDialog(null, st1);
				return;
			}
		}
	}

	// ������ť������
	class MyStopButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(abc4){
			 FunctionRun2.run2();
			}else{
			try {
				FunctionRun2.run22();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
			// delete = true;

			// String k = String.valueOf(Controllerlucky.j);
			// if (listnum.contains(k)){
			// //Controllerlucky.run();
			// try {
			// Controllerlucky.run3();
			// } catch (IOException e1) {
			// e1.printStackTrace();
			// }
			// }
			// listnum.add(k);
			// try {
			// //�����ֹͣ��ťʱ�����¼���е���Ϣ�����Ѹ���Ա����Ϣ����ɾ����������Ϣ��
			// ExcelReadWriter.ShiftRows();
			// } catch (IOException e1) {
			// String st1 = "�������";
			// new JOptionPane();
			// JOptionPane.showMessageDialog(null, st1);
			// }

		}
	}

	// ���ð�ť������
	class MySetButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame02 lkf02 = new frame02();
			lkf02.go02();
		}
	}
	// �н������鿴��ť������
	class MyWinlistButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame04 lkf04 = new frame04();
			FunctionRun6.ArrayList6String(FunctionRun2.unionlist);
			lkf04.go04();
		}
	}

	// �رչ��ܼ�����
	class MycloseButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame01.frame.dispose();
		}
	}

	// ����ѡ�������
	class MyItemLister implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int i = prizeList.getSelectedIndex();
			// }
			if (abc1) {
				// ����Ʒ������Ϣת��ΪString����
				// luckyframe02.a4 = Integer.parseInt(luckyframe02.a5);
				bcd2 = frame02.listdata2.get(i);// ���Ž����ѡ����ʾ��ͬ�Ľ�Ʒ
				bcd3 = frame02.listdata3.get(i);// ���Ž����ѡ����ʾ��ͬ��Ʒ������
				frame02.a4 = Integer.parseInt(frame01.bcd3);
				text01.setText(bcd2);
				text01.getText();
				text02.setText(bcd3);
				text02.getText();
				text03.setText("");
			}
		}
	}

	class MyCaretListener001 implements CaretListener {
		public void caretUpdate(CaretEvent e) {
		}
	}

	class MyActionListener002 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}

	class MyActionListener003 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}
}