public class Supervisor extends Employee
{
    // $60,000 base salary
    public Supervisor(){
        setBasicSalary(60000);
    }
    @Override
    public int getMonthlySalary(){
        return super.getBasicSalary()/MONTHS + 
            super.getBasicSalary()/MONTHS/10;
    }
}
