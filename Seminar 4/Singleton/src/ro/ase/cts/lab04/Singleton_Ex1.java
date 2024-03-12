package ro.ase.cts.lab04;

public class Singleton_Ex1 {
    

	private static Singleton_Ex1 instance;

    //private CONSTRUCOTR!
    private Singleton_Ex1()
    { // code if needed
    }

    //public method to get the instance of the singleton class

    public static Singleton_Ex1 getInstance(){
        if (instance == null)
        {
            instance= new Singleton_Ex1();
        }
        return instance;
    }

    public void doSomething() {System.out.println("Singleton is doing something.");}

}
