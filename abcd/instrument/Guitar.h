#include<iostream>
#include<ostream>
using namespace std;
#include<cstring>
#include"Instrument.h"

#ifndef _Guitar_H__
#define _Guitar_H__

class Guitar : public Instrument
{
	char * name;
	int price;
public:

Guitar();
Guitar(const char * nm, int a);
//Guitar(const Guitar &x);
//void operator=(const Guitar &x);
~Guitar();
 int playingCost(int rs);
friend ostream& operator<<(ostream &out,Guitar &x);




};
#endif
