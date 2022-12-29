public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int PART_TIME_HOUR = 8;
    static final int FULL_TIME_HOUR = 12;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.partTimeWageCalculate();

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
