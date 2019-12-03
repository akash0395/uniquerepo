#include"Instrument.h"
#include"Violin.h"
#include"Guitar.h"
#include<iostream>
#include<ostream>
using namespace std;

int main()
{
	//Instrument *instrument= new Instrument();

	Instrument *instrumentptr= new Violin("Violin",3000);
	cout <<*instrumentptr<<endl;

	cout<<"playing cost for 4 month:"<<instrumentptr->playingCost(4)<<endl;
	
	//delete Instrument;

	Instrument *instrumentptr1= new Guitar("Guitar",1500);
	cout<<*instrumentptr1<<endl;

	cout<<"playing cost for 8 month:"<<instrumentptr1->playingCost(8)<<endl;
	
	//delete instrumentptr

	Guitar guitar("My Guitar",1800);
	Violin violin("My violin",2200);
	cout<<"Guitar Details are:"<<guitar<<endl;
	cout<<"Violin Details are:"<<violin<<endl;
	




}
