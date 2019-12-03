class MyClass{
public static void main(String[] args){
	  if(args.length<2){
		  System.out.println("less number of arguments pls pass min 2 numbers");
	  }else{
      int x=Integer.parseInt(args[0]);
	  int y=Integer.parseInt(args[1]);
	  int sum=x+y;
	  System.out.println("Sum :"+sum);
	  }
}

}