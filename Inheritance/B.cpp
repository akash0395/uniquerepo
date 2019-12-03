#include<iostream>
using namespace std;

#include"B.h"



B::B(int x,int y):A(x)	//initializing list
{
//i=x;
	j=y;
	cout<< "B::B"<<endl;
}
void B::fun(int x)
{
	cout<< "B::fun(int )"<<endl;
}

void B::fun(int x,int y)
{
	cout<<"B::fun(int ,int)"<<endl;
}

void B::fun2()
{
	cout<<"B::fun2()"<<endl;

}

B::~B()
{
	cout<< "~B::B"<<endl;
}


