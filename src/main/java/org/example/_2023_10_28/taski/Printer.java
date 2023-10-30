package org.example._2023_10_28.taski;

/**
 * Требования:
 *
 * Параметризуйте класс Printer так, чтобы
 * он мог печатать только Document и его подклассы.
 * Добавьте в класс Printer метод printAll, который
 * принимает коллекцию документов и печатает каждый
 * из них.
 */
class Printer {
    public void print(Object doc) {
        System.out.println("Печать документа: " + doc.toString());
    }
}

class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}

class ImageDocument extends Document {
    public ImageDocument(String content) {
        super(content);
    }
}

class TextDocument extends Document {
    public TextDocument(String content) {
        super(content);
    }
}
