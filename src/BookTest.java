public class BookTest {
    public static void main(String[] args) {

        Book firstBook = new Book("Exciting new recipes for people who want something quick an easy",52);
        Book secondBook = new Book("The big catalogue of all green animals ever existed", 55);

        boolean isRepeatingSummary = firstBook.isRepeatingSummary(firstBook.getSummary());
        if (isRepeatingSummary) {
            System.out.println("First Book has Repeating Summary");
        }else{
            System.out.println("First Book doesn't have Repeating Summary");
        }

        isRepeatingSummary = secondBook.isRepeatingSummary(secondBook.getSummary());
        if (isRepeatingSummary) {
            System.out.println("Second Book has Repeating Summary");
        }else{
            System.out.println("Second Book doesn't have Repeating Summary");
        }

        System.out.print("For the First Book you must read pages: " );
        firstBook.showPagesToRead(firstBook.getNumberOfPages());
        System.out.println();
        System.out.print("For the Second Book you must read pages: " );
        secondBook.showPagesToRead(secondBook.getNumberOfPages());
    }
}