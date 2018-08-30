package modal;

public class Vendedor extends Funcionario {

    private int nroVenda;

    public int getNroVenda() {
        return nroVenda;
    }

    public void setNroVenda(int nroVenda) {
        this.nroVenda = nroVenda;
    }

    @Override
    public double calculoSalario(double salario) {
        double comissao = getNroVenda();
        return (salario + (salario * comissao));
    }
}

