package DrawFunction;

import java.util.ArrayList;

public class FunctionRun5 {
	public static String result = "";
	
	public static String ArrayList2String(ArrayList<String> arrayList) {

		if (arrayList != null && arrayList.size() > 0) {
			for (String item : arrayList) {
				// ���б��е�ÿ�������ö��ŷָ����Ȼ��ƴ�ӳ��ַ���
				result += item + " ,";
			}
			result = result.substring(0, result.length() - 1);
		}
		return result;
	}
}
