#include<iostream>
using namespace std;
#include"Number.h"

Number::Number()
{
	i=0;
	cout<<"DEF"<<endl;
}
Number::Number(int j)
{
	i=j;
	cout<<"PAR"<<endl;	
}

Number::~Number()
{
	i=-1;
	cout<<"DES"<<endl;

}
Number::Number(Number& x)
{
	this->i=x;
	cout<<"COPY"<<endl;	
}
	
void Number::operator=(Number& x)
{
	this->i=x;
	cout<<"ASSG"<<endl;

}
