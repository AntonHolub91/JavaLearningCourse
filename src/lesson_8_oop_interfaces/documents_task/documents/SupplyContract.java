package lesson_8_oop_interfaces.documents_task.documents;

import java.text.SimpleDateFormat;
import java.util.SimpleTimeZone;

public class SupplyContract extends Document implements Docs {
    String productType;
    int productQuantity;

    public SupplyContract(int documentNumber, String documentDate, String productType, int productQuantity) {
        super(documentNumber, documentDate);
        this.productType = productType;
        this.productQuantity = productQuantity;
    }

    @Override
    public void showInfo() {
        System.out.println("Document number: " + documentNumber + ";\n" +
                "Document date: " + sdf.format(documentDate) + ";\n" +
                "Product type: " + productType + ";\n" +
                "Quantity: " + productQuantity + ";\n" +
                "-".repeat(40));
    }

    @Override
    public int getNumber() {
        return documentNumber;
    }

    @Override
    public String getClassName() {
        return getClass().getSimpleName();
    }
}