package Singleton;

public class Singleton {
    static Singleton uniqueInstance; // step 1 static

    private Singleton(){} // step 2 constructor private

    public static synchronized Singleton getUniqueInstance(){              // logic to give same instance every time
        if(uniqueInstance== null)
            uniqueInstance = new Singleton();

        return uniqueInstance;
    }

}
