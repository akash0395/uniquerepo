#include "Stack.h"
#include <iostream>
#include <ostream>
using namespace std;

Stack::Stack(int size)
{
	arr=new int[size];
	top=-1;
	stack_size = size;
}

Stack::~Stack()
{
	delete [] arr;
	top=-1;
}

Stack::Stack(Stack &x)
{
	this->arr = new int[x.stack_size];
	this->stack_size=x.stack_size;
	
	int i=0;
	while(i<=x.top)
	{
		this->push(x.arr[i]);
		i++;
	}

}

void Stack::operator=(Stack &x)
{
	delete [] this->arr;
	this->top = -1;
	this->stack_size=0;

	this->arr = new int[x.stack_size];
	this->stack_size=x.stack_size;
	
	int i=0;
	while(i<=x.top)
	{
		push(x.arr[i]);
		i++;
	}
}

void Stack::push(int x)
{
	if(top!=this->stack_size-1)
	{
		++top;
		arr[top]=x;
	}
	else
		cout<<"stack overflow..."<<endl;
}

int Stack::pop()
{
	if(top!=-1)
	{
		int r=arr[top];
		--top;
		return r;
	}
	else
		cout<<"stack underflow..."<<endl;
	return -1;

}

ostream& operator<<(ostream &out, Stack &x)
{
out<<"**************Start of Object Print*************"<<endl;
	if(x.top!=-1)
	{
		int i=x.top;
		for(;i!=-1;i--)
			out<<x.arr[i]<<"-->";
		out<<endl;
	}
	else
		out<<"stack is empty..."<<endl;
out<<"**************End of Object Print*************"<<endl;
	return out;
}

