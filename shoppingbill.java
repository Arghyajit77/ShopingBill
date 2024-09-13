import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.naming.Name;

class product{
    private String id;
    private String pname;
    private int qyt;
    private double price;
    private double totalprice;
    // constructor
    product(String id,String pname, int qyt,double price,double totalprice)
    {
        this.id=id;
        this.pname=pname;
        this.qyt=qyt;
        this.price=price;
        this.totalprice=totalprice;
       }
    // greater method
    public String getid()
    {
        return id;
    }
 public String getpname()
    {
        return pname;
    }
     public int getqyt()
    {
        return qyt;
    }
     public double getprice()
    {
        return price;
    }
 public double gettotalprice()
    {
        return totalprice;
    }
    public  static void displayFormat(){
       System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");  
       System.out.println("\nProduct ID\t\tName\t\tQuantity\t\tRate\t\t\t\tTotalprice\n");
       System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");  
    }
    public void display(){
        System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n" ,id, pname, qyt, price, totalprice);  
    }
}
public class shoppingbill {

//private static String Null;
public static void main(String[] args) {
    String id=null;
    String ProductName=null;
    int Quantity=0;
    double price=0;
    double overallprice=0;
    double totalprice=0;
    double sgst,cgst,subtotal=0.0,discount=0.0;
    char choice='\0';
    System.out.println("\t\t\t\t\t\t\t\t\t------------------------------INVOICE------------------------------");
    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t"+""+"KOLKATA BAZAR");  
    System.out.println("\t\t\t\t\t\t\t\t\t\t"+""+"R-454/1 SUKANTANAGAR SALTLAKE KOLKATA-700098");  
    System.out.println("\t\t\t\t\t\t\t\t\t\t"+""+"OPPOSITE LOHARPOOL AND KISHOR BHARATI METRO");
    System.out.println("GSTIN:5473829090972728929393"+"\t\t\t\t\t\t\t\t Contact:(+91)75849498494");
    // format date and time
    SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
   // Date date=new Date(Quantity);
    Calendar calendar=Calendar.getInstance();
    String[]days=new String[]{"SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY"};
    // print date and time
    System.out.println(java.time.Clock.systemUTC().instant());    
    Scanner ob=new Scanner(System.in);
    System.out.println("ENTER THE COUSTOMER NAME=");
    String COUSTOMER=ob.nextLine();
   List<product>Product=new ArrayList<product>();
  do{
        System.out.println("THE ALL PRODUCT DETAILS");
        System.out.println("Enter the ID");
        id=ob.nextLine();
        System.out.println("Enter the product name=");
        ProductName=ob.nextLine();
        System.out.println("Enter The Quantity");
        Quantity=ob.nextInt();
        System.out.println("Price(PerUnit)=");
        price=ob.nextDouble();
        totalprice=price*Quantity;
        overallprice=totalprice+overallprice;
    Product.add(new product(id, ProductName, choice, overallprice, totalprice));
    System.out.println("ADD MORE ITEM?(YES OR n):");
    choice=ob.next().charAt(0);
    ob.nextLine();
    }
while(choice=='Y'||choice=='y');
product.displayFormat();
for(product p:Product)
{
    p.display();
}
// price calculating
System.out.println("\n\t\t\t\t\t\tTOTAL AMOUNT(RS:)"+overallprice);
discount=overallprice*2/100;
System.out.println("\n\t\t\t\t\t\t\tDiscount="+discount);
subtotal=overallprice-discount;
System.out.println("\n\t\t\t\t\t\t\t\tSubtotal="+subtotal);
// calculating tax
sgst=overallprice*12/100;
System.out.println("\n\t\t\t\t\t\t\t\tSGST:"+sgst);
cgst=overallprice*12/100;
System.out.println("\n\t\t\t\t\t\t\t\tCGST:"+cgst);
System.out.println("\n\t\t\t\t\t\t\t\t\t\t\tINVOICE TOTAL:"+(subtotal+cgst+sgst));
System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");  
System.out.println("\t\t\t\t                     Visit Again");  
ob.close();;

}    
}
