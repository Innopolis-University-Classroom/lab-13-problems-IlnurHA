public class Game {
    private String title;
    private String publisher;
    private String company;
    private String price;
    private String date;
    private String trailer;
    private String discount;

    Game(String title, String publisher, String company, String price, String date, String trailer, String discount) {
        this.title = title;
        this.publisher = publisher;
        this.company = company;
        this.price = price;
        this.date = date;
        this.trailer = trailer;
        this.discount = discount;
    }

    public String getCompany() {
        return company;
    }

    public String getDate() {
        return date;
    }

    public String getDiscount() {
        return discount;
    }

    public String getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getTrailer() {
        return trailer;
    }
}
