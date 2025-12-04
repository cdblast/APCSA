import java.util.Scanner;


public class MountainGame {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to MountainGame");
        System.out.println("You are about to climb a dangerous mountain.");
        System.out.println("You must choose the CORRECT item at each step.");
        System.out.println("If you choose even ONE wrong item, you fail.\n");


        boolean hasWater = false;
        boolean hasRope = false;
        boolean hasHikingBackpack = false;
        boolean hasStove = false;


        System.out.println("Option 1: You can only take ONE drink item.");
        System.out.println("  1) Water bottle");
        System.out.println("  2) Starbucks teddy bear cup (Coffee)");
        System.out.print("Choose 1 or 2: ");
        int choice1 = input.nextInt();


        if (choice1 == 1) {
            hasWater = true;
            System.out.println("\nYou took the water bottle. Smart choice.");
            System.out.println("Coffee might dehydrate you on this long climb.\n");
        } else if (choice1 == 2) {
            System.out.println("\nYou chose the Starbucks teddy bear cup.");
            System.out.println("The coffee makes you jittery and dehydrated");
            System.out.println("You feel weak halfway up the mountain and you fall all the way down.");
            System.out.println(">> You FAILED the MountainGame.\n");
            return;
        } else {
            System.out.println("\nInvalid choice. You fumbled your supplies.");
            System.out.println(">> You FAILED the MountainGame.\n");
            return;
        }


        System.out.println("Option 2: You need something for steep cliffs.");
        System.out.println("  1) Rope");
        System.out.println("  2) 67");
        System.out.print("Choose 1 or 2: ");
        int choice2 = input.nextInt();


        if (choice2 == 1) {
            hasRope = true;
            System.out.println("\nYou took the rope.");
            System.out.println("You attach it to your backpack and keep going.\n");
        } else if (choice2 == 2) {
            System.out.println("\nYou chose '67'. You raise your left hand and lower your right hand");
            System.out.println("When you reach a cliff, you have nothing to climb with");
            System.out.println(">> You slip and fall while saying 67. You FAIL the MountainGame.\n");
            return;
        } else {
            System.out.println("\nInvalid choice. You waste time and miss your chance to climb safely.");
            System.out.println(">> You FAILED the MountainGame.\n");
            return;
        }
        if (hasWater && hasRope) {
            System.out.println("So far so good. You have both water and a rope.");
            System.out.println("The climb gets colder and steeper...\n");
        }
        System.out.println("Option 3: Choose your backpack.");
        System.out.println("  1) Hiking backpack");
        System.out.println("  2) Paw Patrol backpack");
        System.out.print("Choose 1 or 2: ");
        int choice3 = input.nextInt();


        if (choice3 == 1) {
            hasHikingBackpack = true;
            System.out.println("\nYou chose the hiking backpack.");
            System.out.println("It’s sturdy and fits all your gear.\n");
        } else if (choice3 == 2) {
            System.out.println("\nYou chose the Paw Patrol backpack.");
            System.out.println("It rips under the weight of your gear. You have to be stupid to even consider this");
            System.out.println("Your supplies tumble down the mountain.");
            System.out.println(">> You FAILED the MountainGame.\n");
            return;
        } else {
            System.out.println("\nInvalid choice. You end up with no proper backpack.");
            System.out.println(">> You FAILED the MountainGame.\n");
            return;
        }
        if (hasWater && hasRope && hasHikingBackpack) {
            System.out.println("You feel prepared: water, rope, and a solid backpack.");
            System.out.println("Night is coming and temperatures are dropping\n");
        }
        System.out.println("Option 4: You need something for cooking and warmth.");
        System.out.println("  1) Portable stove");
        System.out.println("  2) Frozen chicken nuggets");
        System.out.print("Choose 1 or 2: ");
        int choice4 = input.nextInt();


        if (choice4 == 1) {
            hasStove = true;
            System.out.println("\nYou took the portable stove.");
            System.out.println("You can heat food and stay warm as you go higher.\n");
        } else if (choice4 == 2) {
            System.out.println("\nYou chose the frozen chicken nuggets.");
            System.out.println("They stay frozen and useless. You can’t eat them.");
            System.out.println("Hungry and freezing, you can’t continue and just starve.");
            System.out.println(">> You FAILED the MountainGame.\n");
            return;
        } else {
            System.out.println("\nInvalid choice. You end up with nothing to cook or keep warm.");
            System.out.println(">> You FAILED the MountainGame.\n");
            return;
        }
        boolean perfectLoadout = hasWater && hasRope && hasHikingBackpack && hasStove;


        if (perfectLoadout) {
            System.out.println("You reach the final part of the mountain.");
            System.out.println("With water, rope, a proper backpack, and a stove, you survive the night.");
            System.out.println("The sun rises and you stand on the summit.");
            System.out.println(">> CONGRATULATIONS! You WON the MountainGame!\n");
        } else {
            System.out.println("Something went wrong with your gear.");
            System.out.println(">> You FAILED the MountainGame.\n");


        }


        input.close();
    }
}
