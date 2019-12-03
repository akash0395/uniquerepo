import java.util.Scanner;

public class MyClass2 {
	//variable argument function
	public static void f1(int a,int b,String...s) {
		
		System.out.println("in f1 function");
	}
    public static void accept1Darray(int[] arr) {
    	Scanner sc=new Scanner(System.in);
    	for(int i=0;i<arr.length;i++) {
			System.out.println(i+": ");
			arr[i]=sc.nextInt();
		}
    }
	public static void display1Darray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("i: "+arr[i]);
			
		}
		
	} 
	public static void accept2Darray(int[][] matrix) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<matrix.length;i++) {  ///row
			for(int j=0;j<matrix[0].length;j++) { //column
				System.out.println(i+": "+j);
				matrix[i][j]=sc.nextInt();
				
			}
			
		}
		
	}
	public static void display2Darray(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {  ///row
			for(int j=0;j<matrix[0].length;j++) { //column
				System.out.println(i+": "+j+"--->"+matrix[i][j]);
				
			}
			
		}
	}
	public static void findrowwisesum(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) { 
			int sum=0;///row
			for(int j=0;j<matrix[0].length;j++) { //column
		          sum+=matrix[i][j];
			}
			System.out.println("Sum row "+i+"---->"+sum);
		}
		
		}
		
		
	
	
	public static void main(String[] args) {
		//MyClass2 ob=new MyClass2();
		//MyClass2.f1(12,23,"fhgfghf","45");
		System.out.println("enter size: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int[] arr=new int[x];
		int[][] matrix=new int[3][3];
		int[][] matrix1=new int[3][3];
		//int[] arr1= {12,34,56,1,78};
		//int arr[20]; //Error
		accept1Darray(arr);
		display1Darray(arr);
		accept2Darray(matrix);
		display2Darray(matrix);
		findrowwisesum(matrix);
		accept2Darray(matrix1);
	}
}


