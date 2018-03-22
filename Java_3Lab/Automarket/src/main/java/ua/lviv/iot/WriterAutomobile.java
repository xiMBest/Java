package ua.lviv.iot;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class WriterAutomobile {


    public final void writeToFile(final List<Automobile> automobiles) {
        try (PrintWriter writer = new PrintWriter("AutomobileStaff.csv")) {

            for (Automobile automobile : automobiles) {
                writer.println(automobile.getHeaders());
                writer.println(automobile.toCSV());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
