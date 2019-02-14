package local.edeploy.javacore.Fmodificadorestatico.test;

import local.edeploy.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Audi", 275);
        Carro carro3 = new Carro("Mercedes", 280);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

        Carro.setVelocidadeLimite(220);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
