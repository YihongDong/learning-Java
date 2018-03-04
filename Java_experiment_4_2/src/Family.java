
public class Family {
	Tv homeTV;
	void buyTV(Tv tv) {
		homeTV=tv;
	}
	void remoteControl(int m) {
		homeTV.setChannel(m);
	}
	void seeTV() {
		homeTV.showProgram();
	}
}
