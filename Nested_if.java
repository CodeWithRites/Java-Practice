public class NestedIfExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasVoterID = true;


        if (age >= 18) { // outer if
            if (hasVoterID) { // inner if
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You need a voter ID to vote.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
