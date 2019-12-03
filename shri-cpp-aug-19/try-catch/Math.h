
#include <iostream>
using namespace std;

class Math
{

	static int divide(int x, int y)
	{
		if(y!=0)
			return (x/y);
		else
		{
			throw "y is 0.... sorry cant divide...";			
		}		
	}
	
public:
	
	static int PerformDivide(int x, int y)
	{
		
		try{
			divide(x,y);
		}
		catch(char const* str)
		{
			//throw "Invalid Input... try again..";
			throw 10;
		}
	}
};

