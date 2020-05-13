package exerc01;

import java.util.Calendar;

public class JumbHipermarket extends Hipermarket{
    
    public JumbHipermarket(double coffePrice, double gasPrice, double aRate, double precoBatatas, String nome, int numContribuinte) {
        super(coffePrice, gasPrice, aRate, precoBatatas, nome, numContribuinte);
    }

    @Override
    public int getPoints(double purchaseValue) {
        Calendar c = Calendar.getInstance();
        
        double semanaPontos = ((3 * purchaseValue) / 10);
        double fdsPontos = ((1 * purchaseValue) / 10);
        
        switch (c.get(Calendar.DAY_OF_WEEK)){
            case Calendar.MONDAY:
                return (int) semanaPontos;
            case Calendar.TUESDAY:
                return (int) semanaPontos; 
            case Calendar.WEDNESDAY:
                return (int) semanaPontos;
            case Calendar.THURSDAY:
                return (int) semanaPontos;
            case Calendar.FRIDAY:
                return (int) semanaPontos;
            default:
                return (int) fdsPontos;
        }
    }
    
}
