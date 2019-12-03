#include <cstdio>
#include "Point.h"

Point::Point()
{
	printf("Point::Point() \n");	
	x=y=0;
}

Point::Point(int x, int y)
{
	printf("Point::Point(int,int) \n");	
	this->x=x;
	this->y=y;
}

void Point::display()
{	
	printf(" x=%d, y=%d\n", x, y);
}

Point::~Point()
{
	printf("Point::~Point() \n");	
}

