import java.util.Scanner;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int PART_TIME_HOUR = 8;
    static final int FULL_TIME_HOUR = 12;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int ATTENDENCE =1;
    static final int DAILY_WAGE = 2;
    static final int PART_TIME =3;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        EmployeeWage employeeWage = new EmployeeWage();
        Scanner scan = new Scanner(System.in);
        double attendence = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println("1] Employee Attendence Check");
        System.out.println("2] Employee Daily Wage Calculate");
        System.out.println("3] Employee Part Or Full Time Wage Calculate");
        System.out.println("\n Choice Program");
        int choice = scan.nextInt();
        switch (choice){
            case ATTENDENCE :
                employeeWage.attendenceCheck(attendence);
                break;
            case DAILY_WAGE:
                employeeWage.dailyWageCalculate(attendence);
                break;
            case PART_TIME:
                employeeWage.partTimeWageCalculate();
                break;
            default:
                System.out.println("WRONG CHOICE");
        }
    }
    private void attendenceCheck(double attendence) {
        if (attendence == 0) {
            System.out.println("Employee is Absent");
        } else {
            System.out.println("Employee is Present");
        }
    }

    private void dailyWageCalculate(double attendence) {
        int empWage = 0;
        if (attendence == 0) {
            System.out.println("Employee is Absent");
            System.out.println("Employee Today Wage = " + empWage);
        } else {
            System.out.println("Employee is Present");
            empWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
            System.out.println("Employee Today Wage = " + empWage);
        }
    }

    private void partTimeWageCalculate() {
        int empWage = 0;
        double attendence = (int) Math.floor(Math.random() * 10) % 3;
        if (attendence == IS_FULL_TIME) {
            System.out.println("Employee is Present Full Time");
            empWage = WAGE_PER_HOUR * FULL_TIME_HOUR ;
            System.out.println("Full Time Employee Wage : "+empWage);
        } else if (attendence==IS_PART_TIME) {
            System.out.println("Employee is Present Part Time");
            empWage = WAGE_PER_HOUR * PART_TIME_HOUR ;
            System.out.println("Part Time Employee Wage : "+empWage);
        }else {
            System.out.println("Employee is Absent");
        }
    }
}
