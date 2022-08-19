package labExercises.lab2;

import java.sql.Date;

abstract class Item{
	private int uniqueIdentificationNumber;
	private String title;
	private int numberOfCopies;
	Date checkIn;
	Date checkOut;
	public Item() {}
	public Item(int uniqueIdentificationNumber, String title, int numberOfCopies) {
		super();
		this.uniqueIdentificationNumber = uniqueIdentificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	public int getUniqueIdentificationNumber() {
		return uniqueIdentificationNumber;
	}
	public void setUniqueIdentificationNumber(int uniqueIdentificationNumber) {
		this.uniqueIdentificationNumber = uniqueIdentificationNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	@Override
	public abstract boolean equals(Object obj);
	@Override
	public abstract String toString(); 
	public abstract void checkIn(Date checkIn);
	public abstract void checkOut(Date checkOut);
	public abstract void addItem();	
}

class WrittenItem extends Item{
	private String author;
	
	public WrittenItem() {
		super();
	}
	public WrittenItem(int uniqueIdentificationNumber, String title, int numberOfCopies, String author) {
		super(uniqueIdentificationNumber, title, numberOfCopies);
		this.author = author;
	}
	@Override
	public boolean equals(Object item) {
		if(item==this) {
			return true;
		}
		if(!(item instanceof WrittenItem)) {
			return false;
		}
		WrittenItem item2 = (WrittenItem) item;
		if(this.getUniqueIdentificationNumber()==item2.getUniqueIdentificationNumber()) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "WrittenItem [getUniqueIdentificationNumber()=" + getUniqueIdentificationNumber()
				+ ", Title=" + getTitle() + ", Number of copies=" + getNumberOfCopies() +", Author=" + author + "]";
	}
	@Override
	public void checkIn(Date checkIn) {
		this.checkIn=checkIn;	
	}
	@Override
	public void checkOut(Date checkOut) {
		this.checkOut=checkOut;	
	}
	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		
	}
}

class Book extends WrittenItem{
	public Book(int uniqueIdentificationNumber, String title, int numberOfCopies, String author) {
		super(uniqueIdentificationNumber, title, numberOfCopies, author);
	}
}

class JournalPaper extends WrittenItem{
	private int yearPublished;
	public JournalPaper(int uniqueIdentificationNumber, String title, int numberOfCopies, String author,
			int yearPublished) {
		super(uniqueIdentificationNumber, title, numberOfCopies, author);
		this.yearPublished = yearPublished;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", checkIn=" + checkIn + ", checkOut=" + checkOut
				+ ", UniqueIdentificationNumber()=" + getUniqueIdentificationNumber() + ", Title()=" + getTitle()
				+ ", NumberOfCopies()=" + getNumberOfCopies() + "]";
	}
}

class MediaItem extends Item{
	private int runtime;

	public MediaItem(int uniqueIdentificationNumber, String title, int numberOfCopies, int runtime) {
		super(uniqueIdentificationNumber, title, numberOfCopies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public boolean equals(Object item) {
		if(item==this) {
			return true;
		}
		if(!(item instanceof MediaItem)) {
			return false;
		}
		MediaItem item2 = (MediaItem) item;
		if(this.getUniqueIdentificationNumber()==item2.getUniqueIdentificationNumber()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + ", UniqueIdentificationNumber=" + getUniqueIdentificationNumber()
				+ ", Title=" + getTitle() + ", NumberOfCopies=" + getNumberOfCopies() + "]";
	}

	@Override
	public void checkIn(Date checkIn) {
		this.checkIn=checkIn;	
	}
	@Override
	public void checkOut(Date checkOut) {
		this.checkOut=checkOut;	
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		
	}
	
}

class Video extends MediaItem{
	private String director;
	private String genre;
	private int yearReleased;
	public Video(int uniqueIdentificationNumber, String title, int numberOfCopies, int runtime, String director,
			String genre, int yearReleased) {
		super(uniqueIdentificationNumber, title, numberOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased
				+ ", UniqueIdentificationNumber=" + getUniqueIdentificationNumber() + ", Title=" + getTitle()
				+ ", NumberOfCopies=" + getNumberOfCopies() + "]";
	}
	
}

class CD extends MediaItem{
	private String artist;
	private String genre;
	public CD(int uniqueIdentificationNumber, String title, int numberOfCopies, int runtime, String artist,
			String genre) {
		super(uniqueIdentificationNumber, title, numberOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", UniqueIdentificationNumber="
				+ getUniqueIdentificationNumber() + ", Title=" + getTitle() + ", NumberOfCopies="
				+ getNumberOfCopies() + "]";
	}
	
}

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
