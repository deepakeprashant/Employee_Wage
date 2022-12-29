public class EmployeeWage {
    static final int WAGE_PER_HOUR = 8;
    static final int FULL_DAY_HOUR = 20;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        EmployeeWage employeeWage = new EmployeeWage();
        double attendence = (int) Math.floor(Math.random() * 10) % 2;
        employeeWage.attendenceCheck(attendence);
        employeeWage.dailyWageCalculate(attendence);

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
        if (attendence ==0){
            System.out.println("Employee Today Wage = "+empWage);
        }
        else {
            empWage = WAGE_PER_HOUR * FULL_DAY_HOUR ;
            System.out.println("Employee Today Wage = "+empWage);
        }
    }
}
