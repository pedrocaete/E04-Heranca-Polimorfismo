
public class Main {

    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica("123456789", 30, 'M', "João da Silva", "Rua XYZ, 123");
        PessoaJuridica empresa1 = new PessoaJuridica("12345678901234", 50, "Tecnologia", "Empresa XYZ", "Av. Principal, 123");
        ContaPF contapf = new ContaPF(1000.0, 123456, "001", 500.0, pessoa1);
        ContaPJ contapj = new ContaPJ(10000.0, 5789, "002", 200000.0,empresa1);

        empresa1.imprimir();
        pessoa1.imprimir();

        contapf.imprimir();
        contapj.imprimir();

        contapf.depositar(900);
        contapf.sacar(100);

        contapf.extrato();

        contapj.depositar(900);
        contapj.sacar(100);

        contapj.extrato();
    }
}
