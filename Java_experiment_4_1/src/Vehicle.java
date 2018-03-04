
public class Vehicle {
	double speed;
	int power;
	void speedUp(int s)
	{
		speed = speed + s;
	}
	void speedDown(int d)
	{
		speed=speed-d;
	}
	void setPower(int p)
	{
		power=p;
	}
	int getPower()
	{
		return power;
	}
	double getSpeed()
	{
		return speed;
	}
}
