#include<iostream>
using namespace std;

#include"Shape.h"
#include"Circle.h"
#include"Triangle.h"
#include"Rectangle.h"
int main()
{
	Shape* ptr=new Rectangle(3,8);
	float AREA=ptr->area();
	ptr->display(AREA);
	



	delete ptr;
return 0;
}
