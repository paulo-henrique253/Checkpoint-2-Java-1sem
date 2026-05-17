package br.com.tdspk.app;

import br.com.tdspk.cliente.Cliente;
import br.com.tdspk.motorista.Motorista;
import br.com.tdspk.veiculo.Veiculo;

public class Aplicacao {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("ABC1C34", "Argo", "Fiat", 2013);
        Veiculo v2 = new Veiculo("DXT5F67", "Polo", "Volkswagen", 2010);
        Veiculo v3 = new Veiculo("GHY8U78", "Corolla", "Toyota", 1967);
        Veiculo v4 = new Veiculo("TTA6H34", "Mobi", "Fiat", 1990);
        Veiculo v5 = new Veiculo("VXT5G90", "Onix", "Chevrolet", 2003);

        Motorista m1 = new Motorista("Carlos", "35334356", "19999234567", "12345678901", "confort", v1);
        Motorista m2 = new Motorista("Fabio", "09876543219", "11999176767", "67890123451", "x", v2);
        Motorista m3 = new Motorista("Sabryna", "12094538299", "11998346721", "09342754104", "black", v3);
        Motorista m4 = new Motorista("Alessandra", "30956120453", "19999125036", "45301284520", "x", v4);
        Motorista m5 = new Motorista("Sergio", "23487901456", "11983420563", "56391036597", "confort", v5);

        Cliente c1 = new Cliente("Luiz", "34850637204", "19982647865");
        Cliente c2 = new Cliente("Bruno Hudson", "284503620476", "11894356782");
        Cliente c3 = new Cliente("Marcia", "26495837269", "11983456290");
        Cliente c4 = new Cliente("Alexander", "47502845367", "11983421109");
        Cliente c5 = new Cliente("Guilherme", "87345102944", "11998867245");
        
    }

}
