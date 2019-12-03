
class Number
{
	int i;
	
	public:
		Number();
		~Number();
		Number(Number&);
		void operator=(Number&);
		Number& operator+(Number&);
};


