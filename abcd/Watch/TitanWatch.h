#include<iostream>
#include<ostream>
#include<cstring>
#include"Watch.h"
using namespace std;
#ifndef _TitanWatch__H_
#define _TitanWatch__H_

class TitanWatch : public Watch
{
public:

TitanWatch();
TitanWatch(const char *nm,int a);
friend ostream &operator<<(ostream &out,TitanWatch &x);
TitanWatch( TitanWatch &x);
~TitanWatch();
void PlayAlarm();
void setmode(bool p);

};
#endif
