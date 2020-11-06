public class CEO extends Employee
{
    // $60,000 base salary
    public CEO(){
        setBasicSalary(5500000);
    }
    @Override
    public int getMonthlySalary(){
        return super.getBasicSalary()/MONTHS + 
            super.getBasicSalary()/MONTHS/10;
    }
}