
#include "A.h"
#include "B.h"

/*
B* abc()
{
	B* bptr = new B();
	return bptr;		
}
*/

int main()
{
//	B *ptr = abc();

	A *ptr = new B();
	ptr->fun();
	ptr->fun(10);
	delete ptr;
}

