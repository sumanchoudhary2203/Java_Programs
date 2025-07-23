public class Remove_All_Whitespaces__from_a_String {
    public static void main(String[] args){
        String str = "A u t o m a t i o n ";
        String result = str.replaceAll("\\s+","");
        System.out.println(result);
    }
}
