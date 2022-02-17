package org.test;

public class Tcs extends Hdfc {
	@Override
	public void savings() {System.out.println("9%");
	}
   @Override
public void deposit() {System.out.println("2%");
}
   public static void main(String[] args) {
	Tcs t = new Tcs();
	t.deposit();
	t.savings();
}

}
