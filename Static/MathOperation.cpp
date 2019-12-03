#include<iostream>
using namespace std;

#include"Number.h"
#include"MathOperation.h"


Number MathOperation::Addition(Number& num1,Number& num2)
{
	Number add=num1+num2;
	return add;
	
}

Number MathOperation::subtraction(Number& num1,Number& num2)
{
	Number sub=num1-num2;
	return sub;
	
}



Number MathOperation::Multiplication(Number& num1,Number& num2)
{
	Number mul=num1*num2;
	return mul;
	
}

Number MathOperation::Division(Number& num1,Number& num2)
{
	Number div=num1/num2;
	return div;
	
}

	


/*	Subtraction();
	Multiplication();
	Division();

*/




