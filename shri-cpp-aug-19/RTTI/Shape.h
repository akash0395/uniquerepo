
#ifndef __SHAPE_H__
#define __SHAPE_H__

#include <iostream>
using namespace std;

class Shape
{
	int i;
	public:
		
		virtual void draw()
		{
			cout<<"i dont know how to draw.."<<endl;
		}
};

#endif

