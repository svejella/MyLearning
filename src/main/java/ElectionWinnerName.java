import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: svejella
 * Date: 7/11/16
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class ElectionWinnerName {

    public static String electionWinner(String[] names)
    {
        HashMap<String,Integer> ballotBox = new HashMap<String, Integer>();
        for(String name:names)
        {
            if(ballotBox.containsKey(name))
            {
                ballotBox.put(name, ballotBox.get(name) + 1);
            }
            else
                ballotBox.put(name,1);

        }
        int max = 0;
        for (Integer value:ballotBox.values())
        {
            if (value > max)
            {
            max = value;
            }
         }

        ArrayList<String> winners = new ArrayList<String>();
        for(String winner:ballotBox.keySet())
        {
            if (ballotBox.get(winner) == max)
            {
                winners.add(winner);

            }
        }

        if(winners.size() == 1)
        {
            return winners.get(0);
        }

        Collections.sort(winners);
        return winners.get(winners.size()-1);
    }

    public static void main (String[] args)
    {
         String[] nameList1 = {"Ajay", "Michael", "Hari", "Heraldo", "Michael", "Vivek", "Hari", "Ajay", "Mary", "Mary"};

         String[] nameList2 = {"Vivek", "Vishal", "Ronaldo" ,"Heraldo", "Maria", "Maria", "Farah", "Farah", "Ronaldo", "Vivek"};

         String winner = electionWinner(nameList2);
        System.out.println("Winner is " + winner);
    }

}
