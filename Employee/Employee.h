#include<ostream>
using namespace std;
class Employee
{
	int empId,sal,exp;
	char* p;


public:
	Employee();
	Employee(int,const char*,int,int);
	~Employee();
	Employee(Employee& x);
	void operator=(Employee& x);
	friend ostream& operator<<(ostream& out,Employee& );
	//Increment(int sal);
	//promotion(int exp);
};










