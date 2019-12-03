#include<iostream.h>
#include<ostream.h>
#include<istream.h>
using namespace std:
#include "Num.h"



  Number::Number()
{
     i=0;
}
   Number::Number(int j)
{
     i=j;
}

  Number::~Number()
{
     i=-1;
}
  void  Number::operator+(Number& x)
{
   Num tmp;
   tmp.i=this->i+x.i;
   return tmp;
}
  void  Number::operator=Number(const Number& x)
{
   this->i=x.i;     
}

