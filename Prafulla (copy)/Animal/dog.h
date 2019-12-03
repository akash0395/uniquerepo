#ifndef _DOG_H_
#define _DOG_H_
#include<ostream>
#include<iostream>
using namespace std;
#include "Animal.h"
#include "cat.h"

class dog :public Animal
{
	public:
		dog( int age);
		dog(const dog& d);
		dog(const char *name, int age);
		~dog();		
		
		 void speak();
		
		

};
#endif
