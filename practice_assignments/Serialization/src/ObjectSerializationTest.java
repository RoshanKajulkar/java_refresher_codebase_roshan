import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializationTest {
	public static void main(String[] args) {
		
		SavingsAccount saObj1 = new SavingsAccount(101,"Julie",50000.0,1234);
		SavingsAccount saObj2 = new SavingsAccount(102,"Roshan",150000.0,5678);
		SavingsAccount saObj3 = new SavingsAccount(103,"Sanket",550000.0,9989);
		SavingsAccount saObj4 = new SavingsAccount(104,"Pavan",750000.0,6565);
		SavingsAccount saObj5 = new SavingsAccount(105,"Onkar",850000.0,5566);
		try {
			FileOutputStream fout = new FileOutputStream("BANK.TXT");
			System.out.println("File is ready...");
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			System.out.println("Object output stream is also ready...");
			
			oos.writeObject(saObj1);
			oos.writeObject(saObj2);
			oos.writeObject(saObj3);
			oos.writeObject(saObj4);
			oos.writeObject(saObj5);
			
			System.out.println("Object is serialized ..... ");
			
			oos.close();
			fout.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
	
}