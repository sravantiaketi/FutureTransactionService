import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import com.abnamro.springboot.config.InputTransactionProcessor;

public class FutureTransProcessorTest {

	@Test
	public void testGenerateDailySummaryReportValidInput() {
		InputTransactionProcessor rport = new InputTransactionProcessor();
		Path path = Paths.get("./Input.txt");
		boolean thrown = false;
		try {
			rport.generateDailySummaryReport(path,"2010-08-20");
			assertFalse(thrown);
		} catch (Exception e) {
			thrown = true;
			assertFalse(thrown);
		}



	}

	@Test
	public void testGenerateDailySummaryReportInvalidDateException() {
		InputTransactionProcessor rport = new InputTransactionProcessor();
		 Path path = Paths.get("./Input.txt");
		 boolean thrown = false;
		try {
			rport.generateDailySummaryReport(path,"20100820");
		} catch (Exception e) {
			 thrown = true;
			 assertTrue(thrown);
		}
		
		
		
	}
	
	@Test
	public void testGenerateDailySummaryReportInvalidTransactionException() {
		InputTransactionProcessor rport = new InputTransactionProcessor();
		 Path path = Paths.get("./Input_invalidtransactions.txt");
		 boolean thrown = false;
		try {
			rport.generateDailySummaryReport(path,"2010-08-20");
		} catch (Exception e) {
			 thrown = true;
			 assertTrue(thrown);
		}
		
		
		
	}
	
	@Test
	public void testGenerateDailySummaryReportForUnavailableDateException() {
		InputTransactionProcessor rport = new InputTransactionProcessor();
		 Path path = Paths.get("./Input.txt");
		 boolean thrown = false;
		try {
			rport.generateDailySummaryReport(path,"20271220");
		} catch (Exception e) {
			 thrown = true;
			 assertTrue(thrown);
		}
		
		
		
	}
	
	
	@Test
	public void testGenerateDailySummaryReportInvalidFileTypeException() {
		InputTransactionProcessor rport = new InputTransactionProcessor();
		 Path path = Paths.get("/temp/Input.pt");
		 boolean thrown = false;
		try {
			rport.generateDailySummaryReport(path,"201020");
		} catch (Exception e) {
			 thrown = true;
			 assertTrue(thrown);
		}
		
		
		
	}
	
	@Test
	public void testGenerateDailySummaryReportValidDate() {
		InputTransactionProcessor rport = new InputTransactionProcessor();
		 Path path = Paths.get("./Input.txt");
		 boolean thrown = false;
		try {
			rport.generateDailySummaryReport(path,"2010-08-19");
			assertFalse(thrown);
		} catch (Exception e) {
			 thrown = true;
			assertFalse(thrown);
		}
		
		
		
	}

}
