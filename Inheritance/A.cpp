#include<iostream>
using namespace std;

#include"A.h"

A::A()
{
	cout<< "A::A"<<endl;
}


A::A(int x)
{
	i=x;
	cout<< "A::A(int i)"<<endl;
}

A::~A()
{
	cout<< "~A::A"<<endl;
}


void A::fun()
{
	cout<< "A::fun"<<endl;
}

void A::fun(int x)
{
	i=x;
	cout<<" A::fun(int x)"<<endl;

}
