package multiplecompines;

import java.util.ArrayList;

public class Repositiory {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int IS_ABSENT = 3;
    static final int TOTAL_WORKING_DAY = 20;
    static final int TOTAL_WORKING_HOURS = 100;
    int countWorkingHour = 0;
    int countFullDay = 0;
    int countPartDay = 0;
    int countAbsent = 0;
    int totalEmpWage;
    int totalWorkingDay;
    ArrayList<EmployeeWage> employeeWages = new ArrayList<>();
    UserInterface userInterface = new UserInterface();

    public void add(Bridgelabz bridgelabz, TcsCompanies tcsCompanies, InfosysCompanies infosysCompanies) {
        employeeWages.add(bridgelabz);
        employeeWages.add(tcsCompanies);
        employeeWages.add(infosysCompanies);
    }

    public EmployeeWage getCompDetails(String compName) {
        for (EmployeeWage empwage : employeeWages) {
            if (compName.equals(empwage.companyName)) {
                return empwage;
            }
        }
        return null;
    }

    public void wageCalculate(EmployeeWage employeeWage) {
        if (employeeWage!=null){
            for (int day = 0; day < TOTAL_WORKING_DAY; day++) {
                if (countWorkingHour > TOTAL_WORKING_HOURS){
                    countWorkingHour = TOTAL_WORKING_HOURS;
                    break;
                }
                int empAttendence = (int) Math.floor(Math.random() * 10) % 3+1;
                switch (empAttendence){
                    case IS_FULL_TIME :
                        countWorkingHour += employeeWage.fullTimeHour;
                        countFullDay++;
                        break;
                    case IS_PART_TIME:
                        countWorkingHour += employeeWage.partTimeHour;
                        countPartDay++;
                        break;
                    case IS_ABSENT:
                        countAbsent++;
                        break;
                }
            }
            totalEmpWage = countWorkingHour * employeeWage.wagePerHour;
            totalWorkingDay = countFullDay + countPartDay;

            userInterface.printWageDashBoard(employeeWage.companyName,countFullDay,countAbsent,countPartDay,countWorkingHour,totalEmpWage,totalWorkingDay);
            return;
        }
        System.out.println("SORRY COMPANY DETAILS NOT VALID");
    }
}
