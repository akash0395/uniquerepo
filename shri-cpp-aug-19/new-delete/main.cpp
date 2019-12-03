#include <iostream>
#include <stdlib.h>

#include "ABC.h"


int main(int argc, char** argv) 
{
	ABC a("PUNE");
	ABC b("MUMBAI");
	a.showMe();
	b.showMe();
	
	a=b;
	a.showMe();	
}


