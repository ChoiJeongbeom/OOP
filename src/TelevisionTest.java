
public class TelevisionTest {
	public static void main(String[] args) {
		Television2 tv1 = new Television2();
		Television2 tv2 = new Television2();
		Television2 tv3 = new Television2();
		
		tv1.setChannel(7);
		tv1.setVolume(7);
		tv1.onOFF = true;
		
		tv2.setChannel(23);
		tv2.setVolume(15);
		tv2.onOFF = false;
		
		tv3.setChannel(24);
		tv3.setVolume(15);
		tv3.onOFF = true;
		
		tv1.print();
		tv2.print();
		tv3.print();
		
	}
}
