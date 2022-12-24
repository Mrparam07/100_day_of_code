
public class Queue {

    public static int front, rear, capacity;
    public static int queue[];

    Queue(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];

    }

    public static void queueEnm(int item) {
        if (capacity == rear) {
            System.out.println("Queue is Full");
        } else {
            queue[rear] = item;
            rear++;
        }
        return;
    }


    static void Dqueue() {
        if (rear == 0) {
            System.out.print("Queue is Full");
            return;
        } else {
            for (int i = 0; i < 4; i++) {
                queue[i] = queue[i + 1];
            }
        }
        if (capacity > rear) {
            queue[rear] = 0;
            rear--;
        }
        return;
    }
}
    class Solution01 {
        public static void main(String[] args) {
            // public class queue {
            Queue ob = new Queue(4);

        ob.queueEnm(45);


            // }

        }

    }

