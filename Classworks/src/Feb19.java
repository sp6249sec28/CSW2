import java.util.Scanner;

    class Account {
        private int accNum;
        private String accName;
        private double Bal;
    
        public Account(int accNum, String accName, double initialBal){
            this.accNum = accNum;
            this.accName = accName;
            this.Bal = initialBal;
        }
        public double getBal(){
            return Bal;
        }
        public void setBal(double newBal){
            if(newBal >= 0)
                this.Bal = newBal;
            else{
                System.out.println("Invalid balance");
            }
        }
    
        public void deposit(double amount){
            if(amount >= 0){
                setBal(getBal() + amount);
                System.out.println("New Balance : " + getBal());
            }
            else{
                System.out.println("Invalid Balance. Balance can't be negative");
            }
        }
        public void withdrawal(double amount){
            if(amount>=0 && amount<=getBal()){
                setBal(getBal() - amount);
                System.out.println("Remaining Balance : " + getBal());
            }
            else if(amount < 0){
                System.out.println("Invalid Balance. Balance can't be negative");
            }
            else{
                System.out.println("Insufficient Balance!! ");
            }
        } 
    }

    public class Feb19{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter account number : ");
            int accNum = sc.nextInt();
            System.out.println("Enter Account Holder Name :");
            String accName = sc.next();
            System.out.println("Enter Account Balance : ");
            double initialBal = sc.nextDouble();
    
            Account account = new Account(accNum, accName, initialBal);
            
            System.out.println("\nMenu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            while(choice != 4) {
                switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit : ");
                    double depAmount = sc.nextDouble();
                    account.deposit(depAmount);
                    break;
                case 2:
                    account.withdrawal(account.getBal());
                    break;
                case 3:
                    account.getBal();
                    break;
                }
            }
        }
    }
