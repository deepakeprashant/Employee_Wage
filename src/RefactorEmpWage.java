public class RefactorEmpWage {
    static final int WAGE_PER_HOUR = 20;
    static final int PART_TIME_HOUR = 8;
    static final int FULL_TIME_HOUR = 12;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int IS_ABSENT = 3;
    static final int TOTAL_WORKING_DAY = 20;
    static final int TOTAL_WORKING_HOURS = 100;

    int countWorkingHour = 0;
    int countFullDay = 0;
    int countPartDay = 0;
    int countAbsent = 0;

    public static void main(String[] args) {
        System.out.println("WELCOME TO EMPLOYEE WAGE PROGRAM");
        RefactorEmpWage refactorEmpWage = new RefactorEmpWage();
        refactorEmpWage.empAttendence();
        refactorEmpWage.empWageCal();
    }

    void empAttendence() {
        for (int day = 0; day < TOTAL_WORKING_DAY; day++) {
            if (countWorkingHour > TOTAL_WORKING_HOURS){
                countWorkingHour = TOTAL_WORKING_HOURS;
                break;
            }
            int empAttendence = (int) Math.floor(Math.random() * 10) % 3+1;
            System.out.println(empAttendence);
            switch (empAttendence){
                case IS_FULL_TIME :
                    countWorkingHour += FULL_TIME_HOUR;
                    countFullDay++;
                    break;
                case IS_PART_TIME:
                    countWorkingHour += PART_TIME_HOUR;
                    countPartDay++;
                    break;
                case IS_ABSENT:
                    countAbsent++;
                    break;
            }
        }
    }
    private void empWageCal() {
        int empwage = countWorkingHour * WAGE_PER_HOUR;
        int totalWorkingDay = countFullDay + countPartDay;
        System.out.println("::--------- EMPLOYEE WAGE SLIP ----------::");
        System.out.println("FULL TIME DAY : "+countFullDay);
        System.out.println("PART TIME DAY : "+countPartDay);
        System.out.println("ABSENT DAY : "+countAbsent);
        System.out.println("TOTAL WORKING HOURS : "+countWorkingHour);
        System.out.println("TOTAL PRESENT DAY : "+totalWorkingDay);
        System.out.println("TOTAL EMPLOYEE WAGE : "+empwage);
    }
}
