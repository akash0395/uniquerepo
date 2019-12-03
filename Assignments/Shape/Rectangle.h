#ifndef _RECTANGLE__H_
#define _RECTANGLE__H_


class Rectangle: public Shape
{
	int l,b;
public:
	Rectangle();
	Rectangle(int ln,int ht);
	~Rectangle();
	float area();
	void display(float x);
	
			


}; 












#endif


























