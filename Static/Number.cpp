 #include<iostream>
#include<ostream>
using namespace std;


#include"Number.h"

	
Number::Number()
{
	cout<<"Default"<<endl;
	i=0;
}
Number::Number(int j)
{
	cout<<"Para"<<endl;
	i=j;
}
Number::~Number()
{
	cout<<"Destr"<<endl;
	i=-1;
}
Number::Number(const Number& x)
{	
	cout<<"Copy"<<endl;
	this->i=x.i;
}
void Number::operator=(const Number& x)
{
	cout<<"Assignment"<<endl;
	this->i=x.i;
}


ostream& operator<<(ostream& out, Number& x)
{
	out<<x.i;
	return out;
}

Number Number::operator+(Number& x)
{
	Number temp;	
	temp.i=this->i+x.i;
	return temp;
	
}

Number Number::operator-(Number& x)
{
	Number temp;	
	temp.i=this->i-x.i;
	return temp;
	
}


Number Number::operator*(Number& x)
{
	Number temp;	
	temp.i=this->i*x.i;
	return temp;
	
}

Number Number::operator/(Number& x)
{
	Number temp;	
	temp.i=this->i/x.i;
	return temp;
	
}











