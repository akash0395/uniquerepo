#include "Number.h"
#include<iostream>
#include "Mathoperation.h"


int main()
{
	Number n1;
	Number n2(30,40);
	
	
	Number n3(n2);

	cout<<n1<<endl;
	cout<<n2<<endl;
	cout<<n3<<endl;

	Number n4;
	cin>>n4;
	cout<<n4;

	n4=n1+n2;
	
	cout<<n4;


	Mathoperation::sqr(n4);
		
	


}

