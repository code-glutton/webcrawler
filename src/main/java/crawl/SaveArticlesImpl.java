package crawl;

import org.jsoup.nodes.Element;

import java.util.HashSet;

public class SaveArticlesImpl implements SaveArticles{

    @Override
    public void writeToFile(HashSet<Element> element) {
        System.out.println(element);
    }
}
