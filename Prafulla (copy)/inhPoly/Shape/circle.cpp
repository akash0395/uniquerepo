#include "circle.h"
#include <iostream>
using namespace std;


circle::circle()
{
	cout<<endl<<"circle::circle()";
	
	
}
circle::~circle()
{
	cout<<endl<<"circle::~circle()";

}
void circle :: draw()
{

	cout<<endl<<" void circle::draw()";

}


void circle :: fun(int a,int b)
{
	this->a=a;
	this->b=b;
	cout<<endl<<"value of a:"<<this->a<<endl<<"value of b:"<<this->b;


}
void circle :: fun()
{
cout<<endl<<" void circle :: fun()";


}


