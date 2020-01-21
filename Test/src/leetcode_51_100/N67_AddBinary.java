package leetcode_51_100;

public class N67_AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        int i = m - 1;
        int j = n - 1;
        int c = 0;
        String res = "";
        while(i>=0 && j>=0){
            int x = (int)a.charAt(i) - 48;
            int y = (int)b.charAt(j) - 48;
            int sum = x+y+c;
            if(sum >= 2){
                c = 1;
                sum = sum - 2;
            }else{
                c = 0;
            }
            res = sum + res;
            i--;
            j--;
        }
        while(i >= 0){
            int x = (int)a.charAt(i) - 48;
            int sum = x+c;
            if(sum >= 2){
                c = 1;
                sum = sum-2;
            }else{
                c = 0;
            }
            res = sum + res;
            i--;
        }
        while(j >= 0){
            int y = (int)b.charAt(j) - 48;
            int sum = y+c;
            if(sum >= 2){
                c = 1;
                sum = sum-2;
            }else{
                c = 0;
            }
            res = sum + res;
            j--;
        }
        if(c == 1){
            res= c + res;
        }
        return res;
    }

}
