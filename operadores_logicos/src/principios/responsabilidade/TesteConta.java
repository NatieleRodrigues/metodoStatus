package principios.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria bancaria= new ContaBancaria();
		bancaria.setDescricao("Conta Bancaria da Natiele"); 
		
		System.out.println(bancaria);
		
		bancaria.dimi100Reais();
		bancaria.dimi100Reais();
		
		System.out.println(bancaria);
		
		bancaria.sacarDidinheiro(400);
		
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(1000);
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(100);
		System.out.println(bancaria);
		
	}

}
