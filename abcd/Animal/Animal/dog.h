

#ifndef _DOG__H_
#define _DOG__H_
#include<iostream>
#include<ostream>
#include"Animal.h"
using namespace std;

class dog:public Animal
{
	int age;
	char *name;
public:
	dog();
	dog(const char *z,int x);
	void speak();
	~dog();
	//friend bool operator>(dog &);
	//friend ostream& operator(ostream& out,Animal* x);


};
#endif

