package com.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entitiy.News;

@RestController
@RequestMapping("/news")
public class NewsRestController {

	List<News> theNews;
	
	public void getTheNews(String category) {
		
		theNews = new ArrayList<>();
		
		try {
			
			Document doc = Jsoup.connect("https://www.inshorts.com/en/read/" + category).userAgent("Mozilla/17.0").get();
			Elements newsCards = doc.select("div.news-card");
			for(Element newsCard : newsCards) {
				
				// Extracting the title of the card 
				String title = newsCard.select("div.news-card-title").select("a").text();
				title = title.substring(0, title.length()-6);
				
				// Extracting the image url
				String imageUrl = newsCard.select("div.news-card-image").attr("style").split("'")[1];
				
				// Extracting the url
				String url = "https://www.inshorts.com" + newsCard.select("div.news-card-title").select("a").attr("href");
				
				// Extracting the content
				String content = newsCard.select("div.news-card-content").select("div").text().split(". short by")[0] + ".";
				
				// Extracting the author
				String author = newsCard.selectFirst("div.news-card-author-time").select("span.author").text();
				
				// Extracting the date
				String date = newsCard.selectFirst("div.news-card-content").select("span.date").text();
				
				// Extracting the time
				String time = newsCard.selectFirst("div.news-card-content").select("span.time").text();
				
				// Extracting the read more url
				String readMoreUrl = newsCard.select("div.read-more").select("a").attr("href");
				
				News news = new News(title, imageUrl, url, content, author, date, time, readMoreUrl);
				theNews.add(news);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	@GetMapping("")
	public List<News> returnTopNews() {
		getTheNews("");
		return theNews;
	}
	
	@GetMapping("/{category}")
	public List<News> returnCategoryNews(@PathVariable String category) {
		getTheNews(category);
		if(theNews.isEmpty()) {
			throw new InvalidCategoryException("News category not available - " + category);
		}
		return theNews;
	}

}
