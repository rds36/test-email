package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName,lastName, password, department, email;
	private int deptChoice;
	public Scanner scan = new Scanner(System.in);
;
	
//	Constructor untuk menerima firstname sama lastname
	public Email() {};
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;		

		System.out.println("Created : " + this.firstName + " "  + this.lastName);
		System.out.print("masukan code departement\n1.dev\n2.sales\nkode: "); 
		deptChoice = scan.nextInt();
		scan.nextLine();
		setDept(deptChoice);
		email = genEmail();
		System.out.println("Email created! \n");
		password = genPass(8);

	}
	
	
//	mothod tanya department
	
	private void setDept(int deptChoice) {
		switch (deptChoice) {
		case 1:
			this.department = "dev";
			break;
		case 2: 
			this.department = "sales";
			break;
		default:
			System.out.println("kode salah");
			break;
		}
	}
	
//	Generate Email address=====================================================================
	
	private String genEmail() {
		String email = firstName.concat(lastName).toLowerCase()+"@" + this.department +"mail.co.id";
		return email;
	}
	
//	method generate random password============================================================
	
	private String genPass(int length) {
		String password = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] huruf = new char[length];
		int rand;
		
		//		Untuk Huruf pertama password huruf kapital.
		rand = (int) (Math.random() * (password.length()/2)+26);
		huruf[0] = password.charAt(rand);
		
		//		Untuk huruf kedua dst agar mengambil huruf kecil
		for (int i = 1; i < length; i++) {
			rand = (int) (Math.random() * (password.length()/2));
			huruf[i] = password.charAt(rand);
		}
		
		return new String(huruf);
	}

	
//	method changepassword============================================================
	
	public void changePassword(String newPass) {
		this.password = newPass;
	}

//	method tampil password============================================================
	
	public String getPassword() {
		return this.password;
	}
	
//	show info
	
	public void showInfo() {
		System.out.println("Name : " + firstName + " " + lastName);
		System.out.println("Department : " + department);
		System.out.println("Email : " + email);
	}
}

