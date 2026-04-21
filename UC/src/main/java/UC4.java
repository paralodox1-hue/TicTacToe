public class UC4 {

    // Method to convert slot number (1–9) into row & column
    public static int[] convertSlotToIndex(int slot) {
        if (slot < 1 || slot > 9) {
            throw new IllegalArgumentException("Slot must be between 1 and 9.");
        }

        // Zero-based math: slot-1
        int row = (slot - 1) / 3;   // integer division
        int col = (slot - 1) % 3;   // modulo for column

        return new int[]{row, col};
    }

    // Demo main method
    public static void main(String[] args) {
        for (int slot = 1; slot <= 9; slot++) {
            int[] indices = convertSlotToIndex(slot);
            System.out.println("Slot " + slot + " → Row: " + indices[0] + ", Col: " + indices[1]);
        }
    }
}