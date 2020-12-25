package application;

import java.awt.List;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.coffeemachine.models.Client;
import com.coffeemachine.models.Machine;
import com.coffeemachine.models.Product;
import com.coffeemachine.models.Technician;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {
	///////add Technician
	 
	@FXML
	    private TextField Myid;
	   @FXML
	    private DatePicker dataM;
	    @FXML
	    private Label LabelMyname;
	    @FXML
	    private Label PhoneL;

	    @FXML
	    private Label RefL;

	    @FXML
	    private Label CodeL;
	    @FXML
	    private TextField Myname;

	    @FXML
	    private TextField Myphone;

	    @FXML
	    private TextField Myemail;

	    @FXML
	    private TextField Myref;
	    @FXML
	    private TextField Mycode;
	    @FXML
	    private TableView<Technician> Table;

	    @FXML
	    private TableColumn<Technician, String> idC;

	    @FXML
	    private TableColumn<Technician, String> t1C;

	    @FXML
	    private TableColumn<Technician, String> phoneC;

	    @FXML
	    private TableColumn<Technician, String> idRefC;

	    @FXML
	    private TableColumn<Technician, String> CodeC;	
	public void ShowHello() {
		int Id =Integer.parseInt(Myid.getText());
		String t1 = Myname.getText();
		String t2 = Myemail.getText();
		String t3 = Myref.getText();
		String t4 = Mycode.getText();
		idC.setCellValueFactory(new PropertyValueFactory<>("id"));
		t1C.setCellValueFactory(new PropertyValueFactory<>("name"));
		phoneC.setCellValueFactory(new PropertyValueFactory<>("phone"));
		idRefC.setCellValueFactory(new PropertyValueFactory<>("idRef"));
		CodeC.setCellValueFactory(new PropertyValueFactory<>("accessCode"));
		Technician technician = new Technician(Id, t1 , t2, t3, t4);
		Table.getItems().add(technician);
		Table.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		Table.getSelectionModel().setCellSelectionEnabled(true);
		
		/*TablePosition<Technician, ?> tablePosition = Table.getSelectionModel().getSelectedCells().get(0);
		int row = tablePosition.getRow();
		Technician item = Table.getItems().get(row);
		TableColumn<Technician, ?> tableColumn = tablePosition.getTableColumn();
		String data = (String) tableColumn.getCellObservableValue(item).getValue();
		System.out.println(data);
		TableColumn<Technician, String> column = t1C ; // column you want

		ArrayList<String> columnData = new ArrayList<>();
		for (Technician item : Table.getItems()) {
		    columnData.add(t1C.getCellObservableValue(item).getValue());
		    System.out.println(columnData);
		}*/
	}
	///////add client
	 @FXML
	    private TextField clientId;

	    @FXML
	    private TextField clientName;

	    @FXML
	    private TextField clientPhone;

	    @FXML
	    private TextField clientChoise;

	    @FXML
	    private TextField clientCoins;
	    
	    @FXML
	    private TableView<Client> TableClients;
	    
	    @FXML
	    private TableColumn<Client, Integer> clientidC;

	    @FXML
	    private TableColumn<Client, String> clientNameC;

	    @FXML
	    private TableColumn<Client, String> clientPhoneC;

	    @FXML
	    private TableColumn<Client, String> clientChoiseC;

	    @FXML
	    private TableColumn<Client, Integer> clientCoinsC;
	    
	
	public void AddClient1() {
		
		int Idc =Integer.parseInt(clientId.getText());
		String t1c = clientName.getText();
		String t2c = clientPhone.getText();
		String t3c = clientChoise.getText();
		double t4c = Integer.parseInt(clientCoins.getText());
		
		clientidC.setCellValueFactory(new PropertyValueFactory<>("id"));
		clientNameC.setCellValueFactory(new PropertyValueFactory<>("name"));
		clientPhoneC.setCellValueFactory(new PropertyValueFactory<>("phone"));
		clientChoiseC.setCellValueFactory(new PropertyValueFactory<>("Choise"));
		clientCoinsC.setCellValueFactory(new PropertyValueFactory<>("coins"));
		Client Client1 = new Client(Idc, t1c , t2c, t3c, t4c);
		TableClients.getItems().add(Client1);
		
	}
	////////Add Machine
    @FXML
    private TextField idMachine;

    @FXML
    private TextField turn;

   
    
    @FXML
    private TableView<Machine> TableMachine;

    @FXML
    private TableColumn<Machine, Integer> idMachineC;

    @FXML
    private TableColumn<Machine, String> turnC;

    
    public void AddMachine1() {
    	int Idm =Integer.parseInt(idMachine.getText());
    	String tm =turn.getText();
    	
    	
    	idMachineC.setCellValueFactory(new PropertyValueFactory<>("id"));
    	turnC.setCellValueFactory(new PropertyValueFactory<>("turn"));
    
    	Machine Machine = new Machine(Idm, tm);
    	
    	TableMachine.getItems().add(Machine);
	
    }
    //////add Product
    @FXML
    private TextField idProduct;

    @FXML
    private TextField priceProduct;
    
    @FXML
    private TextField NameProduct;

   

    @FXML
    private TableView<Product> TableProduct;

    @FXML
    private TableColumn<Product,Integer > idProductC;
    
    @FXML
    private TableColumn<?, ?> NameProductC;

    @FXML
    private TableColumn<Product, Integer> priceProductId;
    
    public void AddProduct1() {
    	int IdP =Integer.parseInt(idProduct.getText());
    	String tP =NameProduct.getText();
    	double t4P = Integer.parseInt(priceProduct.getText());
    	
    	idProductC.setCellValueFactory(new PropertyValueFactory<>("id"));
    	NameProductC.setCellValueFactory(new PropertyValueFactory<>("name"));
    	priceProductId.setCellValueFactory(new PropertyValueFactory<>("price"));
    	
    
    	Product Product = new Product(IdP, tP,t4P);
    	
    	TableProduct.getItems().add(Product);
    	
    	
    }
    
    ////////////////// Slect Machine
    


  
	
    @FXML
    private ComboBox <String>  boxSlectMachine;

      
    @FXML
    private TextField YourMachin;
    
    public void display() {
    		


    	String S = boxSlectMachine.getSelectionModel().getSelectedItem().toString()+" started";
    	
    	YourMachin.setText(S);
    	
    
	
    }
    @FXML
    private TextField TESTtext;
    
   public void ShowItem () {
	   
		
    	
    	ObservableList<String> list =FXCollections.observableArrayList("machine1","Machine7","Machine4","Machine5","Machine6");
boxSlectMachine.setItems(list);



    	
    	
    }
    
    	
	

}
