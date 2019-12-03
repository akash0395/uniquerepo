
#ifndef _Number___h_
#define _Number___h_
class Number
{
	int i;
public:

	Number();
	Number(int j);
	~Number();
	Number(const Number& x);
	void operator=(const Number& x);
	friend ostream& operator<<(ostream& out, Number& x);
	//void Sub(Number& x);
	Number operator+(Number& x);
	Number operator-(Number& x);
	Number operator*(Number& x);
	Number operator/(Number& x);


};
#endif
