

#include <iostream>
using namespace std;
#include "A.h"

A::A(int x)
{
	i=x;
	cout<<"A::A()"<<endl;
}

A::A()
{
	i=0;
	cout<<"A::A()"<<endl;
}

A::~A()
{
	cout<<"A::~A()"<<endl;
}

void A::fun()
{
	cout<<"A::fun()"<<endl;
}



