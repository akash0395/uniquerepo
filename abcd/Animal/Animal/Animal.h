#ifndef _ANIMAL__H_
#define _ANIMAL__H_
#include<iostream>
#include<ostream>
using namespace std;

class Animal
{
	int age;
	char *name;
public:
	Animal();
	Animal(const char *z,int x);
	void speak();
	virtual~Animal(); 
	friend ostream& operator<<(ostream& out,Animal *x);
	bool operator>(dog &);
	

};
#endif

