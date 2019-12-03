#include<iostream>
#include<ostream>
	
using namespace std;

class complex
{
	int real;
	int img;

	public:
		complex();
		complex(int x);
		complex(int x,int y);
		void operator=(const complex &x);
		
		
		//friend void add(complex &x,complex &y);
		friend complex operator+(const complex &x,const complex &y);
		friend ostream& operator<<(ostream& out,complex &x);

};

