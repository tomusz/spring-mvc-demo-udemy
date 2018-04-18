package sda.Pierwszy;

public class Silnia {




    public int silnia(int n){

        int result = 1;

        if(n >= 2){

            int temp = 1;
            for(int i = 2; i <= n; i++){

                result=temp*i;
                temp = result;

            }

        }


        return result;

    }

    public int betterSilnia(int n){

        if(n == 0){

           return 1;

        }else{
            return (n * betterSilnia(n - 1));
        }

    }

}
