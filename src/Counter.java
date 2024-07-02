public class Counter {
    public static int count;

    public Counter() {
        count+=1;
    }

    public static int getCount() {
        return count;
    }
}
