package za.ac.cputweek;

import java.util.List;

public class TotalSumVisitor implements NumberVisitor {

    int totalSum =0;

    @Override
    public void visit(TwoElement twoElement) {
        int sum= twoElement.a + twoElement.b;
        System.out.println("Adding"+twoElement.a+"+"+twoElement.b+"="+sum+"total");
        totalSum +=sum;
    }

    @Override
    public void visit(ThreeElement threeElement) {
        int sum= threeElement.a + threeElement.b+threeElement.c;
        System.out.println("Adding"+threeElement.a+"+"+threeElement.b+"+"+threeElement.c+   "="+sum+"total");
        totalSum +=sum;

    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for(NumberElement ne: elementList)
        {
            ne.accept(this);
        }
    }

    public int getTotalSum() {
        return totalSum;
    }
}
