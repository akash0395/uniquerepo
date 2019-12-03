#include<iostream>
using namespace std;

#include"Game.h"
#include"Cricket.h"
#include"Hockey.h"
#include"Football.h"

int main()
{

	Game* ptr=new Cricket();
	ptr->play();

return 0;
}

