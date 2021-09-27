
class Television {
	int channel;
	int volume;
	boolean onOFF;
	
	
	public int getChannel() {
		return channel;
	}



	public void setChannel(int channel) {
		this.channel = channel;
	}



	public int getVolume() {
		return volume;
	}



	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	void print() {
		System.out.println("채널은" + channel +"이고 볼륨은"+ volume +"입니다");
	}
}


public class MultiClass {
	public static void main(String[] args) {
		Television tv1 = new Television();
		Television tv2 = new Television();
		Television tv3 = new Television();
		
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

