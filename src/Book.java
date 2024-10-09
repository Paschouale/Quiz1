public class Book {

    private String summary;
    private int numberOfPages;

    public Book(String summary, int numberOfPages) {
        this.summary = summary;
        this.numberOfPages = numberOfPages;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isRepeatingSummary(String summary){
        int doubleChar = Utilities.getFirstRepeatedCharacter(summary);
        if (doubleChar == -1){
            return false;
        }else {
            return true;
        }
    }

    public void showPagesToRead(int numberOfPages){
        int middlePage = numberOfPages / 2;
        Utilities.goDownToOne(middlePage);
    }

}
