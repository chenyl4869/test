package oa;

public class PureStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compare("fghfgh", "gggfff"));

	}
	public static boolean compare(String word1, String word2) {
		int letter_index = 0;
		while(letter_index < word1.length()) {
			letter_index += 1;
			char l1 = word1.charAt(letter_index);
			char l2 = word2.charAt(letter_index);
			if(l1 > l2) {
				return true;
			}else if(l2 > l1){
				return false;
			}
		}
		return true;
	}

}
