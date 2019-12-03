
#include <cstdio>
#include "Circle.h"

void Circle::display()
{
	printf("Rad=%d with center @ ", rad);
	center.display();
}

float Circle::getArea()
{
	return (3.14 * rad * rad);
}

Circle::Circle() : center(0,0)
{
	printf("Circle::Circle() \n");
	rad=1;
	
}

Circle::Circle(int rr) : center(0,0)
{
	printf("Circle::Circle(int) \n");
	rad=rr;
}

Circle::Circle(int rad, int x, int y) : 	center(x,y)
{
	printf("Circle::Circle(int, int, int) \n");
	this->rad=rad;
}


Circle::~Circle()
{
	rad=0;
	printf("bye...\n");	
}



