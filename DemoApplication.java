package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println(CalculatePoints.points);
		System.out.println("hello");
		System.out.println("hello");
		SpringApplication.run(DemoApplication.class, args);
	}
  public int CalculatePoints(String args[])
  {
	  
	  
	  int purchaseamt =Integer.parseInt(args[0]);
	int   amt =(purchaseamt-100)*20;
	int amt1=(purchaseamt-50)*10;
	return (amt1+amt2);
	  
  }
}
