Bubble Sort is a simple sorting algorithm that works by repeatedly swapping adjacent elements if they are in the wrong order. This process continues until the entire list is sorted.

Here’s how it works in a few easy steps:

1. **Start at the beginning** of the list.
2. **Compare the first two elements**. If the first is larger than the second, swap them.
3. **Move to the next pair** of elements and repeat the process (compare and swap if needed).
4. After one complete pass through the list, the **largest element will "bubble up" to the end**.
5. **Repeat the process** for the remaining elements, ignoring the last sorted ones, until no more swaps are needed.

### Example:
If we want to sort `[5, 2, 9, 1, 5]`:
- Compare `5` and `2`, swap → `[2, 5, 9, 1, 5]`
- Compare `5` and `9`, no swap → `[2, 5, 9, 1, 5]`
- Compare `9` and `1`, swap → `[2, 5, 1, 9, 5]`
- Compare `9` and `5`, swap → `[2, 5, 1, 5, 9]`

This completes the first pass. We repeat the process until the list is fully sorted.

### Key Points:
- **Easy to understand** but not very efficient for large lists.
- **Time complexity:** O(n²), where `n` is the number of elements in the list.