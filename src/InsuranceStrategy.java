public abstract class InsuranceStrategy {
    double calculateInsuranceVeryHigh(double income) {
        return (income - getConstant()) * getWeight() + getAdjustment();
    }

    abstract int getAdjustment();

    abstract double getWeight();

    abstract int getConstant();
}
