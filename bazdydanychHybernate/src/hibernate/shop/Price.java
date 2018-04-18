package hibernate.shop;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * Created by Lukasz on 10.03.2018.
 */

@Embeddable
public class Price {

    BigDecimal nettoPrice;
    BigDecimal grossPrice;

    public Price() {
    }

    public Price(BigDecimal nettoPrice, BigDecimal grossPrice) {
        this.nettoPrice = nettoPrice;
        this.grossPrice = grossPrice;
    }

    public BigDecimal getNettoPrice() {
        return nettoPrice;
    }

    public void setNettoPrice(BigDecimal nettoPrice) {
        this.nettoPrice = nettoPrice;
    }

    public BigDecimal getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(BigDecimal grossPrice) {
        this.grossPrice = grossPrice;
    }
}
