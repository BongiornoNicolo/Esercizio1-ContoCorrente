package org.example;

public class ContoBancario {
    private double balance;


    //coatruttore
    public ContoBancario(double balance) {
        this.balance = balance;

    }

    //metodo preleva
    public double Preleva(double importo) throws  Exception {
        if (importo <= 0) {
            throw new ImportoNonValidoException("Importo negativo");
        }
        if (balance < importo) {
            throw new SaldoInsufficienteException("sei un poraccio");
        }

        return importo;
    }
}
