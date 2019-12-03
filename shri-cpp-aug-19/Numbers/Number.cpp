#include "Number.h"
Number::Number()
{
	i=0;
}
Number::~Number()
{
	i=0;
}
Number::Number(Number &x)
{
	this->i = x.i;
}
void Number::operator=(Number &x)
{
	this->i = x.i;
}
Number& Number::operator+(Number& x)
{
	Number a;
	a.i = this->i + x.i;	
	return a;
}

