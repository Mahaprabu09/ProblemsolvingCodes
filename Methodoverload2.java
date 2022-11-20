package Codingexcercise;

public class Methodoverload2 {
	int bike;
	int cycle;
	int car;
	int train;

	public static void vehicle(int bike1)
	{
		int bikescount= bike1;
		System.out.println("Bikes count are :"+bikescount);
	}
	public static void vehicle(int cycle,int car,int train)
	{
		int cyclescount=cycle;
		int carscount=car;
		int traincount=train;
		System.out.println(" cyclescount counts are :"+cyclescount+" cars counts are :"+carscount+" traincounts are :"+traincount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle(343);
		vehicle(233,45,23);

	}

}
