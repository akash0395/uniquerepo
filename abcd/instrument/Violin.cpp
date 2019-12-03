#include"Violin.h"

Violin::Violin()
{
	//name= new char[strlen(1)]
	//price=0;


}
Violin::Violin(const char * nm, int a):Instrument(nm,a)
{
	name=new char[strlen(nm)+1];
	strcpy(name,nm);
	name[strlen(nm)+1]='\0';
	price=a;


}
//Violin(const Violin &x);
//void operator=(const Violin &x);
Violin::~Violin()
{

	delete [] name;


}



ostream& operator<<(ostream &out,Violin &x)
{

	out<<"name is:"<<x.name<<endl;
	out<<"price is:"<<x.price<<endl;
	return out;




}
int Violin:: playingCost(int rs)

{
	
int p=this->price*rs;

	return p;





}
