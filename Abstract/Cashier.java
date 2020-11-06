public class Cashier extends Employee
{
    // $30,000 base salary
    public Cashier(){
        setBasicSalary(30000);
    }
    @Override
    public int getMonthlySalary(){
        return super.getBasicSalary()/MONTHS;
    }
}
