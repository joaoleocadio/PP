
package interfaces;

import exerc01.CoffeeService;
import exerc01.GasService;
import interfaces.MarketService;

/**
 *
 * @author Utilizador
 */
public interface HipermarketService extends CoffeeService, CreditService, 
        GasService, MarketService{
}
