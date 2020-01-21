package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculate("(9568+(9040-(380+(2042-(7115)+(6294)-(4395-(5183+9744+(7746-(1099+2718))-(9370-(8561+(9302)-(7632+(8451-(1759+(7760))-(3377+5363+9093+(8332-(4492-(1151+(1165-8833+(775+(3749)+9399))+9112+(6273+(7285-(6112-(668-(7756-4316-(582+1835-(6644+690+1204-(7197+(7897))+(7009-(7262))-7782-(7858+(7644+(9461+(2224)-(7531-1095-(891+1022)+2197-(9855)))+(6663-(7417-(6158-(3610))+(1481))-(4182+(4761)))+(5017))+(9990)+(6218)))-(2904)+(5631)-(8888)+3401+(3569))+(1135))-(3695-(7713+(3479)-(9813+(8171+(8616-8026+(4634-(6973))-(9761-(623-4782)+(2514)+(6233)))))+(6140))-(6641)-8611+(8389)+8074-(4412))-(3703)+(9688+(9513))))-(4987)))+(9647)))))))))-(2299))-(4785))))))"));
		
	}
	
	public static int calculate(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int temp = 0;
        char sign = '+';
        int t = 0;
        Deque<String> stack = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            
            char curr = s.charAt(i);
            if(curr == ' '){
                continue;
            }
            if(isNumber(curr)){
                t = t * 10 + curr - '0';
                if(i+1 == s.length() || !isNumber(s.charAt(i+1))){
                    if(sign == '+'){
                        temp += t;
                    }else{
                        temp -= t;
                    }
                    t = 0;
                }
            }else{
                if(curr == '+'){
                    sign = '+';
                }else if(curr == '-'){
                    sign = '-';
                }else if(curr == '('){
                    stack.offerFirst(String.valueOf(temp));
                    stack.offerFirst(String.valueOf(sign));
                    stack.offerFirst(String.valueOf(curr));
                    temp = 0;
                    sign = '+';
                }else{
                    if(stack.peekFirst().equals("(")){
                        stack.pollFirst();
                        String tsign = stack.pollFirst();
                        int a = Integer.parseInt(stack.pollFirst());
                        if(tsign.equals("+")){
                            temp = temp + a;
                            sign = '+';
                        }else{
                            temp = a - temp;
                            sign = '+';
                        }
                    }else{
                        int a = Integer.parseInt(stack.pollFirst());
                        stack.pollFirst();
                        String tsign = stack.pollFirst();
                        int b = Integer.parseInt(stack.pollFirst());
                        if(tsign.equals("+")){
                            temp = a + b;
                            sign = '+';
                        }else{
                            temp = b - a;
                            sign = '+';
                        }
                    }
                    
                    
                }
            }
            System.out.println("temp = "+temp);
            System.out.println(stack.size());
            System.out.println(stack.peekFirst());
        }
        return temp;
    }
    public static boolean isNumber(char curr){
        if(curr - '0' >= 0 && curr - '0' <= 9){
            return true;
        }else{
            return false;
        }
    }
	
}
