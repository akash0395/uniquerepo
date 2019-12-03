#include"Animal.h"
#include"cat.h"
#include"dog.h"
#include<ostream>
using namespace std;


int main()
{


	Animal *Dog = new dog ("Boss", 7 /*months*/);
	Animal *Cat = new cat("Pinky", 22/*year*/);

	
	
	cout<<Dog<<endl;
	cout<<Cat<<endl;

	if(*Cat>*Dog)
	{ 
	//cat.operator>(dog);
		cat->speak();
	}	
	else
		dog->speak();
	
	delete Dog;
	delete Cat;

}
