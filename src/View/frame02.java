package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import DrawFunction.FunctionRun5;
//import View.luckyframe.MySetButtonListener;

import javax.swing.*;

public class frame02 {

	public Image temp;
	public JLabel jl_bg;
	public ImageIcon img;
	public JFrame frame02;
	public JLabel jlabel00;
	public JLabel jlabel01;
	public JLabel jlabel02;
	public JLabel jlabel03;
	public JRadioButton jrb1;
	public JRadioButton jrb2;
	public JTextField text021;
	public JTextField text022;
	public JButton lookbutton;
	public JButton ensurebutton;
	public JButton savebutton;
	public JComboBox<String> prizeList;
	public static String a1;
	public static String a2;
	public static String a3;
	public static int a4;
	public static String a5;
	public static int a6;
	public static int a7;
	public static String i;
	public static int size;
	public static int num1;
	public static int num2;
	public static String[] array;

	static ArrayList<String> listdata = new ArrayList<String>();
	static ArrayList<String> listdata1 = new ArrayList<String>();
	static ArrayList<String> listdata2 = new ArrayList<String>();
	static ArrayList<String> listdata3 = new ArrayList<String>();

	public void go02() {

		frame02 = new JFrame();
		frame02.setLayout(null);

		// ��������С��λ��
		frame02.setBounds(550, 200, 800, 600);
		frame02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame02.setUndecorated(true);
		frame02.setVisible(true);

		// ����label01
		jlabel00 = new JLabel("�Ƿ��ظ��ý�");
		jlabel00.setBackground(Color.black);
		jlabel00.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		jlabel00.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel00.setBounds(75, 100, 136, 50);
		frame02.add(jlabel00);

		// ����label01
		jlabel01 = new JLabel("����ѡ��");
		jlabel01.setBackground(Color.black);
		jlabel01.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		jlabel01.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel01.setBounds(75, 200, 136, 50);
		frame02.add(jlabel01);

		// ����label02
		jlabel02 = new JLabel("��������");
		jlabel02.setBackground(Color.black);
		jlabel02.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		jlabel02.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel02.setBounds(75, 300, 136, 50);
		frame02.add(jlabel02);

		// ����label03
		jlabel03 = new JLabel("��Ʒ����");
		jlabel03.setBackground(Color.black);
		jlabel03.setFont(new Font("΢���ź�", Font.PLAIN, 20));
		jlabel03.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel03.setBounds(75, 400, 136, 50);
		frame02.add(jlabel03);

		// ���ñ��水ť
		savebutton = new JButton("����");
		savebutton.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		savebutton.setBackground(Color.orange);
		savebutton.setBounds(600, 400, 100, 40);
		savebutton.addActionListener(new MysaveButtonListener());
		// ��ӽ�����ť
		frame02.add(savebutton);

		// ���ò鿴��ť
		lookbutton = new JButton("���ý���鿴");
		lookbutton.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		lookbutton.setBackground(Color.orange);
		lookbutton.setBounds(520, 500, 180, 50);
		lookbutton.addActionListener(new MyLookButtonListener());
		// ��Ӳ鿴��ť
		frame02.add(lookbutton);

		// ����ȷ�ϰ�ť
		ensurebutton = new JButton("�ر�");
		ensurebutton.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		ensurebutton.setBackground(Color.orange);
		ensurebutton.setBounds(360, 500, 100, 50);
		ensurebutton.addActionListener(new MyensureButtonListener());
		// ��ӽ�����ť
		frame02.add(ensurebutton);

		// ��ӵ�ѡ��ťjrb1��jrb2
		jrb1 = new JRadioButton("�ظ��ý�");
		jrb2 = new JRadioButton("���ظ��ý�", true);
		jrb1.setBounds(400, 80, 200, 60);
		jrb2.setBounds(400, 120, 200, 60);
		jrb1.addItemListener(new Myjrb1Listener());
		jrb2.addItemListener(new Myjrb2Listener());
		frame02.add(jrb1);
		frame02.add(jrb2);
		// ���ButtonGroup��ʵ��JRadioButton�ĵ�ѡ����
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(jrb1);
		bg.add(jrb2);

		// ���ý��������˵�
		String[] prizeString = { "��Ƚ�", "�ĵȽ�", "���Ƚ�", "���Ƚ�", "һ�Ƚ�", "�صȽ�" };
		prizeList = new JComboBox<String>(prizeString);
		// ����Ĭ��ѡ��
		prizeList.setSelectedIndex(0);
		// �����Ŀѡ��״̬�ı�ļ�����
		prizeList.addItemListener(new MyItemLister());
		prizeList.setBounds(400, 200, 150, 40);
		frame02.add(prizeList);

		// ���ý�Ʒ�����ı���
		text021 = new JTextField();
		text021.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		text021.setBounds(400, 400, 160, 40);
		text021.setColumns(20);
		text021.addCaretListener(new MyCaretListener01());
		text021.setText("0");
		// ��ӵ����ı������
		frame02.add(text021);

		// ���ý�Ʒ�����ı���
		text022 = new JTextField(null);
		text022.setFont(new Font("΢���ź�", Font.PLAIN, 24));
		text022.setBounds(400, 310, 120, 40);
		text022.setColumns(10);
		text022.addActionListener(new MyActionListener02());
		text022.setText("0");
		// ��ӵ����ı������
		frame02.add(text022);
	}

