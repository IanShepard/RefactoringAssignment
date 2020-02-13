public class InsuranceStrategyMedium extends InsuranceStrategy {
    @Override
    int getAdjustment() {
        return 35600;
    }

    @Override
    double getWeight() {
        return 0.2;
    }

    @Override
    int getConstant() {
        return 10000;
    }
}
