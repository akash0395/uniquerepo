#include<ostream>
using namespace std;

class EvenOdd
{
	int i;
	
public:

	EvenOdd();
	EvenOdd(int x);
	~EvenOdd();
	EvenOdd(EvenOdd& x);
	void operator=(EvenOdd& x);
	void operator!();
	friend ostream& operator<<(ostream& out, EvenOdd& x);

};
