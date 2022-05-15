package crawl;

import org.jsoup.nodes.Element;

import java.util.HashSet;

public interface SaveArticles {
void writeToFile(HashSet<Element> element);
}
