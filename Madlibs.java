import java.util.Scanner;
public class Madlibs{
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
       
        String madlib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        madlib = "when <name> was <ingVerb> very fast he found a <noun>.";

        madlib.indexOf("<noun>");
        madlib.indexOf("<plural noun>");
        madlib.indexOf("<number>"); //first mad lib
        madlib.indexOf("<adjective>");
        madlib.indexOf("<noun>");
        madlib.indexOf("<adverb>");//second madlib
        madlib.indexOf("<name>");
        madlib.indexOf("<ningVerb>");
        madlib.indexOf("<noun>");//third noun

        System.out.println("Enter a "+ madlib.indexOf+":");
        String input = sc.nextLine();

    }


}

//story idea  when #name was #ingVerb1 very fast he found a #noun1 wich was #adjective1. Ater such #adjective2 discovery he went back to #place1 to #verb2 a #noun2.
// 

//