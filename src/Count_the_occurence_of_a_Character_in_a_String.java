public class Count_the_occurence_of_a_Character_in_a_String {
    public static void main(String[] args){
        String str = "Automation";
        char ch='o';
        int count = 0;
        for (char c:str.toCharArray()){
            if(c==ch)
                count++;
        }
        System.out.println(count);
    }
}
