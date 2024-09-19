public class Main {
    public static void main(String[] args) {
        RepresentanteVendas vendedor = new RepresentanteVendas();
        RepresentanteVendas vendedor2 = new RepresentanteVendas();
        Programador programador = new Programador();
        double bonificacao;

        bonificacao = vendedor2.calularBonificacao();
        System.out.println("Bonificaçao Vendedor: R$ "+bonificacao);

        vendedor.setAbono(200);
        vendedor.setComissao(350);
        bonificacao = vendedor.calularBonificacao();
        System.out.println("Bonificaçao Vendedor: R$ "+bonificacao);

        programador.setAbono(450.50);
        programador.setComissao(1350.20);
        bonificacao = programador.calularBonificacao();
        System.out.println("Bonificaçao Programador: R$ "+ bonificacao);
    }
}