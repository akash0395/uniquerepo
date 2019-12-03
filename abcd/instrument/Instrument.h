#include<iostream>
#include<ostream>
using namespace std;
#include<cstring>

#ifndef _INSTRUMENT_H__
#define _INSTRUMENT_H__

class Instrument
{
	char * name;
	int price;
public:

Instrument();
Instrument(const char * nm, int a);
//Instrument(const Instrument &x);
//void operator=(const Instrument &x);
friend ostream& operator<<(ostream &out,Instrument &x);
~Instrument();
virtual int playingCost(int rs)=0;




};
#endif
