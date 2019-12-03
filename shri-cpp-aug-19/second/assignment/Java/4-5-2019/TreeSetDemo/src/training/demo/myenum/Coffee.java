package training.demo.myenum;

public enum Coffee {
	Large(200,50),Medium(150,40),Small(100,25);
	private int size;
	private int price;
	private Coffee(int s,int p) {
		size=s;
		price=p;
	}
	
	public int getSize() {
		return size;
	}
	public int getPrice() {
		return price;
	}

}
