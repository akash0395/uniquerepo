#include<iostream>
using namespace std;

//int MathOperation::Addition;
#include"Number.h"
#include"MathOperation.h"

int main()
{
	/*Number n1,n2;
	cout<<n1<<endl;

	Number n3(15);
	cout<<n3<<endl;

	Number n4(n3);
	cout<<n4<<endl;

	n2=n4;
	cout<<n2<<endl;
*/
	Number n5=40;
	Number n6=20;
	//n5.Sub(n3);

	//n4.Sub(n2);	
	
	Number n7=MathOperation::Addition(n5,n6);
	cout<<"Addition is "<<n7<<endl;

	Number n8=MathOperation::subtraction(n5,n6);
	cout<<"subtraction is "<<n8<<endl;

	Number n9=MathOperation::Multiplication(n5,n6);
	cout<<"Multiplication is "<<n9<<endl;

	Number n10=MathOperation::Division(n5,n6);
	cout<<"Division is "<<n10<<endl;





return 0;
}
