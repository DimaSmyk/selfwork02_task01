package selfwork02.task01;

public class TaxChange extends Tax{

    final float kof = 0.12f;
    final float kof1 = 0.23f;
    final float kof2 = 0.31f;


    @Override
    public double calcCalculate(double sum) {

        if (sum > 0 && sum < 200) {
            return super.calcCalculate(sum) * kof;
        } else if (sum >= 200 && sum <= 500){
            return super.calcCalculate(sum) * kof1;
        } else if (sum > 500  && sum <= 1000) {
            return super.calcCalculate(sum) * kof2;
        }
        else
        return super.calcCalculate(sum);
    }
}
