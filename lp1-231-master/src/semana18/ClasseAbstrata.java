packege semana18;
public class ClasseAbstrata {
public abstract class Conta {
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;
}
public class Taste { 
    public static void main (String[] args){
        Correntista cor1 = new Correntista(1,"João Silva");
        Conta c1 = new Conta(1,20.00,cor1);
    }
}
public abstract class Conta{
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;
}
public class Teste {
    public static void main(String[] args){
        Correntista cor1 = new Correntista(1,"João Silva");
        Conta c1 = new Conta(1,20.00,cor1);
    }
}
public abstract class Conta {
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;
}
public class ContaCorrente extends Conta { 
    private double limite;
    public ContaCorrente(int numero, double tarifa, double limite,Correntista correntista) {
        super (numero , tarifa,correntista);
        this.limite=limite;

    }

}
public class Teste {
    public static void main(String[] args){
        Correntista cor1 = new Correntista(1,"João Silva");
        //Conta c1 = new Conta(1,20.00,cor1);
        ContaCorrente cc1 = new ContaCorrente(1, 20.00 , 2000.00,cor1);
    }
}
}
    


    


