#include<iostream>

using namespace std;

#include"A.h"
#include"B.h"


int main()
{
	A *ptr= new B();
	ptr->fun();
	ptr->fun(10);
	delete ptr;



return 0;
}
