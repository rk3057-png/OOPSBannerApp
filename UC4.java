public class UC4 {
    
    public static void main(String[] args) {
        // UC4: Improved from UC3 using String array and enhanced for-loop
        // Key Improvements:
        // 1. Centralized banner data in String array (better modularity)
        // 2. Enhanced for-loop for cleaner iteration (no index management)
        // 3. Easy to modify, extend, or reuse the banner structure
        // 4. Separation of concerns: data structure vs. output logic
        
        // Create banner array with all lines pre-built using String.join()
        String[] bannerLines = {
            createBannerLine(" ", "***", "   ", "***", "  ", "***", " ", "***", " "),
            createBannerLine("*", "   ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*", "   "),
            createBannerLine("*", "    ", "*****", " ", "***", " ", "***", " "),
            createBannerLine("*", "   ", "*", " ", "*", "   ", "*", "   ", "*", "   ", "*", " "),
            createBannerLine("*", "   ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*"),
            createBannerLine(" ", "***", "  ", "*", "    ", "*", " ", "*", "  ", "***", "  ")
        };
        
        // Print all banner lines using enhanced for-loop
        // Benefits over individual print statements:
        // - No repetitive code (single loop instead of 6 separate println calls)
        // - Easy to add/remove/modify lines (just update the array)
        // - Scales well for larger banners
        for (String line : bannerLines) {
            System.out.println(line);
        }
        System.out.println();
    }
    
    /**
     * Creates a banner line by joining string segments.
     * This method encapsulates the String.join() logic from UC3.
     * 
     * Array Benefits:
     * - Centralized data storage: all banner lines in one structure
     * - Reusable: can modify array and loop prints all changes
     * - Maintainable: adding new banners is now simple
     * 
     * Enhanced for-loop Benefits:
     * - No index management (cleaner code)
     * - No array bounds issues
     * - Intent is clearer: "for each line, print it"
     * 
     * @param segments Variable number of string segments to join
     * @return Combined string with no separator between segments
     */
    public static String createBannerLine(String... segments) {
        return String.join("", segments);
    }
}
