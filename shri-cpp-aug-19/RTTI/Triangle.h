#ifndef __TRI_H__
#define __TRI_H__

#include <iostream>
#include "Shape.h"
using namespace std;

class Triangle : public Shape
{
	int k;
	int x;
	public:
		
		void draw()
		{
			cout<<"Triangle::Draw()"<<endl;
		}
		
		void fun_Triangle()
		{
			cout<<"Triangle::fun_Triangle()"<<endl;
		}
};

#endif

