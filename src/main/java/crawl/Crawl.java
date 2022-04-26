package crawl;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.HashSet;

public interface Crawl {
    Document connect(String url) throws IOException;
    String crawl(HashSet<Element> linkItems,int depth,String url) throws Exception;

}
