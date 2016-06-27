package designpattern.Singleton;

public class Client {

    public static void main(String[] args){

        Singleton singleton1 = Singleton.getUniqueInstance();
        Singleton singleton2 = Singleton.getUniqueInstance();
        System.out.println(singleton1.hashCode()==singleton2.hashCode());

        SingletonEagerApproach singletonEagerApproach1 = SingletonEagerApproach.getUniqueIntance();
        SingletonEagerApproach singletonEagerApproach2 = SingletonEagerApproach.getUniqueIntance();
        System.out.println(singletonEagerApproach1.hashCode() == singletonEagerApproach2.hashCode());

        SingletonDoubleCheckMethod singletonDoubleCheckMethod = SingletonDoubleCheckMethod.getUniqueInstance();
        SingletonDoubleCheckMethod singletonDoubleCheckMethod1 = SingletonDoubleCheckMethod.getUniqueInstance();
        System.out.println(singletonDoubleCheckMethod.hashCode()== singletonDoubleCheckMethod1.hashCode());



    }

}
