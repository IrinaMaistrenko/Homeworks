package HomeWork4;

public class DataContainerMain {

    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        DataContainer<Integer> container  = new DataContainer<>(arr);
        container.add(1);
        container.add(2);
        container.add(3);
        container.add(0);
        container.add(-4);

    }
}
