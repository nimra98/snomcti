package core;

import java.io.IOException;
import java.net.URL;

public class Methods {

	public void makeCall(String telnr) throws IOException {
		new URL("http://192.168.178.22/command.htm?number=" + telnr)
				.openStream().close();
		System.out.println(new URL("http://192.168.178.22/command.htm?number="
				+ telnr));
	}

	public void pressKey(String key) throws IOException {
		new URL("http://192.168.178.22/command.htm?key=" + key).openStream()
				.close();
		System.out.println(key);
	}

	public void dtmf(String key) throws IOException {
		new URL("http://192.168.178.22/command.htm?key_dtmf="+key).openStream().close();
		System.out.println(key);
	}

}
