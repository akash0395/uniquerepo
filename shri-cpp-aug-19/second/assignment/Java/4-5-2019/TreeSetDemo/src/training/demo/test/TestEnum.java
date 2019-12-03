package training.demo.test;

import training.demo.myenum.Coffee;

public class TestEnum {

	public static void main(String[] args) {
		Coffee c=Coffee.Large;
		switch(c) {
		case Large:
			System.out.println("large seleceted"+c.getSize());
			System.out.println("large seleceted"+c.getPrice());
			break;
		case Medium:
			System.out.println("medium seleceted"+c.getPrice());
			break;
		case Small:
			System.out.println("small seleceted"+c.getPrice());
			break;
			
		}

	}

}
