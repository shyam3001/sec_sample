package org.example.dependency;

import org.apache.commons.csv.*;
import java.io.*;
import java.time.*;

public class ExampleDependency {
    public static void exampleMethod() {
        try (CSVPrinter printer = new CSVPrinter(new FileWriter("csv.txt"), CSVFormat.EXCEL)) {
		     printer.printRecord("id", "userName", "firstName", "lastName", "birthday");
		     printer.printRecord(1, "john73", "John", "Doe", LocalDate.of(1973, 9, 15));
		     printer.printRecord(2, "mary", "Mary", "Meyer", LocalDate.of(1985, 3, 29));
		 } catch (IOException ex) {
		     ex.printStackTrace();
		 }
    }
}