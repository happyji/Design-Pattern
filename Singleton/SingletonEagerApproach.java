package Singleton;

public class SingletonEagerApproach {
    private static SingletonEagerApproach uniqueIntance = new SingletonEagerApproach();

    private SingletonEagerApproach(){}

    public static  SingletonEagerApproach getUniqueIntance(){
        return uniqueIntance;
    }

}
