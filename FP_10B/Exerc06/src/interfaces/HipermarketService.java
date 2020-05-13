
package interfaces;

import exerc01.CoffeeService;
import interfaces.GasService;
import interfaces.MarketService;

/**
 *
 * @author Utilizador
 */
public interface HipermarketService extends CoffeeService, CreditService, 
        GasService, MarketService{
}
