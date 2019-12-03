#include<cstdio>
#include<cstdlib>
#include<cstring>

class ABC
{
	int i;
	char *ptr;
public:
	ABC();
	ABC(int,const char *);
	ABC(const ABC &x);
	void operator=(const ABC &x);
	ABC operator+(const ABC &x);
	~ABC();

	void display();
	



};

 
