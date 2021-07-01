public class CinemaSeat {

    private final int seatNumber;
    private final int rowNumber;
    private boolean isTaken;

    public CinemaSeat(int seatNumber, int rowNumber, boolean isTaken) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.isTaken = isTaken;
    }

    public boolean getIsTaken() {
        return isTaken;
    }

    public void setIsTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }

}
