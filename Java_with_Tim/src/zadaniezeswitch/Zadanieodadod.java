package zadaniezeswitch;

public class Zadanieodadod {

    public static void main(String[] args) {



        char opcja = 'H';

        switch (opcja){
            case 'A':
                System.out.println("Wybrano A");
                break;
            case 'B':
                System.out.println("Wybrano B");
                break;
            case 'C':
                System.out.println("Wybrano C");
                break;
            case 'D':
                System.out.println("Wybrano D");
                break;
            case 'E':
                System.out.println("Wybrano E");
                break;
                default:
                    System.out.println("Not found");
                    break;
        }
    }

}
