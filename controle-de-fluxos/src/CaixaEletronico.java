public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSolicidato = 17.0;

    if(valorSolicidato < saldo)
             saldo = saldo - valorSolicidato;

            System.out.println(saldo);
}
}