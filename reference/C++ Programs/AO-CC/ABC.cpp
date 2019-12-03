#include "ABC.h"
#include <cstring>
#include <iostream>
using namespace std;

ABC::ABC()
{
	cout<<"ABC::ABC"<<endl;
	i=0;
	ptr=new char[10000000];
	strcpy(ptr,"dontknow");
}

ABC::ABC(const char* str)
{
	cout<<"ABC::ABC(char*)"<<endl;
	i=10;
	ptr=new char[strlen(str) + 10000000];
	strcpy(ptr,str);
}

ABC::~ABC()
{
	cout<<"ABC::~ABC"<<endl;
	delete [] ptr;
}

ABC::ABC(const ABC &x)
{
	// ABC d(a);
	// Here a will be access by this
	// And b is access by x
	cout<<"ABC::ABC(ABC)"<<endl;
	this->i=x.i;
	this->ptr = new char[strlen(x.ptr)+10000000];
	strcpy(this->ptr,x.ptr);
	this->ptr[strlen(x.ptr)]='\0';	
}

void ABC::operator=(const ABC &x)
{
	// a=b;
	// Here a will be access by this
	// And b is access by x

	cout<<"ABC::operator=(ABC)"<<endl;
	if(this!=&x)
	{
		this->i=x.i;
		delete [] this->ptr;
		this->ptr=NULL;	
		this->ptr = new char[strlen(x.ptr)+10000000];
		strcpy(this->ptr,x.ptr);
		this->ptr[strlen(x.ptr)]='\0';	
	}
}

void ABC::operator=(int x)
{
	// a=10;
	// Here a will be access by this
	// And 10 is access by x
	cout<<"ABC::operator=(int)"<<endl;
	this->i=x;
}


ABC ABC::operator+(const ABC &x)
{
	// b+c;
	// Here b will be access by this
	// And c is access by x
	ABC tmp;
	tmp.i= this->i + x.i;	

     tmp.ptr= new char[strlen(this->ptr) + strlen(x.ptr) + 10000000];
     strcpy(tmp.ptr, this->ptr);
     strcpy(tmp.ptr + strlen(this->ptr), x.ptr);
     tmp.ptr[strlen(this->ptr) + strlen(x.ptr)]='\0';

     return tmp;
}

ABC ABC::operator+(int x)
{
	// b+30;
	// Here b will be access by this
	// And 30 is access by x
	ABC tmp;
	tmp.i= this->i + x;	

     tmp.ptr= new char[strlen(this->ptr) + 10000000];
     strcpy(tmp.ptr, this->ptr);
     tmp.ptr[strlen(this->ptr)]='\0';
     return tmp;
}


ABC operator+(int ii, ABC &x)
{
	// 30+b;
	// Here b will be access by x
	// And 30 is access by ii
	ABC tmp;
	tmp.i= ii + x.i;

     tmp.ptr= new char[strlen(x.ptr) + 10000000];
     strcpy(tmp.ptr, x.ptr);
     tmp.ptr[strlen(x.ptr)]='\0';
     return tmp;
}


void ABC::display()
{
	cout<<"I="<<i<<", ptr="<<ptr<<endl;
}

