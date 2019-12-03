#include<iostream>
using namespace std;
#include"Shape.h"
#include"Circle.h"



Circle::Circle()
{
	rad=0;
	cout<<"Circle::Circle()"<<endl;
}

Circle::Circle(int x)
{
	rad=x;
	cout<<"Circle::Circle(int)"<<endl;
}
	
Circle::~Circle()
{
	cout<<"Circle::~Circle()"<<endl;

}
	

float Circle::area()
{
	float area=3.14*rad*rad;
	
	return area;


}


void Circle::display(float x)
{

	cout<<"area of Circle is "<<x<<endl;
	


}



