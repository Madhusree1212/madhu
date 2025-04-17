package com.example.spring_boot_example2;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineArguments implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-- Hello command line aruguments---");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(args[4]);
		System.out.println(Arrays.asList(args));
		System.out.println("-- end of command line runner---");
	}

	
	
}
