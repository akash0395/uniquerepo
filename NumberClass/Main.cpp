#include<iostream>
using namespace std;

#include"Number.h"


int main()
{
	Number n1;
	cout<<n1<<endl;

	Number n2(20);
	cout<<n2<<endl;

	Number n3(n2);
	cout<<n3<<endl;

	n1=n3;
	cout<<n1<<endl;


}
