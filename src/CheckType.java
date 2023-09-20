public class CheckType {
    public static void main(String[] args) {
        String aiyaDataString = "1";
        System.out.println(aiyaDataString);
        System.out.println(aiyaDataString instanceof String);

        int aiyaDataInt = 0;
        try {
            aiyaDataInt = Integer.parseInt(aiyaDataString);
            System.out.println(aiyaDataInt);
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }

        String aiyaDataStringNew = Integer.toString(aiyaDataInt);
        System.out.println(aiyaDataStringNew);
        System.out.println(aiyaDataStringNew instanceof String);

        String aiyaDataStringNewer = "" + aiyaDataInt;
        System.out.println(aiyaDataStringNewer);
        System.out.println(aiyaDataStringNewer instanceof String);

    }
}