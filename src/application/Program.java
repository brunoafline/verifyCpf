package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cnpj;
import entities.Cpf;
import entities.Verify;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Verify> list = new ArrayList<>();

		System.out.print("O que você deseja verificar (C)PF ou C(N)PJ? ");
		char p = sc.next().charAt(0);

		if (p == 'c') {
			System.out.print("Nome contribuinte: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Digite o CPF: ");
			String numCpf = sc.nextLine();
			list.add(new Cpf(name, numCpf));
		} 
		else {
			System.out.print("Nome da empresa: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Digite o CNPJ: ");
			String numCnpj = sc.nextLine();
			list.add(new Cnpj(name, numCnpj));
		}

		System.out.println();
		for (Verify v : list) {
			System.out.println(v.toString());
		}

		sc.close();
	}

}
