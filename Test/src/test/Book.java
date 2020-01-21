package test;

public class Book implements Comparable<Book>{
	public String name;
	public int value;
	public Book(String name, int value) {
		this.name = name;
		this.value = value;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(this.value>o.value) {
			return -1;
		}
		return 1;
	}
}
