package personal.book;

/**
 * @Time : 2020/4/18 20:06
 * @Author : Tian ZHANG
 * @Project : moocJAVA
 * @Class : personal.book.Book
 * @Software: IntelliJ IDEA
 * @Version:
 */

public class Book {
    private final String bookName;
    private final String author;
    private String publisher;
    private float price;

    public Book(String bookName, String author, String publisher, float price) {
        this.bookName = bookName;
        this.author = author;
        this.setPublisher(publisher);
        this.setPrice(price);
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        float priceStandard = 10.0f;
        if (price < priceStandard) {
            System.out.println("图书价格最低10元");
            this.price = 10f;
        } else {
            this.price = price;
        }
    }

    public void showBook() {
        System.out.println("书名：" + this.getBookName());
        System.out.println("作者：" + this.getAuthor());
        System.out.println("出版社：" + this.getPublisher());
        System.out.println("价格：" + this.getPrice() + "元");
        System.out.println("===============================");
    }
}
