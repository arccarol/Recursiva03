package view;

import java.util.Scanner;

import controller.Recursiva03;

public class Principal {
	
		public static void main(String[] args) {
			
			new Recursiva03();
			
			try (Scanner leia = new Scanner(System.in)) {

            int n;
            System.out.println("Digite um núemro: ");
            n=leia.nextInt();
            if(n>12) {
				System.out.println("Numero acima do limite");
             }else {
            int resultado = Recursiva03.fatorial(n);
            System.out.println(resultado);
}
			}
	}
	}


