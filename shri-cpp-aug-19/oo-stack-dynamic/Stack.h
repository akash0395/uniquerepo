
#include <ostream>
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
	void push(int x);
	int pop();
	friend ostream & operator<<(ostream &out, Stack &x);
};


