public class Allowance
{
	public static void main(String[] args)
	{
		int age = 16;
		boolean isOldEnough = true;
		double allowance = 8.75;

		System.out.print("Gina’s age is ");
		System.out.println(age);
		System.out.print("Eligible for allowance? ");
		System.out.println(isOldEnough);
		System.out.print("Gina’s weekly allowance is ");
		System.out.println(allowance);
		System.out.println();
		
		age = 13;
		
		System.out.print("Carl’s age is ");
		System.out.println(age);
		System.out.print("Eligible for allowance? ");
		System.out.println(isOldEnough);
		System.out.print("Gina’s weekly allowance is ");
		System.out.println(allowance);
		System.out.println();
		
		age = 3;
		isOldEnough = false;
		
		System.out.print("Jennifer’s age is ");
		System.out.println(age);
		System.out.print("Eligible for allowance? ");
		System.out.println(isOldEnough);
		System.out.print("Gina’s weekly allowance is ");
		System.out.println(allowance);
		System.out.println();
	}
}
