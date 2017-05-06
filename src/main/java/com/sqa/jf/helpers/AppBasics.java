package com.sqa.jf.helpers;

import java.util.*;

import com.sqa.jf.helpers.exceptions.*;

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

	public static boolean requestBoolean(String question) {
		System.out.print(question + " (true/false):");
		String input = scanner.nextLine();
		boolean value = Boolean.parseBoolean(input);
		return value;
	}

	public static char requestChar(String question) {
		System.out.print(question + " ");
		String input = scanner.nextLine();
		char character = input.charAt(0);
		return character;
	}

	public static float requestFloat(String question) {
		System.out.print(question + " ");
		String input = scanner.nextLine();
		float value = Float.parseFloat(input);
		return value;
	}

	public static int requestInt(String question) {
		System.out.print(question + " ");
		String input = scanner.nextLine();
		int value = Integer.parseInt(input);
		return value;
	}

	public static int requestInt(String question, int min, int max, String errorResponse) {
		String input;
		int value = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine().trim();
			try {
				value = Integer.parseInt(input);
				if (value < min) {
					throw new UnderMinRangeException();
				} else if (value > max) {
					throw new OverMaxRangeException();
				}
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a valid numeric value (" + input + ")");
			} catch (UnderMinRangeException e) {
				System.out.println(errorResponse + " (" + input + ") [UNDER:" + min + "]");
			} catch (OverMaxRangeException e) {
				System.out.println(errorResponse + " (" + input + ") [OVER:" + max + "]");
			}
		}
		return value;
	}

	public static long requestLong(String question) {
		System.out.print(question + " ");
		String input = scanner.nextLine();
		long value = Long.parseLong(input);
		return value;
	}

	public static short requestShort(String question) {
		System.out.print(question + " ");
		String input = scanner.nextLine();
		short value = Short.parseShort(input);
		return value;
	}

	public static String requestString(String question) {
		System.out.print(question + " ");
		String input = scanner.nextLine();
		return input;
	}
}
