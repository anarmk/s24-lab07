package frogger;

public class Main {
    public static void main(String[] args) {
        // Create Road objects with boolean arrays
        Road road1 = new Road(new boolean[]{false, false, true, false, false});
        Road road2 = new Road(new boolean[]{false, false});

        int position1 = 0;
        int position2 = 0;

        Records records = new Records();

        // Create FroggerID records
        FroggerID froggerID1 = new FroggerID("Zishen", "Wen", "1234567890", "12345", "NY", "M");
        FroggerID froggerID2 = new FroggerID("Deyuan", "Chen", "0987654321", "54321", "CA", "M");

        // Create Frogger instances
        Frogger frogger1 = new Frogger(road1, position1, records, froggerID1);
        Frogger frogger2 = new Frogger(road2, position2, records, froggerID2);

        // Test movement
        System.out.println("Frogger 1 current position: " + frogger1.getPosition());
        System.out.println("Frogger 1 moves forward: " + frogger1.move(true));
        System.out.println("Frogger 1 current position: " + frogger1.getPosition());
        System.out.println("Frogger 1 moves forward: " + frogger1.move(true));
        System.out.println("Frogger 1 current position: " + frogger1.getPosition() + "\n");


        System.out.println("Frogger 2 current position: " + frogger2.getPosition());
        System.out.println("Frogger 2 moves backward: " + frogger2.move(true));
        System.out.println("Frogger 2 current position: " + frogger2.getPosition());

        frogger1.recordMyself();
        frogger2.recordMyself();

        System.out.println("\nRecords:" + records.toString());
    }
}