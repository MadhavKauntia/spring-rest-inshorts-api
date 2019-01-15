# Spring REST Inshorts API
An Inshorts API which provides news of different categories from the official website. Built using Spring REST and JSoup.

# Categories
This API supports all the categories on the Inshorts website.
* '' (leave blank for top news from all categories)
* business
* sports
* world
* politics
* technology
* startup
* entertainment
* miscellaneous
* hatke (unconventional news)
* science
* automobile

# Instructions to run
1. Clone the repository into your local computer.
2. Import the project as a Maven project in an IDE of your choice (Eg - Eclipse, IntelliJ, etc.)
3. Run the project on a server of your choice (Eg - Tomcat, Jetty, etc) or deploy the project by creating a .war file.
4. Once the webapp is up and running, make a GET Request to the given web address:
```
https://www.{your_website}.com/news/<category_name>
```
Example - localhost:8080/spring-rest-inshorts-api/news/entertainment

# Response Format
```JSON
[
    {
        "title": "Friend kept quiet about harassment since she had 7 siblings: Sonam",
        "imageUrl": "https://assets.inshorts.com/inshorts/images/v1/variants/jpg/s/2019/01_jan/13_sun/img_1547394818675_498.jpg?resize=400px:*",
        "url": "https://www.inshorts.com/en/news/friend-kept-quiet-about-harassment-since-she-had-7-siblings-sonam-1547448905720",
        "content": "Sonam Kapoor, while speaking about a friend of hers who faced sexual harassment in the film industry, revealed the latter kept quiet about it as she had seven siblings to look after. \"She was like I don't want to be known as a victim for the rest of my life...I don't want that to be what defines me,\" Sonam added.",
        "author": "Daisy Mowke",
        "date": "14 Jan",
        "time": "12:25 pm",
        "readMoreUrl": "https://www.pinkvilla.com/entertainment/interviews/sonam-k-ahuja-reveals-how-one-her-friends-kept-quiet-about-sexual-harassment-because-she-had-seven?utm_campaign=fullarticle&utm_medium=referral&utm_source=inshorts "
    },
    {
        "title": "Hirani is man of integrity: Sharman on sexual harassment row",
        "imageUrl": "https://assets.inshorts.com/inshorts/images/v1/variants/jpg/s/2019/01_jan/15_tue/img_1547531525687_670.jpg?resize=400px:*",
        "url": "https://www.inshorts.com/en/news/rajkumar-hirani-is-a-man-of-immense-integrity-sharman-joshi-1547524421899",
        "content": "Reacting to the sexual harassment allegations against filmmaker Rajkumar Hirani, Sharman Joshi tweeted, \"Raju sir is a man of immense integrity, character, honour, compassion and truthfulness, all the virtues one would imagine are non-existent in people today.\" \"I can imagine how demeaning it might be to even stand up for yourself in a situation such as this #IStandForRajuHirani,\" Sharman added.",
        "author": "Deepshikha Yadav",
        "date": "15 Jan",
        "time": "09:23 am",
        "readMoreUrl": "https://www.hindustantimes.com/bollywood/sharman-joshi-supports-rajkumar-hirani-after-sexual-assault-allegations-calls-him-a-man-of-integrity/story-3XqeE6Cfv4tNYPNUkwRKrK.html?utm_campaign=fullarticle&utm_medium=referral&utm_source=inshorts "
    }
]
```
If an invalid category is entered, then a JSON with the error message is returned.
```JSON
{
    "status": 404,
    "message": "News category not available - invalid_category",
    "timestamp": 1547540402468
}
```