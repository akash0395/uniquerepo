
#include <cstdio>
#include "Circle.h"

void Circle::display()
{
	printf("Rad=%d with center @ (%d,%d) \n", rad, x, y);	
}

float Circle::getArea()
{
	return (3.14 * rad * rad);
}

Circle::Circle()
{
	printf("Circle::Circle() \n");
	rad=1;
	x=0;
	y=0;
}

Circle::Circle(int rr)
{
	printf("Circle::Circle(int) \n");
	rad=rr;
	x=0;
	y=0;
}

Circle::Circle(int rad, int x, int y)
{
	printf("Circle::Circle(int, int, int) \n");
	this->rad=rad;
	this->x=x;
	this->y=y;
}


Circle::~Circle()
{
	rad=0;
	x=0;
	y=0;
	printf("bye...\n");	
}



