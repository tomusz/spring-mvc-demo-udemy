package cokolwiek;

public class BufereredReader implements StringConcentrator {


    public String concatenate(String first, String second) {
        StringBuffer stringBuffer = new StringBuffer();


        return stringBuffer.append(first).append(second).toString();
    }
}
