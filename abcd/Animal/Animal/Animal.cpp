#include"Animal.h"
#include"dog.h"
#include<cstring>
using namespace std;


Animal::Animal()
{
	cout<<"In Animal default consructor"<<endl;


}
Animal::Animal(const char *z,int x)
{	
	name=new char[strlen(z)+1];
	strcpy(name,z);
	name[strlen(z)+1]='\0';
	age=x;
	cout<<"name"<<name<<endl;
	cout<<"age"<<age<<endl;
	
	

}
Animal::~Animal()
{
	cout<<"In ~Animal destructor"<<endl;
}
ostream& operator<<(ostream& out,Animal* x)
{
	out<<"name"<<x->name<<endl;
	out<<"age"<<x->age<<endl;
return out;

}
void Animal:: speak()
{
	cout<<"Animal speak"<<endl;

}

bool cat::operator>(dog &x)
{
	if(this->age>x.age)
	return true;
	else
	return false;
	
}







