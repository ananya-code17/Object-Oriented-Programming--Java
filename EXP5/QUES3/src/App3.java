class Worker {  //superclass
    String name;
    double salaryRate;   

    // Constructor
    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // Method to compute and print pay (Overridden in subclasses)
    public void computePay(int hours) {
        System.out.println(name + "'s Weekly Pay: ₹0"); // Default implementation
    }
}

// Subclass: DailyWorker
class DailyWorker extends Worker {
    public DailyWorker(String name, double dailyRate) {
        super(name, dailyRate);
    }

    @Override
    public void computePay(int hours) {
        int daysWorked = hours / 8; // Assuming 8 hours per day (daysWorked -> no. of days in a week a worker has worked)
        double weeklyPay = daysWorked * salaryRate;
        System.out.println(name + "'s Weekly Pay: ₹" + weeklyPay);
    }
}

// Subclass: SalariedWorker
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double weeklySalaryRate) {
        super(name, weeklySalaryRate);
    }

    @Override
    public void computePay(int hours) {
        System.out.println(name + "'s Weekly Pay: ₹" + salaryRate); //fixed salary on weekly basis indepenednt of hours worked
    }
}

// Main class
public class App3 {
    public static void main(String[] args) {
        // Creating worker objects
        Worker dailyWorker = new DailyWorker("Rahul Sharma", 500); // Daily wage: ₹500
        Worker salariedWorker = new SalariedWorker("Ananya Joshi", 20000); // Fixed weekly salary: ₹20,000

        // Calling computePay() method (which now prints directly)
        dailyWorker.computePay(40); // 40 hours (5 days)
        salariedWorker.computePay(50); // 50 hours (fixed salary)
    }
}
