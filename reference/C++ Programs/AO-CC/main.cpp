#include "ABC.h"

#include <iostream>
using namespace std;

int main()
{
	ABC a;
	ABC b("Hello");

	a=b;
	a=a;
	a.display();
	
	ABC d;
	d=57;

	a=200;
	b=300;

	d=a+b;
	

	d.display();
	d=d+30;
	d.display();
	d=50+d;
	d.display();
	d=d;
	d.display();

	return 0;



}








