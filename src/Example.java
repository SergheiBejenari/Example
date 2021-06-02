import java.util.ArrayDeque;
import java.util.Queue;

public class Example {
    public void queue() {
        Queue<String> queue = new ArrayDeque<>(
        );
        queue.add("Hello");
        queue.add("Hi");
        queue.add("Bonjour");

        for (String str : queue
        ) {
            System.out.println(str);
        }

        System.out.println("=============================");

        System.out.println(queue.poll());

        queue.forEach(System.out::println);

    }

    public static void main(String[] args) {
        Example example = new Example();
        example.queue();
    }
}
