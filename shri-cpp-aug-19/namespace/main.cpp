
#include<iostream>
using namespace std;

namespace B
{
	class ABC
	{
		int i;
		public:
			show(){cout<<"inside B::ABC... show"<<endl;}
	};
}

namespace A
{
	class ABC
	{
	
		public:
			show(){cout<<"inside A::ABC... show"<<endl;}
	};	
}
		

int main()
{
	
	A::ABC a;
	
	a.show();
	return 0;
}


