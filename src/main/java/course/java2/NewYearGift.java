package course.java2;

public class NewYearGift {

    private int id;
    private String name;
    private int weight;
    private int price;

    public NewYearGift(int id, String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        NewYearGift candy = new NewYearGift(1, "Птичье молоко", 250, 130);
        NewYearGift jellyBean = new NewYearGift(2, "Бон Пари", 500, 155);
        NewYearGift marshmallow = new NewYearGift(3, "Haribo", 90, 91);

        NewYearGift[] array = {candy, jellyBean, marshmallow};
        for (NewYearGift gift : array) {
            System.out.println("ID: " + gift.getId());
            System.out.println("Название: " + gift.getName());
            System.out.println("Вес: " + gift.getWeight() + " г");
            System.out.println("Цена: " + gift.getPrice() + " руб.");
            System.out.println("--------------");
        }

        int totalWeight = candy.getWeight() + jellyBean.getWeight() + marshmallow.getWeight();
        int totalСost = candy.getPrice() + jellyBean.getPrice() + marshmallow.getPrice();

        System.out.println("Общий вес подарка: " + totalWeight + " г" + " общая стоимость подарка: " + totalСost + " руб.");
    }
}
