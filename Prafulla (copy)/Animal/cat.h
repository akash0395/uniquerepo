#ifndef _CAT_H_
#define _CAT_H_
#include "dog.h"
#include "Animal.h"


class cat : public Animal
{	
	protected:
		int height;
	
	public:
		
		cat( const char *name, int age,int height);
		 void speak();
		friend ostream& operator<<(ostream& out,Animal *x);
		~cat();
		
		
};
#endif
