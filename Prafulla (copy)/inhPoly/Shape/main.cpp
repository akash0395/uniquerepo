#include <iostream>
using namespace std;


#include "shape.h"
#include "circle.h"
#include "triangle.h"

int main()
{

	shape *ptr= new circle();
	ptr->draw();
	ptr->fun();
	ptr->fun(100);
	ptr->fun(10,15);



	delete ptr;



return 0;


}


