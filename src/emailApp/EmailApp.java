package emailApp;

import java.util.ArrayList;
import java.util.Stack;

public class EmailApp {
	private int jumlah;
	public static void main(String[] args) {
		EmailApp ea = new EmailApp();
		ea.setJumlah(8);
		Email em = new Email();
		Email[] email = new Email[ea.jumlah];
		email[0] = new Email("rangga", "dirga");
		email[0].showInfo();
		
		System.out.println();
		
		email[1] = new Email("dirga", "rangga");
		email[1].showInfo();
		
		ArrayList<Email> emails = new ArrayList<Email>();
		
		emails.add(email[0]);
		emails.add(email[1]);
		
		Stack<Email> stackEmail = new Stack<Email>();
		
		stackEmail.push(emails.get(0));
		em.scan.close();
		
		email[2] = new Email("dirga", "suwandi");
		email[2].showInfo();
		
	}
	
	public  void setJumlah(int jmlh){
		jumlah = jmlh;
	}

}
