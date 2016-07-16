import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: svejella
 * Date: 7/9/16
 * Time: 12:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class SortingProblemsTestNew {

    SortingProblems sortingProblems = new SortingProblems();

    @Test(groups = {"smoke","regression"})
    public void testBubbleSort()
    {
        int[] sorted = {2,5,7,9};
        int[] unsorted = {7,5,2,9};

        Assert.assertEquals(sorted,sortingProblems.bubbleSort(unsorted));
    }
}
