package com.kiet.excep;

class VoteException extends Exception{
	int age;
	/*VoteException(int a){
		age=a;
	}*/
	VoteException(String s){
		super(s);
	}
	
	@Override
	public String toString() {
		return "VoteException [age=" + age + "]";
	}

	void check(int a) throws VoteException {
		if(a<18)
			throw new VoteException("not eligible");

			//System.out.println("not eligible");
		else
			System.out.println("eligible to vote");
	}
}
public class VoteExc {

	public static void main(String[] args) throws VoteException {
		// TODO Auto-generated method stub
		VoteException v=new VoteException("VoteException");
		v.check(2);
	}

}
