#include<iostream>
#include <ostream>
using namespace std;
#include "Animal.h"
#include "cat.h"
#include<cstring>

Animal::Animal()
{
	this->name=new char(1);
	this->age=0;
	cout<<"Animal::Animal()"<<endl;
}

Animal::Animal(const char *name,int age)
{
	this->name=new char(strlen(name));
	strcpy(this->name,name);
	this->age=age;

}


Animal::Animal(int age)
{
		delete this->name;
		this->name=new char(20);
		strcpy(this->name,"unknown");
		this->age=age;
		//cout<<"name : "<<this->name<<endl<<"age : "<<this->age<<endl;
		
	

}


Animal::~Animal()
{
	delete this->name;
	cout<<endl<<"Animal::~Animal()"<<endl;
}


ostream& operator<<(ostream& out,Animal *x)
{
	out<<endl<<"name:"<<x->name;
	out<<endl<<"age:"<<x->age;
	cat *ptr=dynamic_cast<cat *>(x);
	if(ptr != NULL)
	{
		out<<endl<<"height :"<<ptr->height;

	}
}

bool operator > (Animal &x,Animal &y)
{


	if(x.age > y.age)
	{
		
		return true;
	}
	else
	{
		
		return false;	
	}
}

