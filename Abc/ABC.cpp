#include<cstdio>
#include"ABC.h"


ABC::ABC()
{
	
	printf("parameterless const\n");
		i=0;
	
}

ABC::ABC(int y)
{
	i=y;	
	printf("parameterised const\n");
	
	
}

ABC::~ABC()
{
	printf("Destructor\n");
	
	
}

void ABC::display()
{
	printf("i=%d \n",i);
}

