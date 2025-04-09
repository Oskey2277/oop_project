package firmVacation;

public class Staff {
    private Employee[] staffList;

    public Staff() {
        staffList = new Employee[3];

        staffList[0] = new Executive("manju", "lubhu", "98777776", 1000);
        ((Executive) staffList[0]).awardBonus(500);

        staffList[1] = new Hourly("oscar", "Kathmandu", "87655555", 15.50);
        ((Hourly) staffList[1]).addHours(40);

        staffList[2] = new Employee("rajkumar", "imadol", "787788777", 500);
    }

    public void payday() {
        for (Employee emp : staffList) {
            System.out.println(emp);
            System.out.println("Paid: $" + emp.pay());
            System.out.println("----------------------------------");
        }
    }

    public void showVacations() {
        for (Employee emp : staffList) {
            System.out.println(emp.getName() + " vacation: " + emp.vacation());
        }
    }
}
