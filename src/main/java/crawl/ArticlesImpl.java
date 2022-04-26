package crawl;

import org.jsoup.nodes.Element;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ArticlesImpl implements Articles{
    @Override
    public LinkedHashMap<String,String> fetchArticles(HashSet<Element> crawledLinks,String keyword) {
        LinkedHashMap<String,String> articles = new LinkedHashMap();
        crawledLinks.stream().forEach(element -> {
            if(element.text().contains(keyword)){
                articles.put(element.text(),element.attr("abs:href"));
            }
        });
        System.out.println(articles);
        return articles;
    }
}
