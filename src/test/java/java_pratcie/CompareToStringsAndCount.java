package java_pratcie;

public class CompareToStringsAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Cat is sitting on the wall.The ball is on the table.There is a caution board in that room ";

		String s1 = "on";

		int count = 0;
		// s = s.replace(".", " ");

		// System.out.println(s);

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {

				if (s.substring(i, j).equals(s1)) {

					count++;

				}

			}
		}

		System.out.println(s1 + " is present in string "+ count);
	}

}
