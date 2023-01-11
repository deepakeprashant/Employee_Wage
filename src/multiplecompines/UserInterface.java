package multiplecompines;

import java.util.Scanner;

public class UserInterface {
    Scanner scan = new Scanner(System.in);

    public int showDashboaRD() {
        System.out.println("1] BRIDGELABZ EMPLOYEE WAGE\n2] TCS COMPANY EMP WAGE\n3] INFOSYS EMP WAGE\n4] EXIT");
        int choice = scan.nextInt();
        return choice;
    }

    public void printWageDashBoard(String companyName, int countFullDay, int countAbsent, int countPartDay, int countWorkingHour, int totalEmpWage, int totalWorkingDay) {
        System.out.println("::--------- EMPLOYEE WAGE SLIP ----------::");
        System.out.println("COMPANY NAME : "+companyName);
        System.out.println("FULL TIME DAY : "+countFullDay);
        System.out.println("PART TIME DAY : "+countPartDay);
        System.out.println("ABSENT DAY : "+countAbsent);
        System.out.println("TOTAL WORKING HOURS : "+countWorkingHour);
        System.out.println("TOTAL PRESENT DAY : "+totalWorkingDay);
        System.out.println("TOTAL EMPLOYEE WAGE : "+totalEmpWage);
    }
}
