// Input: s = [10, 20, 30, 40, 50]
// Output: [50, 40, 20, 10]

public class Solver {
    public static int maxArea(int[] arr) {
        int max_area = -1000;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int height = Math.min(arr[i], arr[j]);
                    int width = j - i;
                    int area = height * width;
                    max_area = Math.max(max_area, area);
                } else {
                    break; // early stop if condition violated
                }
            }
        }
        return max_area;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area: " + maxArea(arr));
    }
}
 public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        
        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }

        return maxArea;
    }