import javax.swing.JOptionPane;

public class CarTest {
    public static void main(String[] args) {

        //Pergunta a marca dos carros
        String carBrand1 = JOptionPane.showInputDialog ("Qual a marca do primeiro carro?");
        String carBrand2 = JOptionPane.showInputDialog ("Qual a marca do segundo carro?");

        //Pergunta a marca dos carros
        String carPlate1 = JOptionPane.showInputDialog ("Qual a Placa do primeiro carro?");
        String carPlate2 = JOptionPane.showInputDialog ("Qual a Placa do segundo carro?");

        //Cria carro 1 e 2
        Car car1 = new Car(carBrand1, carPlate1);
        Car car2 = new Car(carBrand2, carPlate2);

        //set 
        car1.setCarBrand(carBrand1);
        car1.setCarPlate(carPlate1);

        //get
        car2.setCarBrand(carBrand2);
        car2.setCarPlate(carPlate2);

        //Escreve na tela as marcas dos carros
        System.out.println("A marca do primeiro carro é " + car1.getCarBrand(carBrand1)); 
        System.out.println("A marca do segundo carro é " + car2.getCarBrand(carBrand2)); 
        
        //Escreve na tela as placas dos carros
        System.out.println("A placa do primeiro carro é " + car1.getCarPlate(carPlate1)); 
        System.out.println("A placa do segundo carro é " + car2.getCarPlate(carPlate2)); 

        //Chama os métodos dos carros
        car1.openDoor();
        car1.startEngine();
        car2.openDoor();
        car2.startEngine();
        
    }

}