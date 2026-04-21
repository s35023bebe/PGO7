public interface Billable {
    double calculateMonthlyNetPrice();
    double calculateMonthlyGrossPrice();
    double calculateTotalNetPrice();
}