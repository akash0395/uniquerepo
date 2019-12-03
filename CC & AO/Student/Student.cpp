#include"Student.h"

Student::Student()
{
	printf("default constructer\n");
	i=0;
	f=0;
	ptr=(char*)malloc(100);
	strcpy(ptr,"DontKnow\n");
	


}
Student::Student(int x,float y,const char *str)
{
	printf("para constructer\n");
	i=x;
	f=y;
	ptr=(char*)malloc(strlen(str)+1);
	strcpy(ptr,str);
	//free(ptr);
}


Student::Student(const Student &x)
{
	/*a=b copy constructer
	here c will be accessed by 'this'
	and b will be accessed by x*/
	this->i = x.i;
	this->f=x.f;
	this->ptr=(char *)malloc(strlen(x.ptr)+1);
	strcpy(this->ptr,x.ptr);
	this->ptr[strlen(x.ptr)]='\0';
	



}


void Student::operator=(const Student &x)
{
//	a=b
//	here a will be accessed by 'this'
//	and b will be accessed by x
	this->i = x.i;
	this->f=x.f;
	free(this->ptr);
	this->ptr=(char *)malloc(strlen(x.ptr)+1);
	strcpy(this->ptr,x.ptr);
	this->ptr[strlen(x.ptr)]='\0';



}

Student Student::operator+(const Student &x)
{
	Student temp;
	//a+b
	//here a will be accessed by 'this'
	//and b will be accessed by x
	temp.i= this->i + x.i;
	temp.f= this->f + x.f;
	free(temp.ptr);
	temp.ptr=new char [strlen(this->ptr)+strlen(x.ptr)+1];
	strcpy(temp.ptr,this->ptr);	
	strcpy(temp.ptr+strlen(this->ptr),x.ptr);
	temp.ptr[strlen(this->ptr)+strlen(x.ptr)]='\0';
	return temp;

}

void Student::display()
{
	printf("Roll number is :%d \t Percentage is :%f\tand Student name is :%s\n", i,f,ptr);
}

Student::~Student()
{
	printf("Destructor here---\n");
}

