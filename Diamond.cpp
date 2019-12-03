#include<iostream>
using namespace std;


class X
{
public:
	X()
	{	
		cout<<"class X"<<endl;
	}
	int i=15;
	

};

 class A:virtual public X
{
public:

	A()
		{cout<<"class A"<<endl;
	}
	//virtual void fun()=0;


};

 class B: virtual public X
{
public:

	B()
		{cout<<"class B"<<endl;
	}
	//virtual void fun()=0;


};

class C: public  A, public  B 
{
public:
	C()
	{cout<<"class C";
	}
};


int main()
{
	C c;
	cout<<endl<<c.i<<endl;

}
