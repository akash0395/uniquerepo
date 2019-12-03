
#ifndef __A__H__
#define __A__H__
class A
{
	int i;
public:
	A();
	~A();
	void operator=(A &);
	A(A&);
	
	void show();
	virtual void show(int);
	void fun();
};

#endif

