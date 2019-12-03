
class Circle
{
	int rad;
	int x;
	int y;

public:
	Circle()
	{
			printf("hi...\n");
			rad=0;
			x=0;
			y=0;
	}
	
	Circle(int arad, int ax, int ay)
	{
			printf("hi...\n");
			rad=arad;
			x=ax;
			y=ay;
	}
	
	void showMe()
	{
		printf("Rad:%d, x=%d, y=%d\n", rad,x,y);
	}
	
	void populateMe(int arad, int ax, int ay)
	{
		rad=arad;
		x=ax;
		y=ay;
	}
	
	float getArea()
	{
		return (3.14 * rad * rad);
	}
	
	~Circle()
	{
			printf("bye...\n");
	}
};

