package com.springdemo.entitiy;

public class News {

	private String title;
	private String imageUrl;
	private String url;
	private String content;
	private String author;
	private String date;
	private String time;
	private String readMoreUrl;

	public News() {

	}

	public News(String title, String imageUrl, String url, String content, String author, String date, String time,
			String readMoreUrl) {
		this.title = title;
		this.imageUrl = imageUrl;
		this.url = url;
		this.content = content;
		this.author = author;
		this.date = date;
		this.time = time;
		this.readMoreUrl = readMoreUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getReadMoreUrl() {
		return readMoreUrl;
	}

	public void setReadMoreUrl(String readMoreUrl) {
		this.readMoreUrl = readMoreUrl;
	}

	@Override
	public String toString() {
		return "News [title=" + title + ", imageUrl=" + imageUrl + ", url=" + url + ", content=" + content + ", author="
				+ author + ", date=" + date + ", time=" + time + ", readMoreUrl=" + readMoreUrl + "]";
	}

}
