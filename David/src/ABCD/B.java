package ABCD;

public class B extends A
{
	protected int d= 40;

	public void xxx() {
		System.out.println ("d en B = " + d);
		super.xxx();
	}
}
