package leetcode_51_100;

public class N66_PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i;
        for(i = n-1; i>=0; i--){
            int d = digits[i];
            d++;
            if(d != 10){
                digits[i] = d;
                return digits;
            }
            digits[i] = 0;
        }
        if(i == -1){
            int[] result = new int[n+1];
            result[0] = 1;
            for(int j = 1; j < n+1; j++){
                result[j] = digits[j-1];
            }
            return result;
        }
        return digits;
    }

}
