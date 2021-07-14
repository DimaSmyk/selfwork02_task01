package selfwork02.task01;

public class TaxWith extends Tax {
    final float kof = 0.15f;

    @Override
    public double calcCalculate(double sum) {

        return super.calcCalculate(sum) * kof;
    }
}

