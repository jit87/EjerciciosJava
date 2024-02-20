package edu.uoc.pac1;
import java.util.Locale;


public class PAC1Ex2 {

    public static double twoDecimals(double number){
        return Math.round(number * 100d) / 100d;
    }

    public static int incomeTaxRate(double amount){

        int number;

        if(amount < 0 || amount==0){
            number = -1;
        } else if(0 < amount && amount <= 15000){
            number = 15;
        } else if(15000 < amount && amount <= 24800){
            number = 18;
        } else {
            number = 22;
        }
        return number;
    }

    public static double totalIncomeTaxVAT(double amount) {

        double number;

        if(amount==0 || amount<0){
            number = 0;
        } else {
            number =  amount - (amount * (incomeTaxRate(amount)/100d)) + ((amount * 21)/100d);
        }
        return twoDecimals(number);
    }

    public static double[] invoicesTotal(double[][] invoices) {
        double[] result = new double[invoices.length];
        Locale.setDefault(Locale.US);

        for(int i = 0; i < invoices.length; i++){
            double suma=0;
            for(int j = 0; j < invoices[i].length; j++){
                suma = suma + invoices[i][j];
                result[i]=totalIncomeTaxVAT(suma);
            }

            double difference = result[i] - (int)result[i];

             if (difference==0){
                System.out.printf("Client %d: %.1f" + System.lineSeparator(), i + 1, twoDecimals(result[i]));
             } else
                System.out.printf("Client %d: %.2f" + System.lineSeparator(), i + 1, twoDecimals(result[i]));


        }
        return result;

    }


}
