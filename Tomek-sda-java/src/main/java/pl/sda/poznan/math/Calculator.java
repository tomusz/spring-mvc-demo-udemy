package pl.sda.poznan.math;

public class Calculator {

    public static int sum(String str){
        if(str.isEmpty()){
           return 0;
        }
        else if(str.length() == 1){
            return parseInteger(str);
        }
/*        else if(str.length() == 3){
            String[] split = str.split(",");
            return parseInteger(split[0]) + parseInteger(split[1]);
        }*/
        else{
            String[] split = str.split(",");
            int wynik = 0;
            int wczesniejszy = 0;
            for(int i=0;i < split.length;i++){
                wynik = wczesniejszy + parseInteger(split[i]);
                wczesniejszy = wynik;
            }
            return wynik;
            }


        }
    private static int parseInteger(String s){
        return Integer.parseInt(s);
    }

}