	// ���水ť������
	class MysaveButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// ������水ťʱ���a1 a2 a3
			char[] charArray1 = text021.getText().toCharArray();
			char[] charArray2 = text022.getText().toCharArray();
			// a6ר��������⽱Ʒ�����Ƿ�Ϊ0
			a6 = Integer.parseInt(text022.getText());

			for (int k = 0; k < charArray1.length; k++) {
				num1 = (int) charArray1[k];
			}
			for (int j = 0; j < charArray2.length; j++) {
				num2 = (int) charArray2[j];

				// if (num2 > 47 && num2 < 58 && num1 != 48 && a6 > 0) {
				if (num2 > 47 && num2 < 58 && num1 != 48 && text022!=null) {
					
//					if (a6 > 0) {
						a1 = (String) prizeList.getSelectedItem();
						a2 = text021.getText();
						a3 = text022.getText();
						a5 = a3;// ����Ʒ������Ϣ���浽a5�У�a3�������ᱻ����������ַ���
						a7 = Integer.valueOf(a3);
						a7 += a7;
						// ��ԭʼ���ݷ������鱸��
						listdata1.add(a1);
						listdata2.add(a2);
						listdata3.add(a3);
						// luckyframe.cde++;
						i = "��Ʒ�ȼ�Ϊ��" + a1;
						a2 = "��Ʒ����Ϊ��" + a2;
						a3 = "��Ʒ����Ϊ��" + a3;
						// ����õ����ݴ浽ArrayList������
						listdata.add(i);
						listdata.add(a2);
						listdata.add(a3);
						// ��������
						prizeList.setSelectedIndex(0);
						text021.setText("0");
						text022.setText("0");
//					} else {
//						String st1 = "��Ʒ�����������0";
//						new JOptionPane();
//						JOptionPane.showMessageDialog(null, st1);
//						return;
//					}
				}

				else {
					String st1 = "��Ʒ�����ͽ�Ʒ���Ʋ�����ǿգ���Ʒ������������ֳ��ַ�����";
					new JOptionPane();
					JOptionPane.showMessageDialog(null, st1);
					return;
				}
			}
		}
	}

	// ȷ�ϰ�ť������
	class MyensureButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame01.abc1 = true;
			frame02.dispose();
		}
	}

	// ������Դ��ť������
	class MydataButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}

	// ����ѡ�������
	class MyItemLister implements ItemListener {
		public void itemStateChanged(ItemEvent e) {

		}
	}
	class Myjrb1Listener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(jrb1.isSelected())
				 frame01.abc4 = true;
		}
	}
	
	class Myjrb2Listener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(jrb2.isSelected())
				 frame01.abc4 = false;
		}
	}

	class MyCaretListener01 implements CaretListener {
		public void caretUpdate(CaretEvent e) {

		}
	}

	class MyActionListener02 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}

	// ���ò鿴��ť������
	class MyLookButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame03 lkf03 = new frame03();
			// ����鿴��ťʱ��ArrayList���������ת�����ַ���
			FunctionRun5.ArrayList2String(listdata);
			lkf03.go03();
		}
	}

	
}