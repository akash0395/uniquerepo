#include<iostream>
using namespace std;
#include"Shape.h"
#include"Rectangle.h"


Rectangle::Rectangle()
{
	l=0;
	b=0;
	cout<<"Rectangle::Rectangle()"<<endl;
}

Rectangle::Rectangle(int ln,int ht)
{
	l=ln;
	b=ht;
	cout<<"Rectangle::Rectangle(int int)"<<endl;


}

	
Rectangle::~Rectangle()
{
	cout<<"Rectangle::~Rectangle()"<<endl;

}



float Rectangle::area()
{
	float area=l*b;
	
	return area;


}

void Rectangle::display(float x)
{

	cout<<"area of Rectangle is "<<x<<endl;
	


}
