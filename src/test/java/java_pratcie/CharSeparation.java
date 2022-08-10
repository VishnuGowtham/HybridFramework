package java_pratcie;

final class CharSeparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Gayatri$$@___Automation";
		String newWord = input.replace("$$@___", "");
		int print = 1;
		//System.out.println(newWord);
		char[] ch = newWord.toCharArray();
		for (int i = 0; i < ch.length;) {
			int count = 0;
			while (count < print) {
				if (i < ch.length) {
					System.out.print(ch[i]);
					count++;
					i++;
				} else {
					break;
				}
			}
			System.out.println();
			print++;
			if (print == 4) {
				print = 1;
			}
		}
	}
}
