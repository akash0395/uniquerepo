#include"Instrument.h"


Instrument::Instrument()
{
	//name= new char[strlen(1)]
	//price=0;


}
Instrument::Instrument(const char * nm, int a)
{
	name=new char[strlen(nm)+1];
	strcpy(name,nm);
	name[strlen(nm)+1]='\0';
	price=a;


}
//Instrument(const Instrument &x);
//void operator=(const Instrument &x);
Instrument::~Instrument()
{

	delete [] name;


}


ostream& operator<<(ostream &out,Instrument &x)
{

	out<<"name is:"<<x.name<<endl;
	out<<"price is:"<<x.price<<endl;
	return out;
}
int Instrument:: playingCost(int rs)
{



}

