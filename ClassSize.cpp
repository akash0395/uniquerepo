#include<iostream>
using namespace std;


class A
{
	int i;
public: 
	A()
	{
	}
	virtual void fun();
	

};

class B
{
public: 
	B()
	{
	}
	void fun(){

	};
	
	

};

int main()

{	A a;
cout<<sizeof(a)<<endl;

return 0;
}
