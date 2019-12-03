#include<cstdio>
#include<cstdlib>
#include<cstring>

class Student
{
	int i;
	float f;
	char *ptr;
public:
	Student();
	Student(int,float,const char *);
	Student(const Student &x);
	void operator=(const Student &x);
	Student operator+(const Student &x);
	~Student();

	void display();
	



};

 
