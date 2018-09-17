package entities;

public class Cpf extends Verify {

	private String numCpf;
	
	public Cpf() {
		
	}
	
	public Cpf(String name, String numCpf) {
		super(name);
		this.numCpf = numCpf;
	}

	public String getNumCpf() {
		return numCpf;
	}

	public void setNumCpf(String numCpf) {
		this.numCpf = numCpf;
	}

	@Override
	public boolean teste() {
		
		String teste = numCpf;

		int dv = Integer.parseInt(teste.substring(12));
		int p = 0;
		int mult = 10;
		
		for (int i = 0; i <= 10; i++) {
			if (teste.charAt(i) != '.') {
				p += Integer.parseInt(teste.substring(i, i + 1)) * mult;
				mult--;
			}
		}
		int dvv = (p * 10) % 11;
		if (dvv == 10) {
			dvv = 0;
		}
		
		mult = 11;
		p = 0;
		for (int i = 0; i <= 12; i++) {
			if (teste.charAt(i) != '.' && teste.charAt(i) != '-') {
				p += Integer.parseInt(teste.substring(i, i + 1)) * mult;
				mult--;
			}
		}
		int dvv2 = (p * 10) % 11;
		if (dvv2 == 10) {
			dvv = 0;
		}
		
		String dvv3 = dvv + "" + dvv2;
		dvv = Integer.parseInt(dvv3);
		
		
		boolean verif;
		if (dvv == dv) {
			verif = true;
		}
		else {
			verif = false;
		}
		
		return verif;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome contribuinte: " + super.getName() + "\n");
		sb.append("CPF: " + numCpf + "\n");
		if (teste() == true) {
			sb.append("ESTE CPF É VÁLIDO!");
		}
		else {
			sb.append("ESTE CPF É INVÁLIDO!");
		}
		return sb.toString();
	}
}
