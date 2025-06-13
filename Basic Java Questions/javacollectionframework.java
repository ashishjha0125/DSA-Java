import java.util.*;

public class javacollectionframework {
  public static void main(String[] args) {

    // 1. ArrayList
    System.out.println("\n--- ArrayList ---");
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(10);
    arrayList.add(20);
    arrayList.add(30);
    arrayList.remove(1); // remove element at index 1
    for (int num : arrayList)
      System.out.print(num + " ");

    // 2. Stack
    System.out.println("\n\n--- Stack ---");
    Stack<Integer> stack = new Stack<>();
    stack.push(5);
    stack.push(10);
    stack.push(15);
    stack.pop(); // removes top
    System.out.println(stack.peek()); // top element
    for (int num : stack)
      System.out.print(num + " ");

    // 3. LinkedList (as List & Queue)
    System.out.println("\n\n--- LinkedList ---");
    LinkedList<String> list = new LinkedList<>();
    list.add("A");
    list.add("B");
    list.addFirst("Start");
    list.removeLast();
    for (String str : list)
      System.out.print(str + " ");

    // 4. PriorityQueue - Min Heap (default)
    System.out.println("\n\n--- PriorityQueue (Min Heap) ---");
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    minHeap.add(30);
    minHeap.add(10);
    minHeap.add(20);
    while (!minHeap.isEmpty())
      System.out.print(minHeap.poll() + " ");

    // 5. PriorityQueue - Max Heap
    System.out.println("\n\n--- PriorityQueue (Max Heap) ---");
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    maxHeap.add(30);
    maxHeap.add(10);
    maxHeap.add(20);
    while (!maxHeap.isEmpty())
      System.out.print(maxHeap.poll() + " ");

    // 6. ArrayDeque (Double-ended queue)
    System.out.println("\n\n--- ArrayDeque ---");
    ArrayDeque<String> deque = new ArrayDeque<>();
    deque.add("One");
    deque.addFirst("Zero");
    deque.addLast("Two");
    deque.removeLast();
    for (String str : deque)
      System.out.print(str + " ");

    // 7. HashSet
    System.out.println("\n\n--- HashSet ---");
    HashSet<Integer> hashSet = new HashSet<>();
    hashSet.add(10);
    hashSet.add(20);
    hashSet.add(10); // duplicates not allowed
    for (int val : hashSet)
      System.out.print(val + " ");

    // 8. LinkedHashSet
    System.out.println("\n\n--- LinkedHashSet ---");
    LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
    linkedSet.add(30);
    linkedSet.add(10);
    linkedSet.add(20);
    for (int val : linkedSet)
      System.out.print(val + " ");

    // 9. TreeSet (sorted)
    System.out.println("\n\n--- TreeSet ---");
    TreeSet<Integer> treeSet = new TreeSet<>();
    treeSet.add(50);
    treeSet.add(10);
    treeSet.add(30);
    for (int val : treeSet)
      System.out.print(val + " "); // auto sorted

    // 10. HashMap
    System.out.println("\n\n--- HashMap ---");
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Apple", 1);
    map.put("Ball", 2);
    map.put("Cat", 3);
    map.remove("Ball");
    for (Map.Entry<String, Integer> entry : map.entrySet())
      System.out.println(entry.getKey() + " = " + entry.getValue());

    // 11. TreeMap (sorted by key)
    System.out.println("\n--- TreeMap ---");
    TreeMap<String, Integer> treeMap = new TreeMap<>();
    treeMap.put("Banana", 2);
    treeMap.put("Apple", 1);
    treeMap.put("Cherry", 3);
    for (Map.Entry<String, Integer> entry : treeMap.entrySet())
      System.out.println(entry.getKey() + " = " + entry.getValue());
  }
}
