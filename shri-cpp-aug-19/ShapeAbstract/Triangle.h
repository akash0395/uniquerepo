#ifndef __TRI_H__
#define __TRI_H__

#include <iostream>
#include "Shape.h"
using namespace std;

class Triangle : public Shape
{
	int p1,p2,p3;
	public:
		
		Triangle()
		{
			cout<<"Triangle::Triangle()"<<endl;
			p1=3;	
		}
		
		~Triangle()
		{
			cout<<"Triangle::~Triangle()"<<endl;
			p2=4;			
		}
		
		void draw()
		{
			cout<<"Triangle::Draw()"<<endl;
		}
};

#endif

