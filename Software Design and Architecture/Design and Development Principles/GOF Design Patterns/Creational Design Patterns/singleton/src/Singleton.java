public class Singleton {
    private volatile static Singleton uniqueInstance;
    private static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
   return uniqueInstance;
    }
}
