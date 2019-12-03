
#include"Triangle.h"


Triangle::Triangle()
{
	l=1;
	b=1;

}

Triangle::Triangle(int len,int bre)
{
	l=len;
	b=bre;

}

Triangle::~Triangle()
{

}

void Triangle::CalculateArea(int le,int br)
{
	float Area=((le*br)/2);
	printf("area is %f \n",Area);
}

void Triangle::CalculateArea()
{
	float AreaT=((l*b)/2);
	printf("area is %f\n",AreaT);

}
	






