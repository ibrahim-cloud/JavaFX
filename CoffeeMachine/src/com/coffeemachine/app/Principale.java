package com.coffeemachine.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.coffeemachine.controllers.ClientController;
import com.coffeemachine.controllers.MachineController;
import com.coffeemachine.controllers.ProductController;
import com.coffeemachine.controllers.TechnicianController;

import com.coffeemachine.models.Client;
import com.coffeemachine.models.Machine;
import com.coffeemachine.models.Product;
import com.coffeemachine.models.Technician;

public class Principale {

	// Clients-Technicians-Machines-Products Lists 
	static List<Technician> technicians;
	static List<Client> clients;
	static List<Machine> machines;
	static List<Product> products;
	
	// Controllers 
	static TechnicianController technicianController;
	static ClientController clientController;
	static MachineController machineController;
	static ProductController productController;
	
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		Scanner reader2 = new Scanner(System.in);
		Scanner readerZ= new Scanner(System.in);
		
		technicianController = new TechnicianController();
		clientController = new ClientController();
		machineController = new MachineController();
		productController = new ProductController();
		
		technicians = new ArrayList<Technician>();
		clients = new ArrayList<Client>();
		machines = new ArrayList<Machine>();
		products = new ArrayList<Product>();
		
		System.out.println("add slect 1");
		int ys = reader.nextInt();
	switch (ys) {
		
			case 1:
		while(ys==1){
		// New Technician
			System.out.println("id:");
		 int id= reader.nextInt();
		 System.out.println("Name;");
		  String firstName= reader2.nextLine();
		  System.out.println("phone:");
		  String lastName= reader2.nextLine();
		  System.out.println("Idref:");
		  String email = reader2.nextLine();
		  System.out.println("AccCode:");
		  String tel = reader.nextLine();
		  
		Technician technician = 
				new Technician(id, firstName,tel,lastName,email);
		technician.AddTechnician(technicians,technician);
		System.out.print("Add another client? y/n : ");
		ys = reader.nextInt();
		
		try {
			System.out.println(technicianController.AddTechnician(technicians, technician));
			for(int i=0; i < technicians.size(); i++){
	 		    System.out.println(i+1 +"-"+ technicians.get(i));
	 		}
			break;
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		}
		
		
	case 2 :
	
		// New Client
		Client client = 
				new Client(65301248, "Ahmed Mohammed", "+212 611 11 11 11", "expresso", 2.50);
		try {
			System.out.println(clientController.AddClient(clients, client));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// New Machine
		Machine machine = new Machine(78118903, null);
		try {
			System.out.println(machineController.AddMachine(machines, machine));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Add Products
		Product p1 = new Product(32196577, "chocolat", 1.0);
		Product p2 = new Product(63100485, "expresso", 2.5);
		Product p3 = new Product(11299873, "lait-chocolat", 3.0);
		Product p4 = new Product(31005687, "coffee-long", 2.5);
		Product p5 = new Product(88621999, "tea", 2.0);
		
		try {
			System.out.println(productController.AddProduct(products, p1));
			System.out.println(productController.AddProduct(products, p2));
			System.out.println(productController.AddProduct(products, p3));
			System.out.println(productController.AddProduct(products, p4));
			System.out.println(productController.AddProduct(products, p5));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			System.out.println(machineController.StartMachine(products, machine,6.0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			for(Product product : machineController.ShowMachineItems(machine)) {
				System.out.println(product.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			for(Product product : machineController.ShowMachineItems(machine)) {
				if(client.getChoice().equalsIgnoreCase(product.getName())) {
					if(client.getCoins() >= product.getPrice()) {
						double rest = client.getCoins() - product.getPrice();
						if(rest<= machine.getSumChange()) {
							client.setRest(rest);
							System.out.println("Thank you, do not forget your change("+rest+"), good by !");
						}else {
							System.out.println("insufficient money in the machine !");
						}
						
					}else {
						System.out.println("You do not have enough money, sorry !");
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
	//////////////////////////////////////////////JAVAFX////////////////////////////////////
	
	
	
}