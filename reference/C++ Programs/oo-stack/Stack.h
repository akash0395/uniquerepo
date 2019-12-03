
#define KLM_SIZE 20

class KLM
{
	int arr[KLM_SIZE];
	int top;

public:
	KLM();
	~KLM();
	KLM(KLM &x);
	void operator=(KLM &x);
	void push(int x);
	int pop();
        void display();


	//friend ostream & operator<<(ostream &out, KLM &x);
};




