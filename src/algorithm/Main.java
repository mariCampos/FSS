package algorithm;

import problems.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere problema = new Sphere(30);
		//Rosenbrock problema = new Rosenbrock(30);
		//Ackley problema = new Ackley(30); //MELHOR RESULTADO OBTIDO
		//Rastrigin problema = new Rastrigin(30);
		//Schwefel12 problema = new Schwefel12(30);
		
		FishSchoolSearch cadurme = new FishSchoolSearch(problema);
		
		cadurme.Busca(10000, 1);
	}

}
