public class Runner
{
    public static void main(String[]args){
        Super[] heroes = new Super[6];
        
        heroes[0] = new DC();
        heroes[0].setName("Nightwing");
        heroes[0].setPower("Acrobat");
        
        heroes[1] = new DC();
        heroes[1].setName("Superman");
        heroes[1].setPower(1);
        
        heroes[2] = new DC();
        heroes[2].setName("Wonder Woman");
        heroes[2].setPower(1);
        
        heroes[3] = new Marvel();
        heroes[3].setName("Thor");
        heroes[3].setPower("God");
        
        heroes[4] = new Marvel();
        heroes[4].setName("Iron Man");
        heroes[4].setPower("Suit");
        
        heroes[5] = new Marvel();
        heroes[5].setName("Hawkeye");
        heroes[5].setPower("Archer");
        
        for(int i = 0; i < heroes.length; i++){   
            System.out.println(heroes[i]);
        }
    }
}
