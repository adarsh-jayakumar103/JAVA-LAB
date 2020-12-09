import java.util.*;
import myPackage.login;                                                                     //package
class LoginDetails extends login{
    public void getID()
    {
        int i= 1001;
    }
    public void getName(){
        String name="Adarsh";
    }
    
}
interface checkOut{
	int total =0;
	int cusID=101;
	String Name="ADARSH";
	static void change(){                                                                  //static function
		String Name1 = "Customer";
		}
    }
    
class MyException extends Exception{                                                      //user-defined exception
    public MyException(String s){
        super(s);

    }
}


public class amazon implements checkOut{
	
	int CustID;
    String Cust_name;
    String Array[] = new String[100];
    static int item_count;                                                                //static variable
	private static String msg = "Welcome to Amazon!! Happy Shopping\n";
	final int shop_limit=100000;                                                           //final keyword
	final int min_shop=1000;

static{                                                                                    //Static block to initialise static variable
		item_count=0;
	}

	static void change(){
        item_count = 0;
    }
    abstract class Amazon{                                                                //Abstract Class
		abstract double printOrder();
	}

	class discount extends Amazon{    //Class extending abstract class
		double printOrder(){
			return 0.05;
		}
	}
	public static class NestedStaticClass                                                  //Static Class                                                           
	{                                                                                     // Only static members of Outer class is directly accessible in nested static class
     public void printMessage()
  	{
      System.out.println("Work hard. Have Fun. Make history \n" + msg);
    }
  }

  amazon(){                                                                                //Default constructor
  	CustID=101;
  	Cust_name="Adarsh";
  }
  amazon(int id,String name){                                                              //Constructor overloading
  	CustID=id;
  	Cust_name=name;
  }

  void print_Order(){                                                                       //overloading
  	int n = Array.length;
		System.out.print("Your Order:\n\n");
        for (int j = 0; j < n; j++) {
        	if(Array[j]!= null)
            System.out.print(Array[j] + ", ");}
  }

  public int Customer(){
  	return CustID;
  }


