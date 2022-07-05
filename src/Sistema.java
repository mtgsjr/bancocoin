public class Sistema {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1415, 101500);
        cc.deposita(900.0);
        SeguroDeVida seguro = new SeguroDeVida();
        CalculoDeImposto calc = new CalculoDeImposto();        
        calc.registra(cc);
        calc.registra(seguro);
        // Seguro de Vida mais o Imposto retido nas transações
        // Seguro = 9.90 + 1% do Saldo (1000) = 9.9 + 10 = 19.9
        System.out.println("AGENCIA: "+cc.getAgencia());
        System.out.println("CONTA CORRENTE: "+cc.getNumero());
        System.out.println("SALDO: "+cc.getSaldo());        
        System.out.println("(A PAGAR): "+calc.getTotalImposto());        
	}
}


