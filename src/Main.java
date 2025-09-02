import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner RoE = new Scanner(System.in);
        System.out.println("Qual seu salário bruto ?");
        Float SalaryValue =  RoE.nextFloat(); // Salário bruto
        System.out.println("Quanto ganha de beneficios ?");
        Float BenefitsValue = RoE.nextFloat(); // Benefícios
        Float Total = SalaryValue + BenefitsValue;

        Float TaxValue= 0f;

        if (SalaryValue >=0 && SalaryValue <= 2259.20){
            TaxValue = 0f * SalaryValue; // Isento
        } else if (SalaryValue >=2259.21 && SalaryValue <= 2826.65){
            TaxValue = 0.075F * SalaryValue; // 7,5%
        }else if (SalaryValue >=2826.66 && SalaryValue <=3751.05 ){
            TaxValue = 0.015F * SalaryValue; // 15%
        } else if (SalaryValue >=3751.06 && SalaryValue <=4664.68) {
            TaxValue = 0.225F * SalaryValue; // 22,5%
        } else { // Acima de 4664.68
            TaxValue = 0.275F * SalaryValue; //27,5%
        }

        Float LiquidSalary = Total - TaxValue;
        System.out.println("Salário Liquído: " + LiquidSalary);
    }

}
