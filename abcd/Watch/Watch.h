#include<iostream>
#include<ostream>
#include<cstring>

using namespace std;
#ifndef _WATCH__H_
#define _WATCH__H_
class Watch
{
protected:
	char * name;
	int price;
	//char * os;
public:

Watch();
Watch(const char * nm,int a);
friend ostream &operator<<(ostream &out,Watch &x);
bool operator>(Watch &y);
Watch(const Watch &x);
~Watch();
 virtual void PlayAlarm()=0;
 virtual void setmode(bool p);
 //char* get_name(){return name;}
 //int get_price(){return price;}
};
#endif
