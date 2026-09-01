package Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities;

public class Company extends TaxPayer{

    private String name;

    private double anualIncome;

    private int numberEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, int numberEmployees) {
        super(name, anualIncome);
        this.name = name;
        this.anualIncome = anualIncome;
        this.numberEmployees = numberEmployees;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getAnualIncome() {
        return anualIncome;
    }

    @Override
    public void setAnualIncome(double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double tax() {
        double tax = 0;
        if (this.getNumberEmployees() == 0) {
            tax = anualIncome * 0.16;
        } else if (this.getNumberEmployees() > 0) {
            tax = anualIncome * 0.14;
        }
        return tax;
    }
}
