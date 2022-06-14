package Class;

public class C0607 {
    public static void main(String[] args) {
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";
        String[] ip = log.split(" ");
        System.out.println(ip[0]);
        System.out.printf("%S %S",ip[3], ip[4]);

        /*
        int a,b;
        a = log.indexOf("[");
        b = log.lastIndexOf("]");
        for ( int i = a +1; i < b; i++ ){
            System.out.print(log.charAt(i));
        }
        */
    }
}
