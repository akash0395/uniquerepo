#ifndef __CIRCLE_H_
#define __CIRCLE_H_
#include "shape.h"
class circle : public shape
{
	int a,b;
	public:
		circle();
		~circle();
		void draw();
		//using shape::fun;
		void fun(int a,int b);
		void fun();








};
#endif
