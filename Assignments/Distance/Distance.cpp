#include<iostream>
#include<ostream>
using namespace std;
#include"Distance.h"


Distance::Distance()
{
	i=0;
	f=0;
}
Distance::Distance(int in,int ft)
{
	i=in;
	f=ft;
}
Distance::~Distance()
{
	i=-1;
	f=-1;
	
}
Distance::getdata()
{
	cout<<"Enter Distance (Feet)"<<endl;
	cin>>this->ft;
	cout<<"Enter Distance (inch)"<<endl;
	cin>>this->i;

}
ostream& operator<<(otream& out,Distance& x)
{
	out<<this->i;
	out<<this-ft;
}
void Distance::operator<(Distance& x)
{

}
