public class DeluxBurger extends Hamburger {

    public DeluxBurger(String bredRollType, String meat) {
        bredRollType = bredRollType;
        meat = meat;
        price = 15;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getBredRollType() {
        return super.getBredRollType();
    }

    @Override
    public String getMeat() {
        return super.getMeat();
    }

    @Override
    public int priceCalculator(String a, String b, String c, String d) {
        return super.priceCalculator(a, b, c, d);
    }
}
