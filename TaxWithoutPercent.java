package selfwork02.task01;

public class TaxWithoutPercent extends Tax {
    final int kof = 40;

    @Override
    public double calcCalculate(double sum) {

        return kof;
    }
}
