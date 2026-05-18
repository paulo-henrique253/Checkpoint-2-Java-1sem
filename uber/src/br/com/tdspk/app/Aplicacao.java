package br.com.tdspk.app;

import br.com.tdspk.cliente.Cliente;
import br.com.tdspk.motorista.Motorista;
import br.com.tdspk.veiculo.Veiculo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Random;
import java.util.Scanner;

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



        System.out.println("1. " + c1);
        System.out.println("2. " + c2);
        System.out.println("3. " + c3);
        System.out.println("4. " + c4);
        System.out.println("5. " + c5);

        System.out.println("Escolha um cliente pelo numero👻");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        while (escolha < 1 || escolha > 5){
            System.out.println("Insira um numero de 1 a 5");
            escolha = scanner.nextInt();
        }
        Cliente cliente = new Cliente();
        switch (escolha){
            case 1 -> {
                cliente = c1;
                break;
            }
            case 2 -> {
                cliente = c2;
                break;
            }
            case 3 ->{
                cliente = c3;
                break;
            }
            case 4 -> {
                cliente = c4;
                break;
            }
            case 5 -> {
                cliente = c5;
                break;
            }
        }

        System.out.println("Informe o método de pagamento:");
        String pagamento = scanner.next() + scanner.nextLine();

        System.out.println("Informe o endereço de origem:");
        String origem = scanner.nextLine();

        System.out.println("Informe o endereço do destino:");
        String destino = scanner.nextLine();

        Random rand = new Random();
        int randomizacaoVeiculo = rand.nextInt(5) + 1;

        Veiculo veiculo = new Veiculo();
        Motorista motorista = new Motorista();

        switch (randomizacaoVeiculo){
            case 1 -> {
                motorista = m1;
                break;
            }
            case 2 -> {
                motorista = m2;
                break;
            }
            case 3 ->{
                motorista = m3;
                break;
            }
            case 4 -> {
                motorista = m4;
                break;
            }
            case 5 -> {
                motorista = m5;
                break;
            }
        }
        veiculo = motorista.getVeiculo();
        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        LocalDate data = LocalDate.now(sp);

        double valor = rand.nextDouble(100);

        System.out.println("Data: " + data);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Valor: R$" + String.format("%.2f", valor));
        System.out.println("Forma de pagamento: " + pagamento);

        System.out.println("======================");

        System.out.println("Informações do carro: ");
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Montadora: " + veiculo.getMontadora());
        System.out.println("Ano: " + veiculo.getAno());

        System.out.println("======================");

        System.out.println("Informações do motorista:");
        System.out.println("Nome: " + motorista.getNome());
        //System.out.println("CPF: " + motorista.getCpf());
        System.out.println("Celular: " + motorista.getCelular());
        System.out.println("Habilitação: " + motorista.getHabilitacao());
        System.out.println("Categoria: " + motorista.getCategoria());


    }

}
