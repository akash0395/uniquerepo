#include "Stack.h"
#include <iostream>
using namespace std;

int main()
{


	Stack s1;
	s1.pop();
	s1.push(10);
	s1.push(20);  
	s1.push(11);
	s1.push(91);
	s1.display();	
	int ret=s1.pop();
	cout<<ret<<" is the popped element\n\n";
	
	Stack s2(s1);//==Stack s2=s1
	cout<<s2<<"\n--------------Copy Constructor--------"<<endl;
	s2.push(121);
	
	Stack s3=s2;	
	cout<<s3<<"\n--------------assignment operator--------"<<endl;

	s1=s1;
	cout<<s1<<"\n--------same object--------"<<endl;
	cout<<s1<<endl;
	
	cout<<s2<<endl;
	
	s2.push(100);
	s2.push(200);
	cout<<s2<<endl;

	s1=s2;
	cout<<s1<<endl;

	Stack s4;
	s4.push(10);
	s4.push(20);  
	s4.push(11);
	s4.push(91);

	Stack s5;
	s5.push(10);
	s5.push(20);  
	s5.push(11);
	s5.push(91);
	s5=s4+s5;
	cout<<s5<<"\n----+operator------";

}


