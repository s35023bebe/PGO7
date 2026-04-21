public abstract class MembershipPlan implements Billable {
    private String planCode;
    private String clientName;
    private int months;
    private double baseMonthlyFee;
    private boolean autoRenew;
    public MembershipPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew) {
        this.planCode = planCode;
        this.clientName = clientName;
        this.months = months;
        this.baseMonthlyFee = baseMonthlyFee;
        this.autoRenew = autoRenew;
    }
    public String getPlanCode() {
        return planCode;
    }
    public String getClientName() {
        return clientName;
    }
    public int getMonths() {
        return months;
    }
    public double getBaseMonthlyFee() {
        return baseMonthlyFee;
    }
    public boolean isAutoRenew() {
        return autoRenew;
    }
    public abstract String getPlanType();
    @Override
    public abstract double calculateMonthlyNetPrice();
    @Override
    public double calculateMonthlyGrossPrice() {
        return calculateMonthlyNetPrice() * 1.23;
    }
    @Override
    public double calculateTotalNetPrice() {
        return calculateMonthlyNetPrice() * months;
    }
    public final void printSummary() {
        System.out.println("Plan Code: " + planCode);
        System.out.println("Client: " + clientName);
        System.out.println("Plan Type: " + getPlanType());
        System.out.println("Duration (months): " + months);
        System.out.println("Monthly Net Price: " + calculateMonthlyNetPrice());
        System.out.println("Monthly Gross Price: " + calculateMonthlyGrossPrice());
        System.out.println("Total Contract Net Price: " + calculateTotalNetPrice());
        System.out.println("-------------------------------------------------");
    }
    @Override
    public String toString() {
        return "MembershipPlan{" +
                "planCode='" + planCode + '\'' +
                ", clientName='" + clientName + '\'' +
                ", months=" + months +
                ", baseMonthlyFee=" + baseMonthlyFee +
                ", autoRenew=" + autoRenew +
                '}';
    }
}