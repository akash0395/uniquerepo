#include"ABC.h"

int main()
{	
	ABC a(10,"hellooo");;
	a.display();
	
	ABC b(132,"thereeee");
	b.display();
	
	ABC d(664,(char *)"Assignment operator check");	
	d.display();
	
	printf("----assignment operator ------\n");
	b.operator=(d);//b=d and b.operator=(d) both are same;
	b.display();

	printf("------+operator-------\n");
	ABC e;
	e=a+b;
	e.display();
	
	printf("--------copy constructor-------\n");
	ABC c(a);	
	c.display();
	
	
		



return 0;
}
