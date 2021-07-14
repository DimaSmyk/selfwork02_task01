package selfwork02.task01;

import selfwork02.task01.utills.Rounder;

public class Test extends Tax{

    public static void main(String[] args) {

        Tax withTax = new TaxWith();
        Tax twp = new TaxWithoutPercent();
        Tax taxChange = new TaxChange();

        double[] allTax = {twp.calcCalculate(sum), withTax.calcCalculate(sum),
                taxChange.calcCalculate(sum)};
        double plus = 0;
        for (double element : allTax) {
            plus += element;
        }
        double income = sum - plus;

        System.out.println("Налог, который изментеся" +
                " в зависимости от дохода: " +  Rounder.roundValue(taxChange.calcCalculate(sum)));
        System.out.println("Налог в процентах: " +
                Rounder.roundValue(withTax.calcCalculate(sum)));
        System.out.println("Налог не в процентах: " + Rounder.roundValue(twp.calcCalculate(sum)));
        System.out.println("Остаток, после уплаты всех налогов: " + Rounder.roundValue(income));
    }
}
