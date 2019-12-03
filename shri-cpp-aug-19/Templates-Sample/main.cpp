#include <iostream>
using namespace std;

class ABC
{
	int i;
public:
	ABC()
	{
		i=0;
	}
	ABC(int x)
	{
		i=x;
	}
	bool operator>(ABC &x)
	{
		if(this->i > x.i)
			return true;
		
		return false;
	}
	friend ostream& operator<<(ostream& out, ABC &x);
};

ostream& operator<<(ostream& out, ABC &x)
{
	out<<x.i<<endl;	
	return out;
}

template <typename T>
T getMaxOf(T x, T y)
{
	if(x>y)
		return x;
	return y;
}

int main(int argc, char** argv) 
{
	cout<<getMaxOf<int>(10,6)<<endl;
	cout<<getMaxOf<char>('A','P')<<endl;
	cout<<getMaxOf<float>(100.5, 29.5)<<endl;
	
	ABC a(200), b(25);
	
	ABC c=getMaxOf<ABC>(a,b);		
	cout<<c<<endl;
	
	return 0;
}

