package crawl;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class CrawlImpl extends Thread implements Crawl{
    private String first_link;
    private Thread thread;

    public CrawlImpl(String link) {
        this.first_link = link;

    }

    @Override
    public void run() {
        try {
            crawl(3,first_link);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private HashSet<Element> linkItems = new HashSet<>();

    @Override
    public Document connect(String url) throws IOException {
        try {
            Connection con = Jsoup.connect(url);
            Document doc = con.get();
            if (con.response().statusCode() == 200){
                System.out.println(doc.title());
                return doc;
            }
        }catch(Exception ex){
            System.out.println("fuck");
        }
        return null;
    }

    @Override
    public HashSet<Element> crawl(int depth,String url) throws Exception {

        if(depth != 1){
            Document document = connect(url);
            if(!Objects.isNull(document)){
                for(Element element : document.select("a[href]")){
                    String link = element.absUrl("href");
                    if(!linkItems.contains(link)){
                        linkItems.add(element);
                        int deep = depth - 1;
                        System.out.println(link + " " + deep);
                        System.out.println();
                        crawl(deep,link);
                    }
                }
            }
        }

        System.out.println("sucker"+depth);

        return linkItems;
    }
}
