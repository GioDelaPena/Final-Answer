import java.util.Scanner;

public class newans {
    public static void main(String[] args) {
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=* Calculate Salary *=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        Scanner dela_pena = new Scanner(System.in);
        System.out.print("Your Anual Salary: ");
        Double gio = dela_pena.nextDouble();

        //Variables to be used in formulas
        Double tax_excess = 0.00;
        Double tax_deduction = 0.00;
        Double tax = 0.00;

        //Variables to compute values
        Double Monthly_Rate = 0.00;
        Double Daily_Rate = 0.00;
        Double Hourly_Rate = 0.00;
        Double Annual_Tax_Deduction = 0.00;
        Double Monthly_Tax_Deduction = 0.00;
        Double Net_Pay = 0.00;

        //Conditions
        if (gio >= 0 && gio < 250000){

            Monthly_Rate = gio / 12;
            Daily_Rate = Monthly_Rate / 22;
            Hourly_Rate = Daily_Rate / 8;
            Annual_Tax_Deduction = 0.00;
            Monthly_Tax_Deduction = 0.00;
            Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;
        }

        else if (gio >= 250000 && gio < 400000){

            //Formula
            tax = gio - 250000;
            tax_deduction = tax * 0.20;

            Monthly_Rate = gio / 12;
            Daily_Rate = Monthly_Rate / 22;
            Hourly_Rate = Daily_Rate / 8;
            Annual_Tax_Deduction = tax_deduction;
            Monthly_Tax_Deduction = tax_deduction / 12;
            Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;
        }


        else if (gio >= 400000 && gio < 800000){

            //Formula
            tax = gio - 30000;
            tax_excess = tax - 400000;
            tax_deduction = 30000 + (0.25 * tax_excess);

            Monthly_Rate = gio / 12;
            Daily_Rate = Monthly_Rate / 22;
            Hourly_Rate = Daily_Rate / 8;
            Annual_Tax_Deduction = tax_deduction;
            Monthly_Tax_Deduction = tax_deduction / 12;
            Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;
        }

        else if (gio >= 800000 && gio < 2000000){

            //Formula
            tax = gio - 130000;
            tax_excess = tax - 800000;
            tax_deduction = 130000 + (0.30 * tax_excess);

            Monthly_Rate = gio / 12;
            Daily_Rate = Monthly_Rate / 22;
            Hourly_Rate = Daily_Rate / 8;
            Annual_Tax_Deduction = tax_deduction;
            Monthly_Tax_Deduction = tax_deduction / 12;
            Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;
        }

        else if (gio >= 2000000 && gio < 8000000){

            //Formula
            tax = gio - 490000;
            tax_excess = tax - 2000000;
            tax_deduction = 490000 + (0.32 * tax_excess);

            Monthly_Rate = gio / 12;
            Daily_Rate = Monthly_Rate / 22;
            Hourly_Rate = Daily_Rate / 8;
            Annual_Tax_Deduction = tax_deduction;
            Monthly_Tax_Deduction = tax_deduction / 12;
            Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;
        }

        else if (gio >= 8000000){

            //Formula
            tax = gio - 2410000;
            tax_excess = tax - 8000000;
            tax_deduction = 2410000 + (0.35 * tax_excess);

            Monthly_Rate = gio / 12;
            Daily_Rate = Monthly_Rate / 22;
            Hourly_Rate = Daily_Rate / 8;
            Annual_Tax_Deduction = tax_deduction;
            Monthly_Tax_Deduction = tax_deduction / 12;
            Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;
        }

        //Print the result of computaions in conditions
        System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
        System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
        System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
        System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
        System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
        System.out.println("Net Pay: " + String.format("%.2f", Net_Pay));
    }
}
