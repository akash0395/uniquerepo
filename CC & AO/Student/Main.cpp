#include"Student.h"

int main()
{	
	Student a(10,85.2,"Omkar");
	a.display();
	
	Student b(13,78.9,"Ajay");
	b.display();
	
	Student d(27,67,"Kartik");	
	d.display();
	
	printf("----assignment operator ------\n");
	b.operator=(d);//b=d and b.operator=(d) both are same;
	b.display();

	printf("------+operator-------\n");
	Student e;
	e=a+b;
	e.display();
	
	printf("--------copy constructor-------\n");
	Student c(a);	
	c.display();
	
	
		



return 0;
}
