package z3;

public class ImplementQueueUsingStack {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		QueueClass queueClass = new QueueClass();
		queueClass.enQueue(1);
		queueClass.enQueue(2);
		queueClass.enQueue(3);
		System.out.println(queueClass.deQueue());
		System.out.println(queueClass.deQueue());
		System.out.println(queueClass.deQueue());
		System.out.println(queueClass.deQueue());
	}
	

}
