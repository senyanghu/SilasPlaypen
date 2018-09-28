package org.demo.guicedemo;

import com.google.inject.Guice;

public class App {

	/**
	 * bootstrap: parse command line; set up environment; kick off the main logic
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MyApplet mainApplet = Guice.createInjector(new MainModule()).getInstance(MyApplet.class);
		mainApplet.run();
	}

}
