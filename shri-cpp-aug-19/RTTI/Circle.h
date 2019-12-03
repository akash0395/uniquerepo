#ifndef __CIRCLE_H__
#define __CIRCLE_H__

#include <iostream>
#include "Shape.h"
using namespace std;

class Circle : public Shape
{
	int j;
	public:
		
		void draw()
		{
			cout<<"Circle::Draw()"<<endl;
		}
		
		void fun_Circle()
		{
			cout<<"Circle::fun_Circle()"<<endl;
		}
		
};

#endif

