package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class CommandLineRunnerExample implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--Starting  the commandline runner--");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println("-- End of the command line runner--");
		
	}

}