  public static void Bill(Double net_total) throws MyException{                                                            //Member Function, Access Specifier
  	if(net_total<1000) {
          throw new MyException("Min order of 1000rs required!!\n");
  	}
  	else if (net_total>100000) {
        throw new MyException("Maximum cart value reached");

  		
  	}
  	else{
  		System.out.println("\n\n\nYour Total amount payable:");
        System.out.println("\n--------------------------");
        System.out.println(net_total);
  	}
  }
  public static void Bill(Double net_total, Double coupon) throws MyException{                                              //function overloading
	 if(net_total<1000){
        throw new MyException("Min order of 1000rs required!!\n");
  	}
  	else if (net_total>100000) {
        throw new MyException("Maximum cart value reached");

  		
  	}
  	else{
          double val=net_total*coupon;
          net_total=net_total-(net_total*coupon);
          System.out.printf("\n\nDiscount= %.2f ",val);
		  System.out.println("\nYour Total amount payable:");
          System.out.println("\n--------------------------");
          System.out.println(net_total);
  	} 

  }
  public static void slowPrint(StringBuffer text, long millisPerChar){
	for(int i = 0; i < text.length(); i++){
		System.out.print(text.charAt(i));
		try{                                                                                   //Build-in  Exception
			Thread.sleep(millisPerChar);                                                       //Thread
	  }
	  catch(InterruptedException ex){                                                           
		  Thread.currentThread().interrupt();
	  }
  }
}
  synchronized static void printTable(Object[][] table){                      //thread synch
    for (final Object[] row : table) {
        System.out.format("%15s%15s\n", row);
        try{  
            Thread.sleep(400);  
           }catch(Exception e){System.out.println(e);}  
         }  
   }



public static void main(String[] args) {
        StringBuffer text1=new StringBuffer(" _____    __   __    _____   _____     ____   _____ \n");
        StringBuffer text2=new StringBuffer("|_____|  |  |_|  |  |_____|     /     |    |   |   |\n");
        StringBuffer text3=new StringBuffer("|     |  |       |  |     |    /____  |____|   |   | INC\n");
        slowPrint(text1,10);
        slowPrint(text2,10);
        slowPrint(text3,10);
		StringBuffer text= new StringBuffer("Welcome to AMAZON inc.\n");                               //StringBuffer
		slowPrint(text,30);
		System.out.println("ID : "+args[0]);                                                         //command line arguments
    System.out.println("Welcome "+args[1]+"\n");	
    String a,choice;                                                                             //string
    int b,c,i=0;
    double total=0;
	Scanner input1 = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	Scanner input3 = new Scanner(System.in);
	Scanner input4 = new Scanner(System.in);
    String array[] = new String[10];
    List<Integer> list = new ArrayList<Integer>();
    System.out.println("Main thread is- "+ Thread.currentThread().getName());                         //RUNNABLE INTERFACE
	Thread t1=new Thread(new amazon().new RunnableImpl()); 
    t1.start(); 
	System.out.println(" Do you want to place an order?(Y/N)");
	 if(input1.next().startsWith("Y"))
	 {
	 	do{
		System.out.println("Select Categorie:\n1. Amazon Prime\n2. TV, Appliances,Electronic");
		b= input2.nextInt();
		
		switch(b){
			case 1: 
			System.out.println("Want to be a prime member for INR 129?:(Y/N)");
			if(input3.next().startsWith("Y")){
				total+=129;
                array[i]="Amazon Prime";
                list.add(129);  
				i++;
				break;
			}
			else{
				break;
			}
			case 2:
			final Object[][] table = new String[5][];
			table[0] = new String[] {" ITEM","  PRICE" };
            table[1] = new String[] {"1.LG smart TV","56000" };
            table[2] = new String[] {"2.One+ Nord","24999" };
            table[3] = new String[] {"3.Whirlpool WM","32990" };
            table[4] = new String[] {"4.Boat Speakers","1999" };

            printTable(table);
            c= input3.nextInt();
            switch(c)
            {
            	case 1: 
            	total+=56000;
                array[i]="LG smart TV";
                list.add(56000);
                i++;
                break;
            	case 2:
            	total+=24999;
                array[i]="One+ Nord";
                list.add(24999);
            	i++;
            	break;
            	case 3:
            	total+=32990;
                array[i]="Whirlpool WM";
                list.add(32990);
            	i++;
            	break;
            	case 4:
            	total+=1999;
                array[i]="Boat Speakers";
                list.add(1999);
            	i++;
            	break;
            	default:
            	System.out.println("INVALID");
            	break;
            }
            break;
            case 3:
            

            default:
            System.out.println("Wrong Input, Exitting.....\n");
            break;
            }
            System.out.println("Do you want to continue shopping?(Y/N)");
            choice= input4.nextLine();

       }while(choice.equals("Y"));
       int n = array.length;
		System.out.print("Your Order:\n\n");
        for (int j = 0; j < n; j++) {
        	if(array[j]!= null)
            System.out.print(array[j] + "\n ");}
            System.out.println("Value of maximum element from the collection: "+Collections.max(list));   //collection class
            System.out.println("Value of minimum element from the collection: "+Collections.min(list));  
            
            if(total>10000){
                try{
                    Bill(total,0.05);
                }
                catch(MyException ex){
                    System.out.println(ex.getMessage());
                }
                
            }
            else if(total<10000) {
                try{
                    Bill(total);
                }
                catch(MyException ex){
                    System.out.println(ex.getMessage());
                }
            }
  	else{
  		System.out.println("\n\nYour Total amount payable:");
        System.out.println("\n--------------------------");
        System.out.println(total);
  	}
   }
}
private class RunnableImpl implements Runnable { 
  
    public void run() 
    { 
        System.out.println(Thread.currentThread().getName() + ", executing run() method!"); 
    } 
} 
}
