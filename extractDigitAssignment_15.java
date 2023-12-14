package Assignment;

public class extractDigitAssignment_15 {
    public static void main(String[] args) {
        String extractText = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk";
        String[] extractDigitFromParagraph = extractText.split(" ");
        String laptopPriceFind = extractDigitFromParagraph[7];
        String mousePriceFind = extractDigitFromParagraph[15];

        int laptopPrice = Integer.parseInt(laptopPriceFind);
        int mousePrice = Integer.parseInt(mousePriceFind);

        int totalCostBeforeDiscount = laptopPrice + mousePrice;
        double discount = 0.15 * totalCostBeforeDiscount;
        double totalCostAfterDiscount = totalCostBeforeDiscount - discount;

        System.out.println("Total cost Without discount :" + totalCostBeforeDiscount);
        System.out.println("Total cost after 15% discount :" + totalCostAfterDiscount);

    }
}
