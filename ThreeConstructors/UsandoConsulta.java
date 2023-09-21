package ThreeConstructors;

public class UsandoConsulta {

	public static void main(String[] args) {

		Consulta consulta1 = new Consulta("19/09/2006" ,"Roberto");
		Consulta consulta2 = new Consulta("Jonas");

		System.out.println(consulta1.getData());
		System.out.println(consulta1.getDents());
		System.out.println(consulta2.getPonte());
		

	}
}
