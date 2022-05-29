package dio.designpatterns;

import dio.designpatterns.singleton.SingletonEager;
import dio.designpatterns.singleton.SingletonLazy;
import dio.designpatterns.singleton.SingletonLazyHolder;

public class Teste {

    public static void main(String[] args) {

        //Testes para Design patterns Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
    }
}
