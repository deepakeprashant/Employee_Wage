public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.attendenceCheck();
    }

    private void attendenceCheck() {
        double attendence = (int) Math.floor(Math.random() * 10) % 2;
        if (attendence == 0){
            System.out.println("Employee is Absent");
        }
        else {
            System.out.println("Employee is Present");
        }
    }
}
