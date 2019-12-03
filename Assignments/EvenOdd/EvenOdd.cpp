#include<iostream>
#include<ostream>
using namespace std;

#include"EvenOdd.h"


EvenOdd::EvenOdd()
{
	i=0;
}

EvenOdd::EvenOdd(int x)
{
	i=x;
}
EvenOdd::~EvenOdd()
{
	i=-1;
}
EvenOdd::EvenOdd(EvenOdd& x)
{
	this->i=x.i;
}
void EvenOdd::operator=(EvenOdd& x)
{
	this->i=x.i;

}
void EvenOdd::operator!()
{
	if(this->i%2==0)
	{
		cout<<"Even number ";	

	}
	else 
	{
		cout<<"Odd number "<<endl;

	}
}

ostream& operator<<(ostream& out, EvenOdd& x)
{
	out<<x.i;
	return out;

}







