package lab_06;

public class Lab_601 {

    public static void main(String[] args) {
        String time = "2hrs and 5 minutes";
        String[] hourAndMinute = time.split(" and ");
        for (String each: hourAndMinute) {
            System.out.println(each);
        }
        System.out.print("Minutes total: ");
        System.out.println(caculateMinutes(getMinutes(hourAndMinute), getHours(hourAndMinute)));
    }

    public static int getMinutes(String[] array) {
        return Integer.parseInt(array[1].substring(0, array[1].indexOf(" minutes")));
    }

    public static int getHours(String[] array) {
        return Integer.parseInt(array[0].substring(0, array[0].indexOf("hrs")));
    }

    public static int caculateMinutes(int minutes, int hours){
        return minutes + hours * 60;
    }

}
