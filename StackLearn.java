import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackLearn {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cat");
        animals.push("Dog");
        System.out.println(animals);
        animals.pop();
        System.out.println(animals);
        System.out.println(animals.peek()); 

        Queue<Integer> queue= new LinkedList<>();
        queue.add(13); ///not throw exception crash app
        queue.offer(12); // throw exception if not added
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
         
        PriorityQueue<Integer> nums = new PriorityQueue<>();
        nums.offer(13);
        nums.offer(14);
        nums.offer(6);
        nums.offer(8);
        nums.offer(2);
        nums.offer(1);
        System.out.println(nums);
        nums.poll();
        System.out.println(nums);
        nums.poll();
        System.out.println(nums);
        nums.poll();
        System.out.println(nums);
        



    }
}
