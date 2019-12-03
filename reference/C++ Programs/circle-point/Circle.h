
#include "Point.h"

class Circle
{
	int rad;
	Point center;
	
	//-------------------
public:	
	void display();
	float getArea();
	Circle();
	Circle(int );
	Circle(int, int, int);
	~Circle();
};

