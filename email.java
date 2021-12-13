package emilapp;

import java.util.Scanner;

public class email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 40;
    private int DefaultpassLength = 8;
    private String alternateEmail;
    private String comapanySuffix = "abcCompany.com";

    public email(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("email created :" + this.firstname +" "+this.lastname);

        this.department = setdepartment();
        System.out.println("Department: "+this.department);

        this.password = randomPassword(DefaultpassLength);
        System.out.println("Your password is: "+ this.password);

        email = firstname.toLowerCase() + "." + lastname +"@"+department+"."+comapanySuffix;
        System.out.println("Your Email is: "+ email);
    }

    private String setdepartment(){
        System.out.println("Enter the department\n1: Sale\n2: Development\n3: Accounting\n0: none");
        Scanner in  = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1){return "Sale";}
         else if(depChoice == 2){
             return "Devp";
         }else if(depChoice == 3){
             return "Accon";
         }else{ return "";}
    }

    private String randomPassword(int length){
        String passwordSet ="QWERTYUIOPASDFGHJKLZXCVBNM23@!%#*$890";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int randVal = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randVal);
        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String alEmail){
        this.alternateEmail = alEmail;
    }

    public void changepassword(String password){
        this.password = password;
    }

    public int mailBoxCapacity(){ return mailboxCapacity;}
    public String getAlternateEmail(){ return alternateEmail;}
    public String getPassword(){return password;}
    public String ShowInfo(){
        return " Your Name: " + firstname+" "+lastname+ 
                 "\ncompany Email: " + email +
                 "\nMailBox Capacity : "+mailboxCapacity;
    }
}
