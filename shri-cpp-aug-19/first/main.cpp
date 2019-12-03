#include <iostream>
#include "Circle.h"

int fun(int argc, char** argv) 
{
	int i;
	Circle c1;
	c1.populateMe(44,55,66);
	
	
	Circle c2(10,20,30);
	
	
	c1.showMe();
	c2.showMe();

	{
			Circle c3;
			c3.showMe();
	}	
	printf("C1 Area: %f\n", c1.getArea());
	printf("C2 Area: %f\n", c2.getArea());
	
	return 0;
}


