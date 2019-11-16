public class challenge{
    public static void main (String[] args){
        String words[] = new String[] {"Hello", "World", "in", "a", "frame","challenge","humza","pneumonoultramicroscopicsilicovolcanoconiosis"};
        int longest_word = words[0].length();
        for(int i=1;i<words.length;i++){
            if(words[i].length()>longest_word){
                longest_word = words[i].length();
            }
        }
        //System.out.println(longest_word);
        printStars(longest_word + 2);
        
        for(int i=0;i<words.length;i++){
        ///printStars();
            System.out.print("*");
            System.out.print(words[i]);
            int difference = longest_word-words[i].length();
            for(int j=0;j<difference;j++){
            System.out.print(" ");
            }
            System.out.println("*");
            ;
        }
        printStars(longest_word + 2);
    
    }

    public static void printStars(int longest_word){
        for(int i =0;i<longest_word;i++){
            System.out.print("*");
        }
        System.out.println();       
    }
}
