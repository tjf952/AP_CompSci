public class DC extends Super
{
    public DC(){
        setComic("Justice League");
    }
    @Override
    public String toString(){
        return "DC!\nName: " + getName() + "\nComic: " +
            getComic() + "\nPower: " + getPower() + "\n";
        }
}
