package lista24;

public class Principal2 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		  Gerente g = new Gerente();
		  Vendedor v = new Vendedor();
		  
		  System.out.println("Digite o nome do gerente: ");
	        String nomeG = sc.nextLine();
	        g.setNome1(nomeG);
			    
	        System.out.println("Digite o salário base do gerente: ");
	        double salarioG = sc.nextDouble();
	        g.setSalario(salarioG);

	        System.out.println("Digite o departamento do gerente: ");
	        String dep = sc.next();
	        g.setDepartamento(dep);


	     
	        System.out.println("\nDigite o nome do vendedor: ");
	        String nomeV = sc.next();
	        v.setNome1(nomeV);

	        System.out.println("Digite o salário base do vendedor: ");
	        double salarioV = sc.nextDouble();

	        v.setSalario(salarioV);

	        System.out.println("Digite a comissão do vendedor: ");
	        double comissao = sc.nextDouble();

	        v.setComissao(comissao);


	      
	        System.out.println("\n--- GERENTE ---");
	        System.out.println("Nome: " + g.getNome1());
	        System.out.println("Salário base: " + g.getSalario());
	        System.out.println("Departamento: " + g.getDepartamento());
	        System.out.println("Salário final: " + g.calcularSalario());
	        g.gerenciar();

	        System.out.println("\n--- VENDEDOR ---");
	        System.out.println("Nome: " + v.getNome1());
	        System.out.println("Salário base: " + v.getSalario());
	        System.out.println("Comissão: " + v.getComissao());
	        System.out.println("Salário final: " + v.calcularSalario());
	        v.vender();
			}

		}
