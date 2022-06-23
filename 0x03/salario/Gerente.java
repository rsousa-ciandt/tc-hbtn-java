public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double bonus = super.calcularBonus(departamento);

        if (bonus > 0) {
            double diferencaMeta = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            bonus = bonus * 2 + diferencaMeta * 0.01;
        }

        return  bonus;
    }
}
