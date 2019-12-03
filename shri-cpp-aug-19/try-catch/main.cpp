#include <iostream>
using namespace std;

#include "Math.h"

int main(int argc, char** argv) 
{

	int x=140;
	int y=0;
	
	try
	{
		int ret = Math::PerformDivide(x,y);
		cout<<"Ret:"<<ret<<endl;
	}
	catch(char const *str)
	{
		cout<<str<<endl;	
	}
	catch(...)
	{
		cout<<"Something got wrong..."<<endl;
	}
}


