package crawl;

import org.jsoup.nodes.Element;

import java.util.HashSet;
import java.util.LinkedHashMap;

public interface Provider {
    LinkedHashMap<String,String> provideCrawlFunct(String keyword, HashSet<Element> linkItems, String url,int depth);
}
