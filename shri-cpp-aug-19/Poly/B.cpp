

#include <iostream>
#include "B.h"
using namespace std;

B::B()
{
	cout<<"B::B()"<<endl;
}

B::~B()
{
	cout<<"B::~B()"<<endl;
}

void B::operator=(B &)
{
	cout<<"B::operator=()"<<endl;
}

B::B(B&)
{
	cout<<"B::B(B)"<<endl;
}

void B::show(int x)
{
	cout<<"B::show(int x)"<<endl;
}

void B::fun()
{
	cout<<"B::fun()"<<endl;
}


