package _06_vault;

public class VaultRunner {
public static void main(String[] args) {
	Vault vault = new Vault();
	vault.tryCode(5);
	SecretAgent agent = new SecretAgent();
	System.out.print(agent.findCode(vault));
	
}
}
