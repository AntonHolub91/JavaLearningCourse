package lesson_8_oop_interfaces.documents_task.documents;

import java.util.Date;

public abstract class Document {
    int documentNumber;
    Date documentDate;

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