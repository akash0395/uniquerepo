#include "shape.h"
#include <iostream>
using namespace std;


shape::shape()
{
	cout<<endl<<"shape::shape()";
}
shape::~shape()
{
	cout<<endl<<"shape::~shape()";

}
void shape :: draw()
{

	cout<<endl<<" void shape::draw()";

}


void shape:: fun(int a)
{

	this->i=a;
	cout<<endl<<"I value is :"<<this->i;


}

void shape :: fun()
{

	cout<<endl<<"void shape:: fun()";

}
