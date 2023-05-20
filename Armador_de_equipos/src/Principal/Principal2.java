package Principal;

import java.util.Random;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		String Arqueros[] = new String[2];
		String Defensores[]= new String[4];
		String Medios[]= new String[2];
		String Delanteros[]= new String[4];
		String Equipo1[]=new String[6];
		String Equipo2[]=new String[6];
		
		System.out.println("Bienvenido al armador de equipos");
		for (int i = 0; i < Arqueros.length; i++) {
			System.out.println("Ingrese el nombre del posible arquero");
			Arqueros[i] = s.nextLine();
		}
		for (int i = 0; i < Defensores.length; i++) {
			System.out.println("Ingrese el nombre del posible defensor");
			Defensores[i] = s.nextLine();
		}
		for (int i = 0; i < Medios.length; i++) {
			System.out.println("Ingrese el nombre del posible medio");
			Medios[i] = s.nextLine();
		}
		for (int i = 0; i < Delanteros.length; i++) {
			System.out.println("Ingrese el nombre del posible delantero");
			Delanteros[i] = s.nextLine();
		}
		
		int j1 = r.nextInt(2);
		int j2 = r.nextInt(2);
		int j3 = r.nextInt(2);
		int j4 = r.nextInt(2);
		int j5 = r.nextInt(4);
		int j6 = r.nextInt(4);
		int j7 = r.nextInt(4);
		int j8 = r.nextInt(4);
		int j9 = r.nextInt(4);
		int j10 = r.nextInt(4);
		int j11 = r.nextInt(4);
		int j12 = r.nextInt(4);
		
		
		
		
		Equipo e1 = new Equipo(Arqueros[j1],Defensores[j5],Defensores[j7], Medios[j3], Delanteros[j9], Delanteros[j11]);
		Equipo e2 = new Equipo(Arqueros[j2],Defensores[j6],Defensores[j8], Medios[j4], Delanteros[j10], Delanteros[j12S]);
		
		System.out.println();
		System.out.println("Equipo 1: ");
		System.out.println(e1.getArquero());
		System.out.println(e1.getDefensor1());
		System.out.println(e1.getDefensor2());
		System.out.println(e1.getMedio());
		System.out.println(e1.getDelantero1());
		System.out.println(e1.getDelantero2());
		System.out.println("-------------------");
		System.out.println("Equipo 2: ");
		System.out.println(e2.getArquero());
		System.out.println(e2.getDefensor1());
		System.out.println(e2.getDefensor2());
		System.out.println(e2.getMedio());
		System.out.println(e2.getDelantero1());
		System.out.println(e2.getDelantero2());
		
	}

}


