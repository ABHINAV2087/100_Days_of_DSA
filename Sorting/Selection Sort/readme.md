Selection Sort is a simple sorting algorithm that works by repeatedly finding the smallest (or largest) element from the unsorted part of the list and swapping it with the first unsorted element. It gradually builds the sorted list by placing each element in its correct position.

Here’s how it works in simple steps:

1. **Start with the first element** in the list.
2. **Look through the rest of the list** to find the smallest element.
3. **Swap the smallest element** with the first element.
4. Move to the next position and **repeat the process** (find the smallest element in the unsorted part, swap).
5. Continue until the entire list is sorted.

### Example:
To sort `[29, 10, 14, 37, 13]`:
- Find the smallest element (10) and swap it with the first element → `[10, 29, 14, 37, 13]`
- Now, find the smallest from the remaining list `[29, 14, 37, 13]` (which is 13) and swap it with the second element → `[10, 13, 14, 37, 29]`
- Repeat the process until the list is sorted.

### Key Points:
- Selection Sort **doesn't require much swapping** compared to Bubble Sort.
- **Time complexity:** O(n²), which makes it inefficient for large lists.
- **Simple to understand** and works well for small datasets or when memory usage needs to be minimized.