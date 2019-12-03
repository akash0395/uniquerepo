#include "cat.h"
#include<iostream>
using namespace std;
#include<cstring>
#include "dog.h"
#include "Animal.h"




cat::cat(const char *name, int age,int height): Animal(name,age)
{
	this->height=height;
}


void cat:: speak()
{
	//cout<<endl<<"🐱🐱🐱🐱🐱🐱🐱🐱🐱"		
	cout<<"cat";
}
cat::~cat()
{
	delete this->name;
	cout<<endl<<"cat::~cat()"<<endl;
}



