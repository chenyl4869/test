package z3;

public class GetMinInTheStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithMinClass s = new StackWithMinClass();
		s.push(2);
		s.push(1);
		s.push(3);
		System.out.println(s.getMin());
		s.pop();
		s.pop();
		System.out.println(s.getMin());
		
	}
	

}
