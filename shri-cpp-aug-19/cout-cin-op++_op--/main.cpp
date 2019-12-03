#include <iostream>
#include "ABC.h"


int main(int argc, char** argv) 
{
	
	ABC a;
	ABC b;
	
	std::cin>>a>>b;
	
//	std::cout<<a<<b;   ///  cout.operator<<(a)....   operator<<(cout, a)	

	std::cout<<++a;
	std::cout<<a;
}


