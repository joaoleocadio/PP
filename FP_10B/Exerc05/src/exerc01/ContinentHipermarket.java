package exerc01;

import java.util.Calendar;

public class ContinentHipermarket extends Hipermarket{

    public ContinentHipermarket(double coffePrice, double gasPrice, double aRate, double precoBatatas, String nome, int numContribuinte) {
        super(coffePrice, gasPrice, aRate, precoBatatas, nome, numContribuinte);
    }

    @Override
    public int getPoints(double purchaseValue) {
        Calendar c = Calendar.getInstance();
        double less20 = ((1 * purchaseValue) / 5);
        double more21 = ((3 * purchaseValue) / 20);

        if (c.get(Calendar.DAY_OF_MONTH) < 21) {
            return (int) less20;
        } else if (c.get(Calendar.DAY_OF_MONTH) > 20) {
            return (int) more21;
        }
        return 0;
    }
}
