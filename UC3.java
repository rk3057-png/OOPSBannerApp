public class UC3 {
    
    public static void main(String[] args) {
        // UC3: Refactored from UC2 using String.join() for memory efficiency
        // Memory Efficiency Improvement:
        // - Old approach (UC2): System.out.println(line1 + line2 + line3)
        //   Creates intermediate String objects for each + operation
        // - New approach (UC3): System.out.println(String.join("", parts))
        //   Builds the entire string efficiently in one operation
        
        // Display OOPS banner using String.join() method
        System.out.println(createBannerLine(" ", "***", "   ", "***", "  ", "***", " ", "***", " "));
        System.out.println(createBannerLine("*", "   ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*", "   "));
        System.out.println(createBannerLine("*", "    ", "*****", " ", "***", " ", "***", " "));
        System.out.println(createBannerLine("*", "   ", "*", " ", "*", "   ", "*", "   ", "*", "   ", "*", " "));
        System.out.println(createBannerLine("*", "   ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*"));
        System.out.println(createBannerLine(" ", "***", "  ", "*", "    ", "*", " ", "*", "  ", "***", "  "));
        System.out.println();
    }
    
    /**
     * Creates a banner line by efficiently joining multiple string segments.
     * 
     * This method demonstrates the key improvement over UC2:
     * - String.join() pre-allocates a buffer and combines strings in a single operation
     * - Avoids multiple intermediate String object creation
     * - Example: Instead of "part1" + "part2" + "part3" (2 intermediate objects),
     *   String.join("", parts) handles it in one efficient operation
     * 
     * Memory Efficiency:
     * - String concatenation with +: O(n²) in worst case due to immutability
     * - String.join(): O(n) - single pass through all segments
     * 
     * @param segments Variable number of string segments to join
     * @return Combined string with no separator between segments
     */
    public static String createBannerLine(String... segments) {
        return String.join("", segments);
    }
}
