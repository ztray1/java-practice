import java.util.ArrayList;
import java.util.List;

public class code2 {

	public static void main(String[] args) {
		testA();
		System.out.println("===========================");
		System.out.println("===========================");
	}

	public static void testA() {
		String[] str = { "1", "5", "null", "3", "null", "1", "2", "2" };
		int sum1 = 0, sum2 = 0;
		List<String> list2 = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			list2.add(str[i]);
		}
		list2.add(str.length, "null");
		String[] newStr = list2.toArray(new String[1]);// 转换成数组
		List<String> list = new ArrayList<String>();
		List<String> maxsum = new ArrayList<String>();
		List<String> maxAvg = new ArrayList<String>();

		for (int i = 0; i < newStr.length; i++) {
			if (newStr[i] != "null") {
				list.add(newStr[i]);
			} else {

				if (maxsum.size() <= list.size()) {
					maxAvg = list;
					System.out.println(maxAvg.size());
					System.out.println(list);
				}
				String[] maxsum1 = maxsum.toArray(new String[1]);
				String[] str5 = list.toArray(new String[1]);
				for (int j = 0; j <= maxsum.size(); j++) {
					sum1 += Integer.parseInt(maxsum1[j]);
				}
				for (int k = 0; k <= list.size(); k++) {
					if (str5[k] == null) {
						throw new NumberFormatException("null");
					}
					sum2 += Integer.parseInt(str5[k]);
				}
				if (sum1 <= sum2) {
					maxsum = list;
				}
				list.clear();
			}

		}

		System.out.println(maxAvg);
		System.out.println(maxsum);
	}
}
