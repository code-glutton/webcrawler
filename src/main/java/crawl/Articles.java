package crawl;

import org.jsoup.nodes.Element;

import java.util.HashSet;
import java.util.LinkedHashMap;

public interface Articles {
    LinkedHashMap<String,String> fetchArticles(HashSet<Element> crawledLinks, String keyword);
}
