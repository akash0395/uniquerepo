package training.demo.test;

import java.util.Scanner;

import training.demo.model.Circle;

import training.demo.model.ShapeImpl;
import training.demo.model.Triangle;

public class TestShape {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ShapeImpl[] s=new ShapeImpl[3];
		for(int i=0;i<s.length;i++) {
		System.out.println("1. Triangle");
		System.out.println("2. Circle");
		System.out.println("3. Rectangle");
		System.out.println("choice: ");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			s[i]=new Triangle(23,16,12,12);
			//System.out.println("Area : " +s.area());
			//System.out.println("Perimeter : " +s.perimeter());
			break;
		case 2:
			s[i]=new Circle(12);
			//System.out.println("Area : " +s.area());
			//System.out.println("Perimeter : " +s.perimeter());
			break;
		}
		if( s[i] instanceof Triangle) {
			System.out.println("triangle selected");
		}
		else
			if(s[i] instanceof Circle){
				System.out.println("circle selected");
		}
		System.out.println("Area : " +s[i].area());
		System.out.println("Perimeter : " +s[i].perimeter());
	}
	}
}
