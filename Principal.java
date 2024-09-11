package funcionario;

public class Principal {

	public static void main(String[] args) {
		
		Jornada jornada = new Jornada();
		Horista horista = new Horista();
		Pessoajuri pessoajuri = new Pessoajuri();
		
		jornada.id();
		jornada.nome();
		jornada.telefone();
		jornada.matricula();
		jornada.endereco();
		jornada.calcularSalario();
		
		System.out.println("---------------");
		
		horista.id();
		horista.nome();
		horista.telefone();
		horista.matricula();
		horista.endereco();
		horista.calcularSalario();
		
		System.out.println("---------------");
		
		pessoajuri.id();
		pessoajuri.nome();
		pessoajuri.telefone();
		pessoajuri.matricula();
		pessoajuri.endereco();
		pessoajuri.calculaSalario();
		
		
	
	
	}

}
