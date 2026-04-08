package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     *
     * @param froggerID the record to be added.
     * @return Return false if the record has existed. Else, return true.
     */
    public boolean addRecord(FroggerID newID) {
        for (FroggerID existing : this.records) {
            if (existing.equals(newID)) return false;  // .equals() works automatically!
        }
        this.records.add(newID);
        return true;
    }

    @Override
    public String toString() {
    return "Records{" + "records=" + records + '}';
}
}