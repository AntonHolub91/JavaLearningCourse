package lesson8_oop_interfaces.hw_task_3_documents.register;

import lesson8_oop_interfaces.hw_task_3_documents.documents.Docs;

public class Register {
    Docs[] documents = new Docs[10];

    public void saveDocument(Docs document) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] != null) {
                if (documents[i].getNumber() == document.getNumber() &&
                        documents[i].getClassName().equals(document.getClassName())) {
                    System.out.println("Document with the same number and type combination already exists in the register.\n" +
                            "-".repeat(40));
                    break;
                }
            }
            if (documents[i] == null) {
                documents[i] = document;
                System.out.println("Document number " + document.getNumber() + " was added to the register.");
                break;
            }
        }
    }

    public void showAllDocuments() {
        System.out.println("Full list of documents in the register is: ");
        for (Docs doc : documents) {
            if (doc != null) {
                doc.showInfo();
            }
        }
    }
}