#include"TitanWatch.h"


TitanWatch::TitanWatch()
{
	//name=new char strlen[10];
		//price=0;

}
TitanWatch::TitanWatch(const char *nm,int a) :Watch(nm,a)
{
	/*name= new char [strlen(nm)+1];
	strcpy(name,nm);
	name[strlen(nm)+1]='\0';
	price=a;
	//cout<<name<<endl;
	//cout<<a<<endl;*/



}
/*TitanWatch::TitanWatch(const TitanWatch &x)
{







}*/

TitanWatch::~TitanWatch()
{}

ostream &operator<<(ostream &out, TitanWatch &x)
{
	out<<"name is"<<x.name<<endl;
	out<<"price is"<<x.price<<endl;
	return out;




} 

/*TitanWatch::TitanWatch( TitanWatch &x)
{

this->name=new char[strlen(x.name)+1];
	strcpy(this->name,x.name);
	this->name[strlen(x.name)+1]='\0';
	this->price=x.price;





}*/
void TitanWatch::PlayAlarm()

{
	
	cout<<"tinn tin tinn"<<endl;

	



}
void TitanWatch::setmode(bool p)

{
	if(p==0)
	cout<<"titan is analog"<<endl;

	else
	{
		cout<<"nooooo"<<endl;
	}
	


}

