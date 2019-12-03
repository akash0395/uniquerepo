#include"cat.h"
#include<cstring>
using namespace std;


cat::cat()
{
	cout<<"In cat default consructor"<<endl;


}
cat::cat(const char *z,int x)
{	
	name=new char[strlen(z)+1];
	strcpy(name,z);
	name[strlen(z)+1]='\0';
	age=x;
	cout<<"name"<<name<<endl;
	cout<<"age"<<age<<endl;
	
	

}
cat::~cat()
{
	cout<<"In ~cat destructor"<<endl;


}/*
ostream& operator(ostream& out,Animal* x)
{
	out<<"name"<<x->name<<endl;
	out<<"age"<<x->age<<endl;
return out;
}
*/
void cat::speak()
{
	cout<<"cat speak"<<endl;

}

