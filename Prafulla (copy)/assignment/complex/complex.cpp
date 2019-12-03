#include<iostream>
#include<ostream>
using namespace std;
#include "complex.h"

complex :: complex()
{
	this->real=10;
	this->img =20;
	//cout<<this->real<<endl<<this->img;
}
	
complex :: complex(int x)
{
	this->real=x;
	this->img =x;
	//cout<<endl<<this->real<<endl<<this->img;
}

complex :: complex(int x,int y)
{
	this->real=x;
	this->img =y;
	//cout<<endl<<this->real<<endl<<this->img;
}

void complex :: operator=(const complex &x)
{	
	this->real=x.real;
	this->img=x.img;
	
}



complex operator+(const complex &x,const complex &y)
{
	
	complex temp;
	temp.real=x.real+y.real;
	temp.img=x.img+y.img;
return temp;
}
ostream& operator<<(ostream& out,complex &x)
{
	out<<endl<<"Real number :"<<x.real;
	out<<endl<<"img number :"<<x.img;
	return out;

}

