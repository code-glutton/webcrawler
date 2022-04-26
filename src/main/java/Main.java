import crawl.*;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            HashSet<Element> linkItems = new HashSet<>();
            String url = "https://designmodo.com/jobs/";
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Please enter keyword");
//            String keyword = sc.nextLine();
//            System.out.println("Please enter depth");
//            int depth = sc.nextInt();
            Crawl crawling = new CrawlImpl();
            crawling.crawl(linkItems,8,url);
//            crawling.crawl(crawling.connect());
//            Articles articles = new ArticlesImpl();
//            articles.fetchArticles(crawling.crawl(crawling.connect()),keyword);


        }catch(Exception ex){
            System.out.println("failed");
        }
    }
}
