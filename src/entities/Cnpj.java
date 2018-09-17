package entities;

public class Cnpj extends Verify{
	
	private String numCnpj;
	
	public Cnpj() {
		
	}
	
	public Cnpj(String name, String numCnpj) {
		super(name);
		this.numCnpj = numCnpj;
	}

	public String getNumCnpj() {
		return numCnpj;
	}

	public void setNumCnpj(String numCnpj) {
		this.numCnpj = numCnpj;
	}

	@Override
	public boolean teste() {
		// Ainda vou gerar o c�digo
		return false;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome da empresa: " + super.getName() + "\n");
		sb.append("CNPJ: " + numCnpj + "\n");
		if (teste() == true) {
			sb.append("ESTE CNPJ � V�LIDO!");
		}
		else {
			sb.append("ESTE CNPJ � INV�LIDO!");
		}
		return sb.toString();
	}

}
