package _06_vault;

import _06_vault.Vault;

public class secretagent {

		
		
		Vault vault = new Vault();
		
		
		static void findCode(Vault vualt) {
			for(int i = 0; i<1000001; i++) {
				if(vualt.tryCode(i)) {
					System.out.println(i);
				}
			}
		}
}


