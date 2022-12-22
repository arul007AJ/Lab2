import java.util.*;
class Bankinginfo{
        String acc_name;
                                int password;
                                String yourname;
                                int yourpassword;
                                Bankinginfo(String acc_name,int password)
                                {
                                   this.acc_name=acc_name;
                                   this.password=password;
                                   Scanner in=new Scanner(System.in);
                                   System.out.println("Enter name : ");
                                   yourname=in.nextLine();
                                   System.out.println("Enter password : ");
                                   yourpassword=in.nextInt();
                                }
                                void loginchecking()
                                {
                                   if(acc_name.equals(yourname) && password==yourpassword)
                                   {
                                     Balance b=new Balance();
             b.acc_balance(5);
           }
                                   else
                                   {
                                      System.out.println("wrong details");
                                   }
        }
        private class Balance{
            void acc_balance(int interest)
                                                {
                                                   int balance=200000;
                                                   float f=((float)interest/100)*balance;
                                                   System.out.println("Account balance is : "+(f+balance));
                                                }
                                }
}
class Banking{
    public static void main(String... args)
                {
                   Bankinginfo b=new Bankinginfo("Birds",262626);
                   b.loginchecking();
                }
}