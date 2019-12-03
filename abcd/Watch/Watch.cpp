#include"Watch.h"


Watch::Watch()
{
	//name=new char strlen[10];
		//price=0;
	
}
Watch::Watch(const char *nm,int a)
{
	name= new char [strlen(nm)+1];
	strcpy(name,nm);
	name[strlen(nm)+1]='\0';
	price=a;

	

}

Watch::~Watch()
{

	delete [] name;


}

ostream &operator<<(ostream &out, Watch &x)
{
	out<<"name is"<<x.name<<endl;
	out<<"price is"<<x.price<<endl;
	return out;




} 
void Watch::PlayAlarm()

{

	




}
void Watch::setmode(bool p)
{







}

/*Watch::Watch(const Watch &x)
{
	this->name=new char[strlen(x.name)+1];
	strcpy(this->name,x.name);
	this->name[strlen(x.name)+1]='\0';
	this->price=x.price;



}*/

bool Watch::operator>(Watch &y)
{
	if(this->price > y.price)
	{
		return true;

	}
	else
	{

		return false;

	}


}
