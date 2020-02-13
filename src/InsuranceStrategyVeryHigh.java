public class InsuranceStrategyVeryHigh extends InsuranceStrategy {

    @Override
    int getAdjustment() {
        return 105600;
    }

    @Override
    double getWeight() {
        return 0.02;
    }

    @Override
    int getConstant() {
        return 60000;
    }
}