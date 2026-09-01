package Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities;

public class Individual extends TaxPayer {

    private String name;

    private double anualIncome;

    private double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome) {
        super(name, anualIncome);
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.name = name;
        this.anualIncome = anualIncome;
        this.healthExpenditures = healthExpenditures;
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

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax = 0;
        if (this.getAnualIncome() < 20000.00 && this.getHealthExpenditures() > 0) {
            tax = (anualIncome * 0.15) - (healthExpenditures * 0.50);
        } else if (this.getAnualIncome() < 20000.00 && this.getHealthExpenditures() == 0) {
            tax = (anualIncome * 0.15);
        } else if (this.getAnualIncome() >= 20000.00 && this.getHealthExpenditures() > 0) {
            tax = (anualIncome * 0.25) - (healthExpenditures * 0.50);
        } else if (this.getAnualIncome() >= 20000.00 && this.getHealthExpenditures() == 0) {
            tax = (anualIncome * 0.25);
        }
        return tax;
    }
}
