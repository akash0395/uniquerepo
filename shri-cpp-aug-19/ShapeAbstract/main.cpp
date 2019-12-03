#include <iostream>
#include "Shape.h"
#include "Circle.h"
#include "Triangle.h"

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) 
{
	/*Shape *ptr = new Shape();
	ptr->draw();
	delete ptr;*/
	
	//============================
	
	Shape * ptr = new Circle();
	ptr->draw();
	delete ptr;
	
	//============================
	
	/*ptr = new Triangle();
	ptr->draw();
	delete ptr;*/
	
	
}
