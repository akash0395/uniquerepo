#include "ABC.h"
#include <iostream>

ABC::~ABC()
{
	printf("ABC::~ABC()\n");
}
	
ABC::ABC()
{
	printf("ABC::ABC()\n");
	i=0;
	s=0;
	c='A';
}

ABC::ABC(int p, short int q, char x)
{
	printf("ABC::ABC(int,short,char)\n");
	i=p;
	s=q;
	c=x;	
}

void ABC::showMe()
{
	printf("i=%d, s=%d, c=%c\n", i,s,c);
}


