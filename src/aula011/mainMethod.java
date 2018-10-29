package aula011;

public class mainMethod {

	public static void main(String[] args) {
		/*Visitante v1 =  new Visitante ();
        v1.setNome("DEd");
        v1.setIdade(20);
        v1.setSexo("Masculin");
        
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Dedin");
        a1.setMatricula(11111);
        a1.setCurso("Sistemas da informação");
        a1.setIdade(16);
        a1.setSexo("M");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        
        b1.setNome("Dedobolser");
        b1.setMatricula(123456);
        b1.setIdade(20);
        b1.setSexo("M");
        b1.setCurso("Analise e Desenvolviment de System");
        b1.pagarMensalidade();
	} 

}
