#include"Guitar.h"

Guitar::Guitar()
{
	//name= new char[strlen(1)]
	//price=0;


}
Guitar::Guitar(const char * nm, int a):Instrument(nm,a)
{
	name=new char[strlen(nm)+1];
	strcpy(name,nm);
	name[strlen(nm)+1]='\0';
	price=a;


}
//Guitar(const Guitar &x);
//void operator=(const Guitar &x);
Guitar::~Guitar()
{

	delete [] name;


}



ostream& operator<<(ostream &out,Guitar &x)
{

	out<<"name is:"<<x.name<<endl;
	out<<"price is:"<<x.price<<endl;
	return out;




}
int Guitar:: playingCost(int rs)

{
	
int p=this->price*rs;

	return p;



}
