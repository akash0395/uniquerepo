#include "Number.h"
#include<iostream>	
#include<istream>
#include<ostream>

using namespace std;

	Number :: Number()
	{
		i=10;
		j=20;
		cout<<"Number :: Number()"<<endl;
	}
	
	Number :: Number(int x,int y)
	{
		this->i=x;
		this->j=y;	
		cout<<"Number :: Number(int int)"<<endl;
	}
	Number :: ~Number()
	{
		cout<<endl<<"Destructor";
	}
	
	Number :: Number(Number &x)
	{
		this->i=x.i;
		this->j=x.j;

	}
	void Number :: operator=(const Number& x)
	{	
		int q=this->i;
		int k=this->j;
	
		this->i=x.i;
		this->j=x.j;

	}
	
	Number Number:: operator+(Number& x)
	{
		Number temp;
		

		temp.i=this->i+x.i;
		temp.j=x.j+this->j;	
	
		return temp;



	}



	ostream& operator<<(ostream& out,Number& x)
	{
		out<<endl<<"i is "<<x.i<<endl;
		out<<endl<<"j is "<<x.j<<endl;
		return out;

	}	


	istream& operator>>(istream& in,Number& x)
	{
		cout<<"Enter theNumber One:";
		in>>x.i;
	
		cout<<"Enter the Second Number:";
		in>>x.j;

	}




