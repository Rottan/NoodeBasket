public class Test {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Node node = new Node("krepel",3);
        Node node1 = new Node("jajco", 5);
        Node node2 = new Node("marmolada",7);
        basket.add(node);
        basket.add(node1);
        basket.add(node2);
        basket.add(node2);
        basket.add(node2);
        basket.printAll();
        basket.printHead();
        basket.printTail();
        basket.getSize();
        System.out.println("kuniec");


    }
}
