
#include <iostream>
using namespace std;
#include "B.h"

B::B(int x, int y) : A(x)
{
	cout<<"B::B(int,int)"<<endl;
	j=y;
}

void B::fun(int x, int y)
{
	cout<<"B::fun(int,int)"<<endl;
}

void B::fun(int x)
{
	cout<<"B::fun(int)"<<endl;
}

B::~B()
{
	cout<<"B::~B()"<<endl;
}


