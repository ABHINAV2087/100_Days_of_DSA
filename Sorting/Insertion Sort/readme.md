# Insertion Sort

Insertion Sort is a simple sorting algorithm that builds the sorted list one item at a time. It works by repeatedly taking an element from the unsorted portion of the list and placing it in its correct position within the sorted portion.

### How it Works:
1. **Start with the second element** in the list, treating the first element as the sorted portion.
2. **Compare the current element** with each element in the sorted portion, moving each larger element one position to the right to make space.
3. **Insert the current element** into the correct position within the sorted portion.
4. Move to the next element in the unsorted portion and **repeat the process** (compare, shift, insert).
5. Continue until all elements are sorted.

### Example:
To sort `[29, 10, 14, 37, 13]`:
1. Start with the second element (10) and insert it into the sorted portion `[29]` → `[10, 29, 14, 37, 13]`
2. Move to the next element (14) and insert it into the sorted portion `[10, 29]` → `[10, 14, 29, 37, 13]`
3. Next, insert 37 into `[10, 14, 29]` → `[10, 14, 29, 37, 13]` (no shift needed)
4. Finally, insert 13 into `[10, 14, 29, 37]` → `[10, 13, 14, 29, 37]`
5. The list is now sorted.

### Key Points:
- **Efficient for small or partially sorted lists.**
- **Stable sorting algorithm:** maintains the order of equal elements.
- **Time complexity:** O(n²) for an average and worst-case scenario, but O(n) for a nearly sorted list, making it faster than other quadratic-time algorithms for small or semi-sorted datasets.
- **In-place sorting:** requires minimal additional memory.