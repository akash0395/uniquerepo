#ifndef _TRIANGLE__H_
#define _TRIANGLE__H_


class Triangle: public Shape
{
	int l,h;
public:
	Triangle();
	Triangle(int ln,int ht);
	~Triangle();
	float area();
	void display(float x);
	
			


}; 












#endif

