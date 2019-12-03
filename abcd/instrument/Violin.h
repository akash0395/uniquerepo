#include<iostream>
#include<ostream>
using namespace std;
#include<cstring>
#include"Instrument.h"

#ifndef _Violin_H__
#define _Violin_H__

class Violin : public Instrument
{
	char * name;
	int price;
public:

Violin();
Violin(const char * nm, int a);
//Violin(const Violin &x);
//void operator=(const Violin &x);
~Violin();
 int playingCost(int rs);
friend ostream& operator<<(ostream &out,Violin &x);




};
#endif
