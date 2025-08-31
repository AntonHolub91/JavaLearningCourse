package lesson_8_oop_interfaces.hw_task_3_documents.documents;

import java.text.SimpleDateFormat;
import java.util.Date;

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
        return new Date( Integer.parseInt(dateArray[0]) - 1900, Integer.parseInt(dateArray[1]) - 1,
                Integer.parseInt(dateArray[2]));
    }
}