
public class CheckDogState {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 dogShow yellowDog=new dogShow();  
         
	        System.out.printf("��������ǰ��:");  
	        yellowDog.setState(new SoftlyState());  
	        yellowDog.show();  
	          
	        System.out.printf("���ڵ���ǰ��:");  
	        yellowDog.setState(new MeetEnemyState());  
	        yellowDog.show();  
	          
	        System.out.printf("��������ǰ��:");  
	        yellowDog.setState(new MeetFrientsState());  
	        yellowDog.show();  
	          
	        System.out.printf("����ͬ��ǰ��:");  
	        yellowDog.setState(new MeetAnotherState());  
	        yellowDog.show();  
	}

}

interface dog{  
    public void showState();  
}  
  
class SoftlyState implements dog{  
    public void showState(){  
        System.out.println("�����˵�����");  
    }  
}  
class MeetEnemyState implements dog{  
    public void showState(){  
        System.out.println("��� ,������ȥ��ҧ����");  
    }  
}  
class MeetFrientsState implements dog{  
    public void showState(){  
        System.out.println("�ζ�β�� ,��ʾ��ӭ");  
    }  
}  
class MeetAnotherState implements dog{  
    public void showState(){  
        System.out.println("��Ϸ");  
    }  
}  
  
  
class dogShow{  
    dog state;  
    public void show(){  
        state.showState();  
    }  
    public void setState(dog a){  
        state=a;  
    }  
}  
  