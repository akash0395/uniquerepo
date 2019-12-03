#include<iostream>
using namespace std;
#include"Shape.h"
#include"Triangle.h"


Triangle::Triangle()
{
	l=0;
	h=0;
	cout<<"Trinagle::Trinagle()"<<endl;
}

Triangle::Triangle(int ln,int ht)
{
	l=ln;
	h=ht;


}

	
Triangle::~Triangle()
{
	cout<<"Trinagle::~Trinagle()"<<endl;

}



float Triangle::area()
{
	float area=l*h/2;
	
	return area;


}

void Triangle::display(float x)
{

	cout<<"area of Triangle is "<<x<<endl;
	


}
