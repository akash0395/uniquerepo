
#ifndef __C__H__
#define __C__H__

#include "A.h"
#include "B.h"

class C : public A, public B
{
public:
	C();
	~C();
};

#endif

