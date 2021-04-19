package lesson5.bookabstract;

public  abstract class Book {
	private String title;
	private String authour;
	private double price;
	public  Book(String title, String authour, double price ){
		this.title = title;
		this.authour = authour;
		this.price =price;
	}
	/*public Book(){
		
	}*/
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", authour=" + authour + ", price=" + price + "]";
	}
	abstract  void read();
	abstract public void turning();
}
