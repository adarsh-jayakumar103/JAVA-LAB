import java.util.Scanner;

public class Lab1 {
	public static void main(String args[]) 
	{
	String a,choice;
	int b,c,total=0,i=0;
	Scanner input1 = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	Scanner input3 = new Scanner(System.in);
	Scanner input4 = new Scanner(System.in);

	String array[] = new String[10];
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
				i++;
				break;
			}
			else{
				break;
			}
			case 2:
			final Object[][] table = new String[5][];
			table[0] = new String[] {" ITEM","  PRICE" };
            table[1] = new String[] {"1. LG smart TV","56000" };
            table[2] = new String[] {"2. One+ Nord","24999" };
            table[3] = new String[] {"3. Whirlpool WM","32990" };
            table[4] = new String[] {"4. Boat Speakers","1999" };

            for (final Object[] row : table) {
                 System.out.format("%15s%15s\n", row);
            }
            c= input3.nextInt();
            switch(c)
            {
            	case 1: 
            	total+=56000;
                array[i]="LG smart TV";
                i++;
                break;
            	case 2:
            	total+=24999;
            	array[i]="One+ Nord";
            	i++;
            	break;
            	case 3:
            	total+=32990;
            	array[i]="Whirlpool WM";
            	i++;
            	break;
            	case 4:
            	total+=1999;
            	array[i]="Boat Speakers";
            	i++;
            	break;
            	default:
            	System.out.println("INVALID");
            	break;
            }
            break;
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
            System.out.print(array[j] + ", ");}
        System.out.println("\n\n\nYour Total amount payable:");
        System.out.println("\n--------------------------");
        System.out.println(total);

  
	
     }
    }
}
   