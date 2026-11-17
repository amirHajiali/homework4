public class Phone extends Prodoct{
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setModule("Samsungs25ultra");
        phone.setPrice(5000);
        phone.setScreensize(250);
        phone.setWeight("250 grams");
        System.out.printf("Name: %s, Price: %d, , screen size: %d, size %d%n , ", phone.getModule(), phone.getPrice(), phone.getScreensize(), phone.getWeight());
    }
}
