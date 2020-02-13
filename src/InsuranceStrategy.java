public abstract class InsuranceStrategy {
    double calculate(double income) {
        return (income - getConstant()) * getWeight() + getAdjustment();
    }

    abstract int getAdjustment();

    abstract double getWeight();

    abstract int getConstant();
}
