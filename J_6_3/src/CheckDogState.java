
public class CheckDogState {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 dogShow yellowDog=new dogShow();  
         
	        System.out.printf("狗在主人前面:");  
	        yellowDog.setState(new SoftlyState());  
	        yellowDog.show();  
	          
	        System.out.printf("狗在敌人前面:");  
	        yellowDog.setState(new MeetEnemyState());  
	        yellowDog.show();  
	          
	        System.out.printf("狗在朋友前面:");  
	        yellowDog.setState(new MeetFrientsState());  
	        yellowDog.show();  
	          
	        System.out.printf("狗在同伴前面:");  
	        yellowDog.setState(new MeetAnotherState());  
	        yellowDog.show();  
	}

}

interface dog{  
    public void showState();  
}  
  
class SoftlyState implements dog{  
    public void showState(){  
        System.out.println("听主人的命令");  
    }  
}  
class MeetEnemyState implements dog{  
    public void showState(){  
        System.out.println("狂叫 ,并冲向去很咬敌人");  
    }  
}  
class MeetFrientsState implements dog{  
    public void showState(){  
        System.out.println("晃动尾巴 ,表示欢迎");  
    }  
}  
class MeetAnotherState implements dog{  
    public void showState(){  
        System.out.println("嬉戏");  
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
  