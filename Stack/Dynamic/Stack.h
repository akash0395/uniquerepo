#include <ostream>
#include <iostream>
using namespace std;

class Stack
{
	int *arr;
	int top;
	int stack_size;

public:
	Stack(int);
	~Stack();
	Stack(Stack &);
	void operator=(Stack &);
	Stack operator+(const Stack &);
	friend ostream & operator<<(ostream &out, Stack &x);
	void push(int x);
	int pop();
	
};


