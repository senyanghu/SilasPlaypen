package org.demo.guicedemo;

import java.util.Map;

import com.google.common.base.Joiner;
import com.google.inject.Guice;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;

public class App {

	/**
	 * bootstrap: parse command line; set up environment; kick off the main logic
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// MyApplet mainApplet = Guice.createInjector(new MainModule(), new
		// CommandLineModule(args))
		// .getInstance(MyApplet.class);

		// MyApplet mainApplet = Guice.createInjector(new MainModule(), new
		// CommandLineModule(args))
		// .getInstance(Key.get(MyApplet.class, Names.named(args[0])));

		// mainApplet.run();

		Map<String, MyApplet> applets = Guice.createInjector(new MainModule(), new CommandLineModule(args))
				.getInstance(Key.get(new TypeLiteral<Map<String, MyApplet>>() {
				}));

		if (args.length == 0 || !applets.containsKey(args[0])) {
			System.out.println(
					"Unable to find applets. " + "Valid applets are " + Joiner.on(", ").join(applets.keySet()));
			return;
		}

		applets.get(args[0]).run();
	}

}
