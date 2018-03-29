package sda.projekt.calezajecia.Validator;

public class ObjectFromFile {

    String issuer;
    String cardNo;
    int charCard;



    public ObjectFromFile(){

    }

    public ObjectFromFile(String issuer, String cardNo, int charCard) {
        this.issuer = issuer;
        this.cardNo = cardNo;
        this.charCard = charCard;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getCharCard() {
        return charCard;
    }

    public void setCharCard(int charCard) {
        this.charCard = charCard;
    }


}
