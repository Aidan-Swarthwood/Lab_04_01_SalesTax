public class Main {
    public static void main(String[] args) {
        //Given the price of a purchase the program computes and outputs a 5% sales tax.
        //    Be sure to use output statements that clearly display the price and the computed sales tax.
        //    (No conditions here, the sales tax is always the same rate.)

        double itemCost = 23;
        double doubleTax = 0;

        doubleTax = itemCost * .05;
        double finalCost = doubleTax + itemCost;
        System.out.println("The item with tax is: " + finalCost + " and the tax on the item was: " + doubleTax);

    }
}