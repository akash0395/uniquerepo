
#ifndef __SHAPE_H__
#define __SHAPE_H__

#include <iostream>
using namespace std;

class Shape
{
	int i;
	
	public:
		Shape()
		{
			cout<<"Shape::Shape()"<<endl;
			i=0;			
		}
		
	virtual	~Shape()
		{
			cout<<"Shape::~Shape()"<<endl;
			i=-i;			
		}
		
		virtual void draw()=0;		
		
		void show()
		{
			cout<<"Shape::Show()"<<endl;
		}
};

#endif

