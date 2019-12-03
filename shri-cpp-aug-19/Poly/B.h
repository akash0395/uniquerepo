
#ifndef __B__H__
#define __B__H__

#include "A.h"

class B : public A
{
	int j;
public:
	B();
	~B();
	void operator=(B &);
	B(B&);
	void show(int);
	virtual  void fun();
};

#endif

