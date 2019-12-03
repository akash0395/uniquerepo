#include<iostream>
#include<ostream>
using namespace std;
#include "student.h"


student::student()
{
cout<<endl<<"student::student()";
}
student::student(int rollNo)
{
	this->roll_no=rollNo;
	cout<<endl<<"student::student"<<endl;
}
student::student(student &x)
{
	this->roll_no=x.roll_no;
	cout<<endl<<"student::student(student &x)"<<endl;

}
void student::operator=(student &x)
{
	this->roll_no=x.roll_no;
	cout<<endl<<"student::operator=(student &x)"<<endl;

}

void student::display()
	{
		cout<<endl<<"this is student display"<<endl;

	}

student::~student()
{
	cout<<endl<<"student::~student()"<<endl;
}

ostream& operator<<(ostream& out,student &x)
{
	out<<x.roll_no;
	return out;

}
