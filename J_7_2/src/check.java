public class check {
	public static void main(String[] args) throws Exception {
		Machine machine = new Machine();
		String name[] = { "ƻ��", "ըҩ", "����", "����", "�ֱ�", "���" };
		Goods[] goods = new Goods[name.length];
		for (int i = 0; i < name.length; i++) {
			goods[i] = new Goods();
			if (i % 2 == 0) {
				goods[i].setIsDanger(false);
				goods[i].setName(name[i]);
			} else {
				goods[i].setIsDanger(true);
				goods[i].setName(name[i]);
			}
		}
		for (int i = 0; i < goods.length; i++) {
			try {
				machine.checkBag(goods[i]);
				System.out.println(goods[i].getName() + "���ͨ��");
			} catch (DangerException e) { 
				e.toShow();
				System.out.println(goods[i].getName() + "����ֹ��");
			}
		}
	}
}

