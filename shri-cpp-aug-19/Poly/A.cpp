#include <iostream>
#include "A.h"
using namespace std;

A::A()
{
	cout<<"A::A()"<<endl;
}

A::~A()
{
	cout<<"A::~A()"<<endl;
}

void A::operator=(A &)
{
	cout<<"A::operator=()"<<endl;
}

A::A(A&)
{
	cout<<"A::A(A)"<<endl;
}

void A::show()
{
	cout<<"A::show()"<<endl;
}

void A::show(int)
{
	cout<<"A::show(int)"<<endl;
}

void A::fun()
{
	cout<<"A::fun()"<<endl;
}

