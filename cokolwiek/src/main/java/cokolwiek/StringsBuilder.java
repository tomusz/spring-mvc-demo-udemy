package cokolwiek;

public class StringsBuilder implements StringConcentrator {


    public String concatenate(String first, String second) {
        StringBuilder stringBuilder = new StringBuilder(first);


        return stringBuilder.append(second).toString();
    }
}
