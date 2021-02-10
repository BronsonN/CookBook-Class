package sait.bms.problemDomain;

public class CookBook extends Book{

    private String publisher;
    private String diet;
    
   
  

    public CookBook(String pusblisher, String diet) {
        super();
    }

	public CookBook(long ISBN, String callNumber, int availNumber, int totalNumber, String bookTitle, String publisher,String diet) {
		super(bookTitle, ISBN, callNumber, availNumber, totalNumber);
        this.publisher = publisher;
        this.diet = diet;
        
	}

	public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
    
    public void printBook() {
    	System.out.println("Matching books:");
		System.out.println("ISBN:             " + getISBN());
		System.out.println("Call Number:      " + getCallNumber());
		System.out.println("Available:        " + getAvailabiltyNumber());
		System.out.println("Total:            " + getTotalNumber());
		System.out.println("Title:            " + getBookTitle());
		System.out.println("Publisher:        " + getPublisher());
		System.out.println("Diet:             " + getDiet());
		System.out.println();
    }

    @Override
	public String toString() {
		return getISBN() + ";"  + getCallNumber() + ";" + getAvailabiltyNumber() + ";" +getTotalNumber()+ ";" +getBookTitle()+ ";" +publisher+ ";" +diet;
	}
    
    
}
