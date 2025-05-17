package generics;

public class Ecommerce {
    public static void main(String[] args) {
        Electronics tv = new Electronics();
        Book fimk = new Book();

        ElectronicsCart ec = new ElectronicsCart();
        ec.items.add(tv);

        BookCart bc = new BookCart();
        bc.items.add(fimk);

        Cart<Book> c = new Cart<>();
        c.items.add(fimk);

        Cart<Electronics> c2 = new Cart<>();
        c2.items.add(tv);

        Cart<Goods> cc = new Cart<>();
        cc.items.add(fimk);
        cc.items.add(tv);
    }
}
