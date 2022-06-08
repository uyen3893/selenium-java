package lab_06;

public class Lab_601 {

    public static void main(String[] args) {
        String time = "2hrs and 5 minutes";
        System.out.print("Minutes total: ");
        System.out.println(caculateMinutes(getMinutes(time), getHours(time)));
    }

    public static int getMinutes(String time){
        return Integer.parseInt(time.substring(9, time.indexOf(" minutes")));
    }

    public static int getHours(String time) {
        return Integer.parseInt(time.substring(0, time.indexOf("hrs")));
    }

    public static int caculateMinutes(int minutes, int hours){
        return minutes + hours * 60;
    }

}
