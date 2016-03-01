package team6;

public class Display {
	private String isbn;
	private String bname;
	private String aname;
	private String genre;
	public Display(String isbn,  String aname,String bname, String genre) {
		super();
		this.isbn = isbn;
		this.bname = bname;
		this.aname = aname;
		this.genre = genre;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	

}
