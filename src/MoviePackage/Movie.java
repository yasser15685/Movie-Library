package MoviePackage;

public class Movie {
	private String name;
	private String year;
	private String category;
	private String play;
	private String link;
	public Movie(String _name, String _year, String _category, String _play, String _link){
		name = _name;
		year = _year;
		category = _category;
		play = _play;
		link = _link;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPlay() {
		return play;
	}
	public void setPlay(String play) {
		this.play = play;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	

}
