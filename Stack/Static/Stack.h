#include<cstdio>
#include <iostream>
using namespace std;

#define STACK_SIZE 10

class Stack
{
	int arr[STACK_SIZE];
	int top;

public:
	Stack();
	~Stack();
	Stack(Stack &);
	void operator=(const Stack &);
	Stack operator+(const Stack &);
	void push(int x);
	int pop();
	void display();
	friend ostream & operator<<(ostream &out, Stack &x);
	
};


