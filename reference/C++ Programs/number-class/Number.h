
class Number
{
	int i;

public:
	Number();
	Number(int j);
	~Number();
	Number operator+(Number& x);
	void operator=(const Number& x);
	friend ostream& operator<<(ostream& out, Number& x);
	friend istream& operator>>(istream& in, Number& x);
};


