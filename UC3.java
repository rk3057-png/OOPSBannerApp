public class UC3 {
    
    public static void main(String[] args) {
       
        System.out.println(createBannerLine(" ", "***", "   ", "***", "  ", "***", " ", "***", " "));
        System.out.println(createBannerLine("*", "   ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*", "   "));
        System.out.println(createBannerLine("*", "    ", "*****", " ", "***", " ", "***", " "));
        System.out.println(createBannerLine("*", "   ", "*", " ", "*", "   ", "*", "   ", "*", "   ", "*", " "));
        System.out.println(createBannerLine("*", "   ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*"));
        System.out.println(createBannerLine(" ", "***", "  ", "*", "    ", "*", " ", "*", "  ", "***", "  "));
        System.out.println();
    }
    
   
    
    public static String createBannerLine(String... segments) {
        return String.join("", segments);
    }
}
