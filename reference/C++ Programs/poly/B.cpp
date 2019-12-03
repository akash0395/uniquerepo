
#include <iostream>
using namespace std;
#include "B.h"

B::B(int x, int y) : A(x)
{
	cout<<"B::B(int,int)"<<endl;
	j=y;
}

B::~B()
{
	cout<<"B::~B()"<<endl;
}

void B::display()
{
	cout<<"B::display()"<<endl;
}

void B::fun()
{
	cout<<"B::fun()"<<endl;
}

