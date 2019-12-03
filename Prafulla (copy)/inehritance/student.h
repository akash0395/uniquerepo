#include "teacher.h"
#include<ostream>
using namespace std;


class student : public teacher{
	int roll_no;

	public:
		student();
		student(int rollNo);	
		student(student &x);
		void operator=(student &x);
		~student();
		void display();
		friend ostream& operator<<(ostream& out,student &x);




};
