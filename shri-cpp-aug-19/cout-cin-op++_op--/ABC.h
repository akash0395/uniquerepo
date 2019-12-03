
#include <iostream>

class ABC
{
	int i;
	
	public:
		
		ABC();
		ABC(int p);
		ABC(ABC &);
		~ABC();
		void operator=(ABC &x);
		ABC& operator++();
		ABC& operator++(int x);
		
		friend std::ostream& operator<<(std::ostream &out, ABC &x);
		friend std::istream& operator>>(std::istream &in, ABC &x);
};


