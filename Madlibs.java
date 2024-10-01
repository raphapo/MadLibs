import java.util.Scanner;
public class Madlibs{
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
       
        String madlib1 = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";

        //first word
        int bracketStart1 = madlib1.indexOf("<");
        int bracketEnd1 = madlib1.indexOf(">");
        String sub1 = madlib1.substring(bracketStart1+1, bracketEnd1);
    
        System.out.println("Enter a "+ sub1+":");//ask user to enter a [word]
        String input1 = sc.nextLine();
        madlib1 = madlib1.replaceFirst("<"+sub1+">",input1);//replace <....> by user word

        //second word
        int bracketStart2 = madlib1.indexOf("<");
        int bracketEnd2 = madlib1.indexOf(">");
        String sub2 = madlib1.substring(bracketStart2+1, bracketEnd2);
    
        System.out.println("Enter a "+ sub2+":");//ask user to enter a [word]
        String input2 = sc.nextLine();
        madlib1 = madlib1.replaceFirst("<"+sub2+">",input2);//replace <....> by user word

        //third word
        int bracketStart3 = madlib1.indexOf("<");
        int bracketEnd3 = madlib1.indexOf(">");
        String sub3 = madlib1.substring(bracketStart3+1, bracketEnd3); 
    
        System.out.println("Enter a "+ sub3+":"); //ask user to enter a [word]
        String input3 = sc.nextLine();
        madlib1 = madlib1.replaceFirst("<"+sub3+">",input3);//replace <...> by user word

        System.out.println(madlib1);

    }


}

//story idea  when #name was #ingVerb1 very fast he found a #noun1 wich was #adjective1. Ater such #adjective2 discovery he went back to #place1 to #verb2 a #noun2.
// 

//