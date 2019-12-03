#include "ABC.h"
#include <iostream>

std::ostream& operator<<(std::ostream &out, ABC &x)
{
	out<<"I="<<x.i<<std::endl;
	return out;
}

std::istream& operator>>(std::istream &in, ABC &x)
{
	std::cout<<"Enter Number"<<std::endl;
	in>>x.i;
	return in;
}
	
ABC::ABC()
{
	i=0;
	std::cout<<"ABC::ABC()"<<std::endl;	
}

ABC::ABC(ABC &x)
{
	i=x.i;
	std::cout<<"ABC::ABC(ABC&)"<<std::endl;		
}

ABC::ABC(int x)
{
	i=x;
	std::cout<<"ABC::ABC(int &)"<<std::endl;	
}

ABC::~ABC()
{
	std::cout<<"ABC::~ABC()"<<std::endl;	
}

void ABC::operator=(ABC &x)
{
	i=x.i;
	std::cout<<"ABC::operator=(ABC &)"<<std::endl;	
}

ABC& ABC::operator++()
{
	i=i+1;
	return *this;
}

ABC& ABC::operator++(int x /*Its just a placeholder to diff a++ AND ++a*/)
{
	ABC tmp=*this;
	i=i+1;
	return tmp;
}




