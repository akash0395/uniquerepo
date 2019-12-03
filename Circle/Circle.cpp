#include"Circle.h"

Circle::Circle()
{
	 rad=1;
	 x=0;
	 y=0;
	//printf("Default Constructor\n");

}
Circle::Circle(int radius,int i,int j)
{
	rad=radius;
	x=i;
	y=j;
	//printf("Paramerised Constructor\n");

}
Circle::~Circle()
{
	//printf("Destructor..\n");

}

void Circle::display(float area)
{
	printf("Area of circle is %f \n\n",area);

}
float Circle::CircleArea(int radius)
{
	float areaC=(3.14*radius*radius);
	return areaC;

}
float Circle::CircleArea()
{
	float CCarea=(3.14*rad*rad);
	return CCarea;

}

