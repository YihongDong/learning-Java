public class Machine {
	public void checkBag(Goods goods) throws Exception {
		if (goods.isDanger()) {
			DangerException danger=new DangerException();
			throw danger;
		}
		else 
			System.out.print(goods.getName()+"����Σ��Ʒ!");
	}
}