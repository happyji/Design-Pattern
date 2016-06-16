package Singleton;


public class SingletonDoubleCheckMethod {
    private static volatile SingletonDoubleCheckMethod uniqueInstance;

    private SingletonDoubleCheckMethod(){}

    public static SingletonDoubleCheckMethod getUniqueInstance(){

        if(uniqueInstance== null){
            synchronized (SingletonDoubleCheckMethod.class){
                if(uniqueInstance == null)
                uniqueInstance = new SingletonDoubleCheckMethod();
            }
        }

        return uniqueInstance;
    }
}
