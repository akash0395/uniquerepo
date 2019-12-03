#include<cstdio>
#include<cstdlib>
#include<cstring>
#include"Student.h"

Student::Student()
{
 	age=35;
	percentage=54.34;

}
Student::Student(int x,float y,const char *ptr)
{
 	age=x;
	percentage=y;
	name= (char*)malloc(strlen(ptr)+1);
	strcpy(name,ptr); 
	free(name);
}
Student::~Student()
{

}
void Student::display()
{
printf("%s  %d  %f\n\n",name,age,percentage);

}

void Student::accept()
{
	char ptr[30];
	printf("Enter name:  ");
	scanf("%s",this->name);
	name=(char*)malloc(strlen(ptr)+1);
	strcpy(name,ptr);
	//printf("%s",name);

}


