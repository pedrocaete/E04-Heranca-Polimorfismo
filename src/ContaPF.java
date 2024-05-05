public class ContaPF extends Conta {

    private PessoaFisica dono;

    public ContaPF(double saldo, int numero, String agencia, double limite, PessoaFisica dono) {
        super(saldo, numero, agencia, limite);
        this.dono = dono;
    }

    void imprimir(){
        System.out.println("Número: " + this.getNumero());
        System.out.println("Dono: " + this.dono.getNome());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Limite: " + this.getLimite());
    }



    String getDono(){
        return dono.getNome();
    }

}
