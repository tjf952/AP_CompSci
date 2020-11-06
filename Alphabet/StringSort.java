public class StringSort
{
    public static void sorter(String[] strs){
        for(int i = 0; i < strs.length; i++){
            for(int j = i + 1; j < strs.length; ++j){
                String x = strs[i];
                String y = strs[j];
                x = noVowel(x);
                y = noVowel(y);
                if(x.compareTo(y) > 0){
                    String newString = strs[j];
                    strs[j] = strs[i];
                    strs[i] = newString;
                }
            }
        }
    }
    public static String noVowel(String str){
        str = str.toLowerCase();
        str = str.replaceAll("a", "");
        str = str.replaceAll("e", "");
        str = str.replaceAll("i", "");
        str = str.replaceAll("o", "");
        str = str.replaceAll("u", "");
        return str;
    }
    public static void main(String[]args){
        String[] strings = {"Pikachu", "Charmander", "Squirtle", "Bulbasaur",
            "Pidgeot", "Arbok", "Nidoking", "Arcanine", "Alakazam", "Mew", "Onix", "Snorlax"};
        System.out.println("Before sort: ");
        for(String x: strings){
            System.out.print(x + "; ");
        }
        System.out.println("\nAfter sort: ");
        sorter(strings);
        for(String x: strings){
            System.out.print(x + "; ");
        }
    }
}
