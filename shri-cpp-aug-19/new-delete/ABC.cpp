#include "ABC.h"
#include <iostream>
#include <string.h>

	
ABC::ABC(char *str)
{
	printf("ABC::ABC(char*)\n");	
	//name = new char[strlen("PUNE")+1];
	name = new char[10000];
	strcpy(name, str);
	name[strlen(str)]='\0';
}

void ABC::operator=(ABC x)
{
	printf("ABC::operator=(ABC x)\n");	
	delete [] this->name;
	//name = new char[strlen("PUNE")+1];
	this->name = new char[10000];
	strcpy(this->name, x.name);
	this->name[strlen(x.name)]='\0';
}


void ABC::showMe()
{
	printf("name=%s\n", name);
}


