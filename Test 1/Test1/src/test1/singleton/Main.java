package test1.singleton;

public class Main {

	public static void main(String[] args) {
		
		ITestingModule instance = TestingModule.getInstance();
		System.out.println(instance.test());
		
		ITestingModule instance2 = TestingModule.getInstance();
		System.out.println(instance2 == instance);
	}

}
