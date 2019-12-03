#include "ABC.h"

ABC :: ABC()
{

 printf("in default constructor:\n");
  i=0;

}


ABC :: ABC(int i)
{

 printf("in parameter constructor:\n");
  this->i=i;

}


ABC :: ~ABC()
{

 i=0;

 printf("in destructor:\n")

}



void display :: ABC()
{

 printf("display:%d",i);
 

}
