package Fit;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class MembershipManagement {
    String name;
    int club;
    String mem;
    double fees;
    int memberID;
    //Member mbr;
    Calculator<Integer> cal;
    final private Scanner scanner = new Scanner(System.in);

    public String printClubOptions() {
        System.out.println("1) Club Mercury \n2) Club Neptune \n3) Club Jupiter \n4) Multi Clubs");
        return null;
    }

    public int getChoice() {
        int choice;
        System.out.print("WELCOME TO OZONE FITNESS CENTER ");
        System.out.println("\n================================ ");
        System.out.print("\n1) Add member \n2) Remove member \n3)Display member information");
        System.out.print("\nPlease select an option (or Enter -1 to quit):");
        choice = getIntInput();
        return choice;
    }

    int getIntInput() {
        int choice = 0;
        while (choice == 0) {

            try {
                choice = scanner.nextInt();
                if (choice == 0) ;
                throw new InputMismatchException();
                // scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("ERROR. Please enter the wright number");
                scanner.nextInt();
            }
        }
        return choice;
    }

    public String addMembers(LinkedList<Member> members) {
        System.out.print("\nPlease enter the member's name: ");
        name = scanner.next();

        printClubOptions();
        System.out.println("Please enter the member's clubID: ");
        club = getIntInput();
        while (club < 1 || club > 4) {
            System.out.println("ERROR. Please enter the wright club number");

            if (!members.isEmpty())
                memberID = members.getLast().getMemberID() + 1;
            else
                memberID = 1;
        }

        while (club < 4) {
            if (club == 1) {
                fees = 900;
            } else if (club == 2) {
                fees = 950;
            } else if (club == 3) {
                fees = 1000;

                fees = cal.calculateFees(club);
            }

            Member mbr = new SingleClubMember('S', memberID, name, fees, club);
            members.add(mbr);
            mem = mbr.toString();
            System.out.println("Single club member is added");
            break;
        }

        while (club == 4) {
            fees = 1200;

            fees = cal.calculateFees(club);
            Member mbr = new MultiClubMember('M', memberID, name, fees, club);
            members.add(mbr);
            mem = mbr.toString();
            System.out.println("Multi club member is added");
        }
        return mem;

    }

    public void removeMember(LinkedList<Member> members) {
        int memberID;
        System.out.println("Enter member ID to remove member: ");
        memberID = getIntInput();

        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMemberID() == memberID) ;
            members.remove(i);
            System.out.println("Member removed");
            return;
        }

           System.out.println("\nMember ID not found\n");
        }




    public void printMemberInfo(LinkedList<Member> members) {
        int memberID;
        System.out.println("Enter member ID to get member information: ");
        memberID = getIntInput();

        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMemberID() == memberID) ;
            members.get(i).toString();

        }

    }
}


















