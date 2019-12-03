#ifndef _Number__H_
#define _Number__H_
#include<istream>
#include<ostream>
#include<iostream>
using namespace std;


class Number
{
	

public:
	int i,j;
	Number();
	Number(int x,int y);
	~Number();
	
	Number(Number &x);
	void operator=(const Number& x);
	Number operator+(Number& x);
	friend ostream& operator<<(ostream& out,Number& x);
	friend istream& operator>>(istream& in,Number& x);
	
};

#endif
















