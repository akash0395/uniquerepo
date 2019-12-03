#ifndef __CIRCLE_H__
#define __CIRCLE_H__

#include <iostream>
#include "Shape.h"
using namespace std;

class Circle : public Shape
{
	int rad;
	
	public:
	
		Circle()
		{
			cout<<"Circle::Circle()"<<endl;
			rad=0;			
		}
		
		~Circle()
		{
			cout<<"Circle::~Circle()"<<endl;
			rad=-2;			
		}
			
			
};

#endif

