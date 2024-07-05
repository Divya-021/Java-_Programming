package com.kiet.excep;

class User extends Exception{
	String a;

	public User(String a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "User [a=" + a + "]";
	}
	
}
public class CustEx {

	public static void main(String[] args) throws User {
		// TODO Auto-generated method stub
		throw new User("Raise Exception");
		/*try {
			
		}
		catch(User u) {
			System.out.println("exception caught"+ u);
		}*/
		
	}

}
