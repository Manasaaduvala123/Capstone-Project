package day5_Assessment;
public class Locker {
    private final String lockerId;
    private boolean isLocked;
    private final String passcode;

    public Locker(String lockerId, String passcode) {
        this.lockerId = lockerId;
        this.passcode = passcode;
        this.isLocked = true;
    }

    public void lock() {
        isLocked = true;
        System.out.println("Locker " + lockerId + " is now locked.");
    }

    public boolean unlock(String code) {
        SecurityManager sm = new SecurityManager();
        if (sm.verify(code)) {
            isLocked = false;
            System.out.println("Locker " + lockerId + " unlocked successfully.");
            return true;
        } else {
            System.out.println("Incorrect passcode. Locker remains locked.");
            return false;
        }
    }

    public boolean isLocked() {
        return isLocked;
    }

    private class SecurityManager {
        private boolean verify(String code) {
            return passcode.equals(code);
        }
    }

    public static void main(String[] args) {
        Locker locker = new Locker("L123", "secure123");

        System.out.println("Is Locked? " + locker.isLocked());
        locker.unlock("wrong123");
        System.out.println("Is Locked? " + locker.isLocked());
        locker.unlock("secure123");
        System.out.println("Is Locked? " + locker.isLocked());
        locker.lock();
        System.out.println("Is Locked? " + locker.isLocked());
    }
}

/*
output:
Is Locked? true
Incorrect passcode. Locker remains locked.
Is Locked? true
Locker L123 unlocked successfully.
Is Locked? false
Locker L123 is now locked.
Is Locked? true
*/
