#include<iostream>
#include<ostream>
#include<iostream>
#include<cstring>
#include"Employee.h"

using namespace std;


Employee::Employee()
{
	empId=0;
	const char*p="NAME";
	sal=0;
	exp=0;
}

Employee::Employee(int i,const char* n,int s,int e)
{
	empId=i;
	this->p=new char[strlen(n)+1];
	strcpy(this->p,n);
	this->p[strlen(n)]='\0';	
	sal=s;
	exp=e;


}
Employee::~Employee()
{
	empId=-1;
	cout<<"Bye";
	sal=-1;
	exp=-1;

}
Employee::Employee(Employee& x)
{
	this->empId=x.empId;
	this->p=x.p;
	strcpy(this->p,x.p);
	this->p[strlen(x.p)]='\0';
	this->exp=x.exp;

}
void Employee::operator=(Employee& x)
{
	
	this->empId=x.empId;
	delete[]this->p;
	strcpy(this->p,x.p);
	this->p[strlen(x.p)]='\0';
	this->sal=x.sal;
	this->exp=x.exp;

}
/*
Employee::Increment(int sal)
{


}
Employee::promotion(int exp)
{


}
*/
ostream& operator<<(ostream& out,Employee& x)
{
	out<<x.empId<<endl;
	out<<x.p<<endl;
	out<<x.sal<<endl;
	out<<x.exp<<endl;

	return out;	

}
