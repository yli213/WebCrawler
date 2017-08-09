package webCrawler;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebCrawler crawler = new WebCrawler();
		
		String rootUrl="http://www.bbc.com";
		
		crawler.discoverWeb(rootUrl);

	}

}
