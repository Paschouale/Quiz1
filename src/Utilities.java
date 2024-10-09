public class Utilities {

    public static int getFirstRepeatedCharacter(String text){
        int length = text.length();
        for (int i=0; i< length-1; i++){
            if (text.charAt(i) == text.charAt(i+1)){
                int position = i;
                return position;
            }
        }
        return -1;
    }

    public static void goDownToOne(int startNumber){
        while (startNumber!=1){
            System.out.print(startNumber + " ");
            if (startNumber % 2 == 0){
                startNumber = startNumber / 2;
            }else{
                startNumber = startNumber+startNumber*2 + 1;
            }
        }
        System.out.print(startNumber);
    }
}
