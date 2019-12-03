#ifndef _ANIMAL_H_
#define _ANIMAL_H_
#include <ostream>
using namespace std;



class Animal
{

public:
	
	char *name;
	int age;


	Animal();
	Animal(int age);
	Animal(const char *name,int age);
	
	virtual ~Animal();
	
	virtual  void speak()=0;

	friend ostream& operator<<(ostream& out,Animal *x);
	friend bool operator > (Animal &x,Animal &y);
	
	



};
#endif
