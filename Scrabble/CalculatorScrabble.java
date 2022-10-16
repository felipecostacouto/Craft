import java.util.Map;
import java.util.HashMap;

public class CalculatorScrabble{

    public static int result(String word){
        Map<Character,Integer> points = new HashMap<Character,Integer>();
            points.put('E',1);
            points.put('A',1);
            points.put('O',1);
            points.put('R',1);
            points.put('T',1);
            points.put('L',1);
            points.put('S',1);
            points.put('D',2);
            points.put('G',2);
            points.put('B',3);
            points.put('C',3);
            points.put('M',3);
            points.put('P',3);
            points.put('U',3);
            points.put('F',4);
            points.put('H',4);
            points.put('V',4);
            points.put('W',4);
            points.put('Y',4);
            points.put('I',5);
            points.put('K',5);
            points.put('N',5);
            points.put('J',8);
            points.put('X',8);
            points.put('Q',10);
            points.put('Z',10);

        int sum = 0;

        String upperWord = word.toUpperCase();

        for(int i= 0; i < upperWord.length(); i++){
            if(!points.containsKey(upperWord.charAt(i))){
                System.out.println("Input contains elements that's it's not on the Map, therefore the sum will be zero:");
                sum = 0;
                break;

            }
            else{
              sum += points.get(upperWord.charAt(i));
            }
        }
        return sum;
    }
}
