#include "Stack.h"
#include <iostream>
using namespace std;

int main()
{
	Stack s1(15);
	s1.push(10);
	s1.push(91);


	s1.pop();
	cout<<s1<<endl;
	
	Stack s2(20);
	cout<<s2<<endl;


	s2.push(100);
	s2.push(200);
	cout<<s2<<endl;

	s1=s2;
	s1.push(10);
	s1.push(20);


	cout<<s1<<endl;



	Stack s3=s1+s2;
	cout<<s3<<endl;
	s3<<2;
	cout<<s3<<endl;
	
}





