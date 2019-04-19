package za.ac.cputweek;

import java.util.ArrayList;
import java.util.List;

public class MainDriver {
    public static  void main(String[] args)
    {
        TwoElement two1 =new TwoElement(3,3);
        TwoElement two2 =new TwoElement(2,7);
        ThreeElement three1 =new ThreeElement(3,4,5);

        List<NumberElement> numberElements =new ArrayList<NumberElement>();

        numberElements.add(two1);
        numberElements.add(two2);
        numberElements.add(three1);

        System.out.println("Visiting element list with SumVisitor");
        NumberVisitor sumVisitor =new SumVisitor();
        sumVisitor.visit(numberElements);

        System.out.println("\n Visiting element list TotalSum visitor");
        TotalSumVisitor totalSumVisitor=new TotalSumVisitor();
        totalSumVisitor.visit(numberElements);
        System.out.println("Total Sum: "+totalSumVisitor.getTotalSum());


    }

}
