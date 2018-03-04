
public class User {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vehicle car1,car2;
		car1 = new Vehicle();
		car2 = new Vehicle();
		car1.setPower(128);
		car2.setPower(76);
		System.out.println("car1的功率是："+car1.getPower());
		System.out.println("car2的功率是："+car2.getPower());
		car1.speedUp(80);
		car2.speedUp(100);
		System.out.println("car1目前的速度是："+car1.getSpeed());
		System.out.println("car2目前的速度是："+car2.getSpeed());
		car1.speedDown(10);
		car2.speedDown(20);
		System.out.println("car1目前的速度是："+car1.getSpeed());
		System.out.println("car2目前的速度是："+car2.getSpeed());
	}

}
