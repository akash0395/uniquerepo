#include "complex.h"

int main()
{
	complex *ptr1=new complex();
	//complex ptr1;	
	//cout<<*ptr1;
	complex *ptr2=new complex();
	//complex ptr2;
	complex *ptr3 = new complex();
	*ptr3=*ptr1+*ptr2;
	cout<<*ptr3;
	

	
	
	

return 0;
}
