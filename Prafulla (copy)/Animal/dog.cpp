#include "dog.h"
#include "cat.h"
#include "Animal.h"
#include<iostream>
#include<ostream>
using namespace std;

#include<cstring>	
	
dog::dog( int age): Animal(age)
{
	
}

dog::dog(const char *name, int age):Animal(name,age)
{
	
}

dog::dog(const dog& d)
{
	this->name=new char(strlen(d.name)+1);
	strcpy(this->name,d.name);
	this->name[strlen(this->name)]='\0';
	this->age=d.age;
	//cout<<"name : "<<this->name<<endl<<"age : "<<this->age<<endl;
	cout<<"dog::dog(const dog& d)"<<endl;
	


}


	dog::~dog()
	{
		delete this->name;
		cout<<endl<<"dog::~dog()"<<endl;

	}
	
	 void dog:: speak()
	{
		//cout<<"🐕🐕🐕🐕🐕🐕🐕🐕🐕";		
		cout<<"Dog";


	}

	



	
