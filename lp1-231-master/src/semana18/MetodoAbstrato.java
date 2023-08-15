package semana18;

public abstract class Conta {
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

public abstract double calcularTarifa();

public void sacar (double valor){
    if (valor <= saldo){
        this.saldo-= valor;
    }
}
}
public class ContaCorrente extends Conta {
    private double limite ;

    public ContCorrente(int numero, double tarifa, doule limite, Correntista correntista){
        super(numero,tarifa,correntista);
        this.limite=limite;
    }
    @Override
    public double calcularTarifa(){
        return this.tarifa * 1.5;
    }
    public class ContaPoupanca extends Conta{
        private LocalDate aniversario;

        public ContaPoupanca(int numero, double tarifa, LocalDate aniversario, Correntista correntista){
            super(numero, tarifa , correntista){
                this.aniversario = aniversario;
            }
            @Override
            public double calcularTarifa(){
                return this.tarifa;
            }
    public class ContaSalario extends Conta {
        private Empresa empresa;
        public ContaSalario ( int numero , double tarifa, Empresa empresa, Correntista correntista){
            super ( numero , tarifa , correntista);
            this.empresa= empresa;
        }
        @Override
        public double calcularTarifa(){
            return 0;
        }
        

    }
        }
    }
}