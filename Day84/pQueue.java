import java.util.ArrayList;
public class PQueue {
}
// Priority Queue implementation in Java

class Heap {
    void heapify(ArrayList<Integer> hT, int i) {
        int size = hT.size();
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < size && hT.get(l) > hT.get(largest))
            largest = l;
        if (r < size && hT.get(r) > hT.get(largest))
            largest = r;
        if (largest != i) {
            int temp = hT.get(largest);
            hT.set(largest, hT.get(i));
            hT.set(i, temp);
            heapify(hT, largest);
        }
    }
    void insert(ArrayList<Integer> hT, int newNum) {
        int size = hT.size();
        if (size == 0) {
            hT.add(newNum);
        } else {
            hT.add(newNum);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(hT, i);
            }
        }
    }
    void deleteNode(ArrayList<Integer> hT, int num) {
        int size = hT.size();
        int i;
        for (i = 0; i < size; i++) {
            if (num == hT.get(i))
                break;
        }
        int temp = hT.get(i);
        hT.set(i, hT.get(size - 1));
        hT.set(size - 1, temp);
        hT.remove(size - 1);
        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(hT, j);
        }
    }
    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();
        Heap h = new Heap();
        h.insert(array, 3);
        h.insert(array, 4);
        h.insert(array, 9);
        h.insert(array, 5);
        h.insert(array, 2);
        System.out.println("Max-Heap array: ");
        h.printArray(array, size);
        h.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        h.printArray(array, size);
    }
}

/*
"C:\Users\PARAMVEER SINGH\.jdks\openjdk-18.0.2.1-1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=54871:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\IdeaProjects\DDelta\out\production\DDelta Heap
Max-Heap array: 
9 5 3 4 2 
After deleting an element: 
9 5 3 2 

Process finished with exit code 0

*/
