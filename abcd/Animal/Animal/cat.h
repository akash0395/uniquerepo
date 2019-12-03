#ifndef _CAT__H_
#define _CAT__H_
#include"dog.h"

#include<iostream>
#include<ostream>
#include"Animal.h"
using namespace std;

class cat:public Animal
{
	int age;
	char *name;
public:
	cat();
	cat(const char *z,int x);
	void speak();
	~cat();
	//friend ostream& operator(ostream& out,Animal* x);
	

};
#endif

