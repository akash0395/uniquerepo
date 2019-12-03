#include"Student.h"
#include<cstdio>

int main()
{
	int number;
	printf("Number of students \n");
	scanf("%d",&number);
	int s[number];	//Array
	for(int i=0;i<number;i++)
	{
		Student s[i];
		s[i].accept();
	}
	printf(" RESULT\n");
	for(int i=0;i<number;i++)
	{	Student s[i];
		s[i].display();	
	}
	
	Student s1;
	s1.accept();
	s1.display();
		


	//Student s1(17,60.3,"hello");
	//s1.display();
		


}
