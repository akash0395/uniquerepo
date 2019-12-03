#include "ABC.h"
#include <iostream>
using namespace std;

int ABC::s;

ABC::ABC()
{
	i=10;
	s=20;
	
}

ABC::~ABC()
{
	i=0;
	s=0;
}

void ABC::fun2()
{
	cout<<i<<" "<<this->s<<endl;
}

void ABC::fun()//static
{

	cout<<" "<<s<<endl;
}

