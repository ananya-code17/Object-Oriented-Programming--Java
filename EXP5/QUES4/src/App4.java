class TrunkCall {    //superclass
    // Method to compute and display charge (Overridden in subclasses)
    public void calculateCharge(int duration) {
        System.out.println("Trunk Call Charge Calculation.");
    } 
}

// Subclass: Ordinary Call
class OrdinaryCall extends TrunkCall {
    @Override
    public void calculateCharge(int duration) {
        double charge = duration * 2.0; // ₹2 per minute
        System.out.println("Ordinary Call - Duration: " + duration + " minutes, Charge: ₹" + charge);
    }
}

// Subclass: Urgent Call
class UrgentCall extends TrunkCall {
    @Override
    public void calculateCharge(int duration) {
        double charge = duration * 4.0; // ₹4 per minute
        System.out.println("Urgent Call - Duration: " + duration + " minutes, Charge: ₹" + charge);
    }
}

// Subclass: Lightning Call
class LightningCall extends TrunkCall {
    @Override
    public void calculateCharge(int duration) {
        double charge = duration * 6.0; // ₹6 per minute
        System.out.println("Lightning Call - Duration: " + duration + " minutes, Charge: ₹" + charge);
    }
}

// Main Class
public class App4 {
    public static void main(String[] args) {
        // Predefined call durations
        int duration1 = 5;  // 5 minutes for Ordinary Call
        int duration2 = 10; // 10 minutes for Urgent Call
        int duration3 = 3;  // 3 minutes for Lightning Call

        // Using polymorphism
        TrunkCall call1 = new OrdinaryCall();
        TrunkCall call2 = new UrgentCall();
        TrunkCall call3 = new LightningCall();

        // Calling overridden methods
        call1.calculateCharge(duration1);
        System.out.println();

        call2.calculateCharge(duration2);
        System.out.println();

        call3.calculateCharge(duration3);
    }
}
