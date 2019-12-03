#include<iostream>
using namespace std;
#include "cat.h"
#include "dog.h"
#include "Animal.h"

int main()
{
	Animal *d=new dog("Dog",50);
	Animal *c=new cat("cat",40,50);
	cout<<d;
	cout<<c;
	
	/*if(c > d)
	{
		c->speak();
	}
	else
	{
		d->speak();
	}
*/
	delete d;
	delete c;
	
	dog *d1= new dog(50);
	cout<<d1;

	//dog d2("Honey",15);
	//cout<<d1;

	//dog d3(d1);	
	//cout<<&d3;
	
return 0;
}
