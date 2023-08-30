import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(100);
		queue.offer(200);
		queue.offer(300);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		queue.clear();
	}
}