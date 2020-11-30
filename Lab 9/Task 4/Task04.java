import java.util.StringTokenizer;
public class Task04{
    public static void main(String[]args){
        String kisuShongkha = "74.5                89          \n    45";
        StringTokenizer k = new StringTokenizer(kisuShongkha);
        while(k.hasMoreTokens()){
            System.out.println(k.nextToken());
        }
        System.out.println("========================");
        String golpo = "still you can find some teachers who dislike such co-curricular ="+"activities like Programming Contests. They do not understand contests are="+"far more interesting and challenging than whatever slides he was showing in the classroom.="+"To be a good contestant, one needs to be resourceful.="+"Apart from a working brain, the primary resource for a contestant would be books.;"+"And a good source of books and training materials is the Internet.";
        StringTokenizer k2=new StringTokenizer(golpo, "=");
        while(k2.hasMoreTokens()){
            System.out.println(k2.nextToken());
        }
        System.out.println("========================");
        String s="23 3 8 20 32";
        StringTokenizer k3=new StringTokenizer(s);
        int sum[]=new int[k3.countTokens()];
    }
}