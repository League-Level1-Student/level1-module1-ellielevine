package _06_vault;

public class SecretAgent {
	public int findCode(Vault vault) {
		int guess = 0;
		while (!vault.tryCode(guess)) {
			guess++;
		}
		return guess;
	}
}
