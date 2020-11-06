public class AbstractRunner
{
    public static void main(String[]args){
        Employee[] Staff = new Employee[10];
        
        Staff[0] = new Cashier();
        Staff[0].setName("Thomas Finn");
        Staff[0].setAddress("Forest Lawn");
        
        Staff[1] = new Cashier();
        Staff[1].setName("Floyd McDonald");
        Staff[1].setAddress("Indian Rock");
        
        Staff[2] = new Cashier();
        Staff[2].setName("Casey Benzaken");
        Staff[2].setAddress("Lincoln");
        
        Staff[3] = new Cashier();
        Staff[3].setName("Natalie Skigen");
        Staff[3].setAddress("Huntingtin Ridge");
        
        Staff[4] = new Cashier();
        Staff[4].setName("Ashley Berland");
        Staff[4].setAddress("Washington");
        
        Staff[5] = new Cashier();
        Staff[5].setName("Jesse DeLuca");
        Staff[5].setAddress("Blueberry Hill");
        
        Staff[6] = new CEO();
        Staff[6].setName("Austin Nardi");
        Staff[6].setAddress("Westover");
        
        Staff[7] = new Cashier();
        Staff[7].setName("Brandon DeLeon");
        Staff[7].setAddress("Wishington");
       
        Staff[8] = new Supervisor();
        Staff[8].setName("Mr.Sarkar");
        Staff[8].setAddress("Westhill");
        
        Staff[9] = new Supervisor();
        Staff[9].setName("Mrs.Dodita");
        Staff[9].setAddress("Westhill");
      
        for(int i = 0; i < Staff.length; i++){     
            System.out.println(Staff[i]);
        }
    }
}
