package Programacao_Orientada_Objetos.application.HerancaPolimorfismo.application;

import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.Company;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.Individual;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.TaxPayer;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramAbstracaoExercicio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> listTaxPayer = new ArrayList<>();

        System.out.printf("\nEnter the number of tax payer: ");
        int tax = sc.nextInt();

        for (int i = 1; i <= tax; i++) {
            System.out.printf("\nTax payer #%d data: ", i);

            System.out.printf("\nIndividual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            if (ch == 'i') {
                System.out.printf("\nName: ");
                String name = sc.next();

                System.out.printf("\nAnual Income: ");
                double anualIncome = sc.nextDouble();

                System.out.printf("\nHealth expenditures: ");
                double heathExpenditures = sc.nextDouble();

                listTaxPayer.add(new Individual(name, anualIncome, heathExpenditures));

            } else if (ch == 'c') {
                System.out.printf("\nName: ");
                String name = sc.next();

                System.out.printf("\nAnual Income: ");
                double anualIncome = sc.nextDouble();

                System.out.printf("\nNumber of employees: ");
                int numberEmployees = sc.nextInt();

                listTaxPayer.add(new Company(name, anualIncome, numberEmployees));
            }
        }

        System.out.println();

        System.out.println("TAXES PAID: ");
        double sumTotalTax = 0.0;

        for (TaxPayer taxPayer : listTaxPayer) {
            System.out.printf("%s: $ %.2f\n", taxPayer.getName(), taxPayer.tax());

            sumTotalTax +=  taxPayer.tax();

        }

        System.out.printf("\nTOTAL TAXES: $ %.2f", sumTotalTax);

        sc.close();
    }
}
