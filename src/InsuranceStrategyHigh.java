public class InsuranceStrategyHigh extends InsuranceStrategy {
    @Override
    int getAdjustment() {
        return 76500;
    }

    @Override
    double getWeight() {
        return 0.1;
    }

    @Override
    int getConstant() {
        return 30000;
    }
}
