public class SyncingSignals {
    public static void main(String[] args) {
        int totalSeconds = 243;
        int secondInCycle = totalSeconds % 10;
        boolean powerSave = false;
        boolean isRed = !powerSave && (secondInCycle < 5);
        System.out.println("Is the signal red? " + isRed);
    }
}