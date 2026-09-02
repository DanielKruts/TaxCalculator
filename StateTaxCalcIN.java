/**
 * Main file that runs all prompts to enter raw numbers for income and exemptions and then it handles the rest
 * 
 * 
 */
import java.util.Scanner;

public class StateTaxCalcIN{

    public static void main(String[] args){
        //Definitions
        TaxProfile myTaxProfile = new TaxProfile();
        Scanner in = new Scanner(System.in);//User Input


        System.out.println("|-----------------------------------------------------------------------------------------------|");//Program Header
        System.out.println("|                                   Indiana State Taxes 2026                                    |");
        System.out.println("|  To figure out your exemptions, please refer to the Indiana's state tax exemption document on |");
        System.out.println("|   the Indiana State Department of Revenue website, Schedule 3, or refer to the same resource  |");
        System.out.println("|   in the Resources directory. This also applies to the total deductions, which is Schedule 3  |");
        System.out.println("|   on the same website and also listed in the resource directory.                              |");
        System.out.println("|-----------------------------------------------------------------------------------------------|");

        System.out.print(  "  What was your gross income for the year of 2025? ");//Prompts   
            myTaxProfile.grossIncome = in.nextDouble();
        System.out.print(  "  What are your Personal Exemptions? ");
            myTaxProfile.personalExemptions = in.nextDouble();
        System.out.print(  "  What are your Dependent Exemptions? ");
            myTaxProfile.dependentExemptions = in.nextDouble();
        System.out.print(  "  Any Adopted Child Exemptions? ");
            myTaxProfile.adoptedChildExemptions = in.nextDouble();
        System.out.print(  "  What is the total number of deductibles? ");
            myTaxProfile.totalDeductibles = in.nextDouble();
        System.out.print(  "  What county are you in? ");
            myTaxProfile.county = in.nextLine();
        
        
        
        in.close();//Close scanner connection
    }
}
