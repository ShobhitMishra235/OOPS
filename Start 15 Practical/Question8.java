/*

WAP to create a Room class, the attributes of this class are roomno,  roomtype, roomarea and ACmachine. 
In this class the member  functions are setData and displayData. Use member function to set  data and display that data using displayData() method.
    
 */
import java.util.Scanner;

class Room {

    int roomno;
    String roomtype;
    double roomarea;
    boolean ACmachine;

    // Method to set data
    void setData(int roomno, String roomtype, double roomarea, boolean ACmachine) {
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
        this.ACmachine = ACmachine;
    }

    // Method to display data
    void displayData() {
        System.out.println("Room Number = " + roomno);
        System.out.println("Room Type = " + roomtype);
        System.out.println("Room Area = " + roomarea);
        System.out.println("AC Machine = " + ACmachine);
    }
}

public class Question8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room number: ");
        int roomno = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter room type: ");
        String roomtype = sc.nextLine();

        System.out.print("Enter room area: ");
        double roomarea = sc.nextDouble();

        System.out.print("Does room have AC? (true/false): ");
        boolean ACmachine = sc.nextBoolean();

        // Creating object
        Room obj = new Room();

        // Setting data
        obj.setData(roomno, roomtype, roomarea, ACmachine);

        // Displaying data
        System.out.println("\nRoom Details:");
        obj.displayData();

        sc.close();
    }
}

