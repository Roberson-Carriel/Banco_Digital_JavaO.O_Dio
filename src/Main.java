public class Main {

    public static void main(String[] args) {
        Banco bancoInicial = new Banco(); 

        bancoInicial.setNome("Banco Digital");

        Cliente Roberson = new Cliente("Roberson", bancoInicial);
        Roberson.setNome("Roberson Abrão da Fonseca Carriel");

        Conta ccorrente = new ContaCorrente(Roberson);

        ccorrente.depositar(240);

        Cliente Felipe = new Cliente("Felipe", bancoInicial);
        Conta cpoupanca = new ContaPoupanca(Felipe);

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();

        ccorrente.transferir(120, cpoupanca);

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();
        bancoInicial.mostrarClientes();
    }

}

