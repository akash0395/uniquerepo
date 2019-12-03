#include"Stack.h"

Stack::Stack()
{
	int arr[10];
	top=-1;
}

void Stack::push(int x)

{
	if(top<=STACK_SIZE-1)
	{
		++top;
		arr[top]=x;
	}
	else
		cout<<"stack overflow \n"<<endl;
}


int Stack:: pop()
{
	if(top>-1)
	{
	 	int x=arr[top];
		--top;
		return x;
	}
	else
		cout<<"stack underflow\n"<<endl;
}


void Stack::display()

{	
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  int i;
	for(i=top;i>=0;i--)
	{
		cout<<arr[i]<<endl;
	}
		
}


Stack::Stack(Stack &x)

{
	this->top= x.top;
	for(int i=top;i>-1;i--)
	{
		this->arr[i]=x.arr[i];	
	}



}

void Stack::operator=(const Stack &x)

{
	if(this!=&x)//Self referencing guard
	{
		this->top= x.top;
		for(int i=top;i>-1;i--)
		{
			this->arr[i]=x.arr[i];	
		}
	}

	
}


Stack Stack::operator+(const Stack &x)

{
	Stack temp;
	temp.top=this->top;
	for(int i=top;i>-1;i--)
	{	
		temp.arr[i]=this->arr[i]+x.arr[i];
	}
	return temp;
	
}
ostream & operator<<(ostream &out, Stack &x)
{
	if(x.top!=-1)
	{
		int i=x.top;
		for(;i!=-1;i--)
		{
			out<<x.arr[i]<<"\t";
		}
	}else 
		out<<"stack is empty\n";
	return out;
}


Stack::~Stack()
{
	top=-1;
}




