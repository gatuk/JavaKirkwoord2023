package en.codegym.task.pro.task09.task0912;
/* 
URL validation
*/
public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }
    public static String checkProtocol(String url) {
        //write your code here
        if (url.startsWith("http://") ) {
            return "http";
        }
        if (url.startsWith("https://") ) {
            return "https";
        }
        return "unknown";
    }
    public static String checkDomainExtension(String url) {
        //write your code here
        /*
        And the checkDomainExtension(String) method checks
        the domain (com, net, org, or us) of the URL passed
        in the input parameter, and returns the result of
        the check — the domain extension as a string.
         */
        if (url.endsWith(".com") || url.endsWith(".net") || url.endsWith(".org") || url.endsWith(".us")) {
            return url.substring(url.lastIndexOf(".") + 1);
        }
        return "unknown";
    }
}
