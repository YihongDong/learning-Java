class DangerException extends Exception{  
    String s;  
    DangerException(String s){  
        this.s=s;  
    }  
    public void warnMess() {  
        System.out.println(s);  
    }  
}  
class MobileShop{  
    int phones;  
    double phone;  
    InnerPurchaseMoney a,b;  
    MobileShop(double phone, int phones){  
        this.phones = phones;  
        this.phone = phone;  
        this.a = new InnerPurchaseMoney(20000);  
        this.b = new InnerPurchaseMoney(10000);  
    }  
    public int get_phone() {  
        return phones;  
    }  
    public void set_phone(int phones) {  
        this.phones = phones;  
    }  
    class InnerPurchaseMoney{  
        double purchaseMoney,s;  
        InnerPurchaseMoney(double purchaseMoney){  
            s = this.purchaseMoney = purchaseMoney;  
        }  
        public void use_purchase(int phones) throws DangerException{  
            if(phones > MobileShop.this.phones  
               ||MobileShop.this.phones <= 0) {  
                throw new DangerException("手机库存不足");  
            }  
            purchaseMoney-=phones*MobileShop.this.phone;  
            if(purchaseMoney < 0) {  
                throw new DangerException("余额不足");  
            }  
            MobileShop.this.phones-=phones;  
            System.out.println("用价值"+s+"元的内部购物券购买了"+phones+"部手机");  
        }  
    }  
  
}  
public class NewYear {
	public static void main(String[] args) {  
        // TODO 自动生成的方法存根  
        MobileShop a = new MobileShop(3333,30);  
        System.out.println("手机专卖店目前有"+a.get_phone()+"部手机");  
        try {  
        a.a.use_purchase(6);  
        a.b.use_purchase(3);  
        }  
        catch(DangerException e){  
            e.warnMess();  
        }  
        finally {  
            System.out.println("手机专卖店目前有"+a.get_phone()+"部手机");  
        }  
    }  
}
