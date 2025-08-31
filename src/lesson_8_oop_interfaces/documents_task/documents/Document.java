package lesson_8_oop_interfaces.documents_task.documents;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public abstract class Document {
    int documentNumber;
    Date documentDate;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public Document(int documentNumber, String documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = dateConverter(documentDate);
    }

    public Date dateConverter(String date) {
        String[] dateArray = date.split("-");
        return new Date( Integer.valueOf(dateArray[0]) - 1900, Integer.valueOf(dateArray[1]) - 1,
                Integer.valueOf(dateArray[2]));
    }
}