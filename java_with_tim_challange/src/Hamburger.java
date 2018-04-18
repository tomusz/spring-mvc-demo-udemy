public class Hamburger {

    private int price;
    private String bredRollType;
    private String meat;

    public Hamburger(String bredRollType, String meat) {
        this.bredRollType = bredRollType;
        this.meat = meat;
        this.price = 15;
    }

    public int getPrice() {
        return price;
    }

    public String getBredRollType() {
        return bredRollType;
    }

    public String getMeat() {
        return meat;
    }

    public int priceCalculator(String a, String b, String c, String d){
        int round = 4;
        String[] addings = new String[round];

        addings[0] = a;
        addings[1] = b;
        addings[2] = c;
        addings[3] = d;
        String helper;
    for(int i =0; i>round;i++){

        helper = addings[i];

    if(helper == "Becon"){
      this.price =+ 5;
    }else if(helper == "Tomato"){
        this.price =+ 3;
    }else if(helper == "Lettuce"){
        this.price =+ 2;
    }else if(helper == "Carrot"){
        this.price =+ 1;
    }else if(helper == "Onion"){
        this.price =+ 1;
    }else{
        System.out.println("No such adding in restaurant, sorry");
    }

    }

        return this.price;
    }

}
