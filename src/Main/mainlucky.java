package Main;

import java.io.File;
import javax.swing.JOptionPane;
import View.frame01;

public class mainlucky {

	public static void main(String[] args) {
		File file = new File("D:/test01.xls");
		if (file.exists()) {
			frame01 lkf = new frame01();
			lkf.go();
		} else {
			String st1 = "ָ��·����û�и��ļ������Ƚ�����Ա����Ϣ��test01.xls����D�̸�Ŀ¼��������������Ӧ��";
			new JOptionPane();
			JOptionPane.showMessageDialog(null, st1);
			return;
		}
	}
}
