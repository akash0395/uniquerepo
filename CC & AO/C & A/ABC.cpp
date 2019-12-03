#include"ABC.h"

ABC::ABC()
{
	printf("default constructer\n");
	i=0;
	ptr=(char*)malloc(100);
	strcpy(ptr,"DontKnow\n");
	


}
ABC::ABC(int x,const char *str)
{
	printf("para constructer\n");
	i=x;
	ptr=(char*)malloc(strlen(str)+1);
	strcpy(ptr,str);
	//free(ptr);
}


ABC::ABC(const ABC &x)
{
	/*a=b copy constructer
	here c will be accessed by 'this'
	and b will be accessed by x*/
	this->i = x.i;
	this->ptr=(char *)malloc(strlen(x.ptr)+1);
	strcpy(this->ptr,x.ptr);
	this->ptr[strlen(x.ptr)]='\0';
	



}


void ABC::operator=(const ABC &x)
{
//	a=b
//	here a will be accessed by 'this'
//	and b will be accessed by x
	this->i = x.i;
	free(this->ptr);
	this->ptr=(char *)malloc(strlen(x.ptr)+1);
	strcpy(this->ptr,x.ptr);
	this->ptr[strlen(x.ptr)]='\0';



}

ABC ABC::operator+(const ABC &x)
{
	ABC temp;
	//a+b
	//here a will be accessed by 'this'
	//and b will be accessed by x
	temp.i= this->i + x.i;
	free(temp.ptr);
	temp.ptr=new char [strlen(this->ptr)+strlen(x.ptr)+1];
	strcpy(temp.ptr,this->ptr);	
	strcpy(temp.ptr+strlen(this->ptr),x.ptr);
	temp.ptr[strlen(this->ptr)+strlen(x.ptr)]='\0';
	return temp;

}

void ABC::display()
{
	printf("number is :%d \tand name is :%s\n", i,ptr);
}

ABC::~ABC()
{
	printf("Destructor here---\n");
}

