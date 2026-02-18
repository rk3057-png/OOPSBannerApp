public class UC4 {
    
    public static void main(String[] args) {
        
        
        String[] bannerLines = {
            createBannerLine(" ", "***", "   ", "***", "  ", "***", " ", "***", " "),
            createBannerLine("*", "   ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*", "   "),
            createBannerLine("*", "    ", "*****", " ", "***", " ", "***", " "),
            createBannerLine("*", "   ", "*", " ", "*", "   ", "*", "   ", "*", "   ", "*", " "),
            createBannerLine("*", "   ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*"),
            createBannerLine(" ", "***", "  ", "*", "    ", "*", " ", "*", "  ", "***", "  ")
        };
        
      
        for (String line : bannerLines) {
            System.out.println(line);
        }
        System.out.println();
    }
    
   
    
    public static String createBannerLine(String... segments) {
        return String.join("", segments);
    }
}
