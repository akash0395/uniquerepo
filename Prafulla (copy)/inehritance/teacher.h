#ifndef __teacher_h_
#define __teacher_h_

#include<ostream>
using namespace std;


class teacher
{
	public:
		int teacher_id;
		teacher();
		teacher(int id);
		teacher(teacher &t);
		void operator=(teacher &t);
		~teacher();
		virtual void display();
		friend ostream& operator<<(ostream& out,teacher &x);


};
#endif
