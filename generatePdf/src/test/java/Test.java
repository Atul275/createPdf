package test.java;

class PolymorphismTest 
{
	public void test() 
	{
		System.out.println("I am base class data");
	}
}
class ChildTest extends PolymorphismTest
{
	@Override
	public void test() {
		System.out.println("I am child class data");
	}
}

public class Test
{
	public static void main(String[] args) {
		ChildTest ch = new ChildTest();
		ch.test();
		PolymorphismTest p =new ChildTest();
		p.test();
		ChildTest pc = (ChildTest) new PolymorphismTest();
		pc.test();
	}
}