
#include <iostream>
#include <ostream>
#include <istream>

using namespace std;
#include "Number.h"


Number::Number()
{
	i=0;
}

Number::Number(int j)
{
	i=j;
}

Number::~Number()
{
	i=-1;
}

Number Number::operator+(Number& x)
{
	//num1+num2
	//this ==> num1
	//x ==> num2

//	Number tmp(this->i + x.i);

	Number tmp;
	tmp.i = this->i + x.i;
	return tmp;
}

void Number::operator=(const Number& x)
{
	//num1=num2
	//this ==> num1
	//x ==> num2
	this->i = x.i;		
}

ostream& operator<<(ostream& out, Number& x)
{
	out<<"Value Of I is"<<x.i;
	return out;
}

istream& operator>>(istream& in, Number& x)
{
	cout<<"Enter any number:"<<endl;
	in>>x.i;
}



