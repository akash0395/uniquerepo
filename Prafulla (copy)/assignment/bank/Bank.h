class Bank
{

	char *name;
	double bal;
	char *acc_type;
	double acc_no;


public:
	Bank();
	void credit(int amount);
	void display();
	void debit(int amt);
	~Bank();




};

