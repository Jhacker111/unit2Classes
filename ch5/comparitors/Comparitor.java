public class Comparitor
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        if(word1.compareTo(word2) == 1){
            System.out.println("woof");
        }
        if(word1.substring(0,3).equals(word2) == false){
            System.out.println("meow");
        }
        if((word1.substring(0,1)).compareTo(word2) == 0){
            System.out.println("other animal sound");
        }
        if((word1.substring(0,3)).equals(word2.substring(0,3))==true){
            System.out.println("oink");
        }
    }
}