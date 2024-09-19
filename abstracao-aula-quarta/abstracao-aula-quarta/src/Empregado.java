abstract class Empregado {
    double bonificacao; // Variavel local default
    private double comissao = 1200;
    private double abono = 100;

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public double calularBonificacao(){
        bonificacao = comissao + abono;
        return  bonificacao;
    }
}
