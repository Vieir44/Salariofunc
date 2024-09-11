package funcionario;

public class Pessoajuri {

	int valorBruto = 5000, imposto = 500;
	int salario = valorBruto-imposto;
	
	public long id() {
		System.out.println(03);
		return 0;
	}
	public String nome() {
		System.out.println("Ana");
		return "a";
	}
	public String telefone() {
		System.out.println("345395739");
		return "a";
	}
	public int matricula() {
		System.out.println(004);
		return 0;
	}
	public String endereco() {
		System.out.println("Rua 5");
		return "a";
	}
	public void calculaSalario() {
		System.out.println(salario);
	}
}

