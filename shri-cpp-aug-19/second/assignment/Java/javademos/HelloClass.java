class HelloClass{
public static void main(String[] args){
	  if(args.length<1){
		  System.out.println("less number of arguments pls pass min 1 name");
		  System.out.println("java HelloClass Kishori .......");
	  }else{
       for(int i=0;i<args.length;i++){
	       System.out.println("Hello :"+args[i]);}
	  }
}

}