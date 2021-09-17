
public class UMLTele {
	private boolean isOn;
	private int volume;
	private int channel;
	
	public boolean isOn() {
		return isOn;
	}


	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void turnOn() {
		isOn = true;
	}
	public void turnOFF() {
		isOn = false;
	}


	@Override
	public String toString() {
		return "UMLTele [isOn=" + isOn + ", volume=" + volume + ", channel=" + channel + ", isOn()=" + isOn()
				+ ", getVolume()=" + getVolume() + ", getChannel()=" + getChannel() + "]";
	}

	
}
