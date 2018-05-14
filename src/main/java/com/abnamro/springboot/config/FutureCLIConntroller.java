package com.abnamro.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class FutureCLIConntroller implements CommandLineRunner{
	@Autowired
	private InputTransactionProcessor proc;
	public FutureCLIConntroller() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) throws Exception{
		
		try {		
			//disabled banner, don't want to see the spring logo
	        SpringApplication app = new SpringApplication(FutureCLIConntroller.class);
	        app.setBannerMode(Banner.Mode.OFF);
	        app.run(args);
				
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}        
	}
	@Override
    public void run(String... args) throws Exception {

		try{
        if (args.length > 0) {
            proc.generateDailySummaryReport(args[0].toString(),args[1].toString());
            System.out.println("Output generated at /temp/"+args[1].toString()+".csv");
        } 
        }
		catch(Exception e) {
            e.printStackTrace();
            throw e;
        }

        
    }

}
