

class ABC
{

	int i;
	char *ptr;
public:
	ABC();
	ABC(const char* str);
	ABC(const ABC &x);
	~ABC();
	void operator=(const ABC &x);
	void operator=(int x);
	ABC operator+(const ABC &x);
	ABC operator+(int x);
	friend ABC operator+(int ii, ABC &x);
	void display();
};






