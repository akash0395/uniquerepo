#include "teacher.h"
#include<iostream>
#include<ostream>
using namespace std;
	teacher::teacher()
	{
		cout<<endl<<"teacher::teacher()";
	}


	teacher::teacher(int id)
	{
		this->teacher_id=id;

	}
	teacher::teacher(teacher &t)
	{
		this->teacher_id=t.teacher_id;
		cout<<endl<<"teacher::teacher(teacher&)";
	}
	void teacher::operator=(teacher &t)
	{
		this->teacher_id=t.teacher_id;
		cout<<endl<<"teacher::teacher(teacher &t)"<<endl;

	}
	teacher::~teacher()
	{
		cout<<endl<<"teacher::~teacher()";
	
	}
	void teacher::display()
	{
		cout<<endl<<"this is teacher display"<<endl;

	}
	


 ostream& operator<<(ostream& out,teacher &x)
	{
	out<<x.teacher_id;
	return out;

	}
