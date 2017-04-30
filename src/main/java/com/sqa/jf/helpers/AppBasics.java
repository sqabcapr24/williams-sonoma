package com.sqa.jf.helpers;

import java.util.*;

public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	public static void farewellUser(String name) {
		System.out.println("Thanks for using my app " + name);
	}

	public static String greetUser(String appName) {
		System.out.println("Welcome to the " + appName);
		System.out.print("Could I get your name: ");
		return scanner.nextLine();
	}

	public static int requestInt(String question) {
		System.out.print(question + " ");
		String input = scanner.nextLine();
		int value = Integer.parseInt(input);
		return value;
	}
}
