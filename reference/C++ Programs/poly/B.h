

#ifndef _B__H_
#define _B__H_

#include "A.h"

class B : public A
{
	int j;
public:
	B(int x=0, int y=0);
	~B();
	void fun();
	void display();

};

#endif
