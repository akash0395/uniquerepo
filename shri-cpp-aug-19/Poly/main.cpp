#include <iostream>
#include <iostream>
#include "A.h"
#include "B.h"
using namespace std;

int main(int argc, char** argv) 
{

	A *ptr = new B();
	ptr->show(10);
	ptr->fun();

}


