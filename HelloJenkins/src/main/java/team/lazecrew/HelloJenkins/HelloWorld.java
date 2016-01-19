package team.lazecrew.HelloJenkins;

import static spark.Spark.*;

public class HelloWorld {

	public static void main(String[] args) {
		port(8090);
		staticFileLocation("/public/source");
		
		get("/hello", (req, res) -> {
			return "merong";
		});
	}
	
}
