public class InsuranceStrategyVeryHigh {

    double calculateInsuranceVeryHigh(double income) {
        return (income - getConstant()) * getWeight() + getAdjustment();
    }

    int getAdjustment() {
        return 105600;
    }

    double getWeight() {
        return 0.02;
    }

    int getConstant() {
        return 60000;
    }
}