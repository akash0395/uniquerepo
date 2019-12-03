#include"dog.h"
#include<cstring>
using namespace std;


dog::dog()
{
	cout<<"In dog default consructor"<<endl;


}
dog::dog(const char *z,int x)
{	
	name=new char[strlen(z)+1];
	strcpy(name,z);
	name[strlen(z)+1]='\0';
	age=x;
	cout<<"name"<<name<<endl;
	cout<<"age"<<age<<endl;
	
}/*
ostream& operator(ostream& out,Animal* x)
{
	out<<"name"<<x->name<<endl;
	out<<"age"<<x->age<<endl;
return out;
}*/
dog::dog speak()
{
	cout<<"dog speak"<<endl;

}


dog::~dog()
{
	cout<<"In ~dog destructor"<<endl;


}
