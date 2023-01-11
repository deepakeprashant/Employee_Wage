package multiplecompines;

public class Main {
    public static final int BRIDGELABZ = 1;
    public static final int TCS = 2;
    public static final int INFOSYS = 3;
    public static final int EXIT = 4;
    public static Repositiory repositiory = new Repositiory();

    public static void main(String[] args) {
        System.out.println("WELCOME TO MNC COMPANIES EMPLOYEE WAGE");
        UserInterface userInterface = new UserInterface();
        while (true) {
            addMNCWageCriteria();
            handleChoice(userInterface.showDashboaRD());
        }
    }

    static void handleChoice(int choice) {
        String compName;
        EmployeeWage employeeWage;
        switch (choice){
            case BRIDGELABZ :
                compName = "Bridgelabz";
                employeeWage = repositiory.getCompDetails(compName);
                repositiory.wageCalculate(employeeWage);
                break;
            case TCS:
                compName = "Tcs";
                employeeWage = repositiory.getCompDetails(compName);
                repositiory.wageCalculate(employeeWage);
                break;
            case INFOSYS:
                compName ="Infosys";
                employeeWage = repositiory.getCompDetails(compName);
                repositiory.wageCalculate(employeeWage);
                break;
            case EXIT:
                System.out.println("THANK YOU!");
                System.exit(0);
            default:
                System.out.println("WRONG CHOICE! PLZ SELECT 1 TO 3 ");
        }
    }

    static void addMNCWageCriteria() {
        Bridgelabz bridgelabz = new Bridgelabz();
        bridgelabz.companyName = "Bridgelabz";
        bridgelabz.fullTimeHour = 12;
        bridgelabz.partTimeHour = 8;
        bridgelabz.wagePerHour = 20;

        TcsCompanies tcsCompanies = new TcsCompanies();
        tcsCompanies.companyName = "Tcs";
        tcsCompanies.fullTimeHour = 10;
        tcsCompanies.partTimeHour = 5;
        tcsCompanies.wagePerHour = 25;

        InfosysCompanies infosysCompanies = new InfosysCompanies();
        infosysCompanies.companyName = "Infosys";
        infosysCompanies.fullTimeHour = 10;
        infosysCompanies.partTimeHour = 6;
        infosysCompanies.wagePerHour = 18;

        repositiory.add(bridgelabz, tcsCompanies, infosysCompanies);
    }
}
