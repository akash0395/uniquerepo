
#include "Shape.h"

class MyClass
{
	
	public:
		
	void fun(Shape *s)
	{
		s->draw();		
		Circle* pptr = dynamic_cast<Circle*>(s);
		if(pptr != NULL)
		{
			//the incoming object is of type Circle
			pptr->fun_Circle();
		}
		else
		{
			Triangle* ptr = dynamic_cast<Triangle*>(s);
			if(ptr != NULL)
			{
				//the incoming object is of type Triangle
				ptr->fun_Triangle();
			}			
		}
	}
};

