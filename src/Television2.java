
public class Television2 {
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
		System.out.println("ä����" + channel +"�̰� ������"+ volume +"�Դϴ�");
	}
}
