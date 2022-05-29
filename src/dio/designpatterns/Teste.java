package dio.designpatterns;

import dio.designpatterns.singleton.SingletonEager;
import dio.designpatterns.singleton.SingletonLazy;
import dio.designpatterns.singleton.SingletonLazyHolder;
import dio.designpatterns.strategy.*;

public class Teste {

    public static void main(String[] args) {

        //Testes para Design patterns
        // Singleton

//        SingletonLazy lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//        lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//
//        SingletonEager eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//        eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//
//        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
//        System.out.println(holder);
//        holder = SingletonLazyHolder.getInstancia();
//        System.out.println(holder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
    }
}
