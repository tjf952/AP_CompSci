public abstract class Super implements Hero
{
    private String name, comic, power;
    
    public String getName(){
        return name;
    }
    public String getComic(){
        return comic;
    }
    public String getPower(){
        return power;
    }
    
    public void setName(String myName){
        name = myName;
    }
    public void setComic(String myComic){
        comic = myComic;
    }
    public void setPower(String myPower){
        power = myPower;
    }
    public void setPower(int any){
        power = "ALL";
    }
    
    public String toString(){
        return "Name: " + name + "\nComic: " +
            comic + "\nPower: " + power + "\n";
    }
}
