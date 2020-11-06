public abstract class Employee
{
    private String name, address;
    private int basicSalary;
    public  final int MONTHS = 12;
    public  abstract int getMonthlySalary();
    public String getName(){
        return name;
    }
    public void setName(String myName){
        name = myName;
    }
    public String getAddress(){ 
        return address; 
    }
    public void setAddress(String myAddress){ 
        address = myAddress;
    }
    public int getBasicSalary(){ 
        return basicSalary; 
    }
    public void setBasicSalary(int  mySalary){
        basicSalary = mySalary; 
    }
    public String toString(){
        return "Name: " + getName() + "\nAddress: " + getAddress() + "\nBasic Salary: $" + 
                getBasicSalary() + "\nMontly Salary: $" + getMonthlySalary() + "\n";
    }
}
