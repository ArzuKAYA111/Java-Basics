package com.syntax.class04;

public class NestedIfContinues {
	public static void main(String[] args) {

		// chec if patient has any allergies
		// if no allergies -->you are healty
//	 otherwise check if patient has:
		// orange allergy-->do not eat orange
		// apple allergy-->do not eat apple
		// Kiwi allergy--> do not eat kiwis

		boolean allergy = true;

		boolean appleAllergy = true;
		boolean orangeAllergy = true;
		boolean kiwiAllergy = false;

		{
			if (allergy) {

				System.out.println("Please answer below");
				if (orangeAllergy) {
					System.out.println("Do not eat Orange");
				}

				if (appleAllergy) {
					System.out.println("Do not eat apple");
				}
				if (kiwiAllergy) {
					System.out.println("Do not eat kiwi");

				}
			} else {
				System.out.println("You are healty ");

			}
		}

	}
}
