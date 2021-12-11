
public class TV {
	public int channel;
	public int volumeLevel;
	public boolean on;

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public boolean isOn() {
		return on;
	}

	public void volumeLevelUp(int vol) {
		if (volumeLevel + vol >= 8)
			volumeLevel = 8;
		else
			volumeLevel += vol;
	}

	public void volumeLevelDown(int vol) {
		if (volumeLevel - vol <= 0)
			volumeLevel = 0;
		else
			volumeLevel -= vol;
	}

	public void channelUp(int ch) {
		if (channel + ch >= 100)
			channel = 100;
		else
			channel += ch;
	}

	public void channelDown(int ch) {
		if (channel - ch <= 0)
			channel = 0;
		else
			channel -= ch;
	}

	public String toString() {
		String tv = "TV is ";
		if (on)
			tv += "On";
		else
			tv += "Off";
		tv += " and current channel is " + channel + " and current volume level is " + volumeLevel + ".";

		return tv;
	}
}
