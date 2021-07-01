public class CinemaSeat {

    private final int SEAT_NUMBER;
    private final int ROW_NUMBER;
    private boolean isTaken;

    public CinemaSeat(int seatNumber, int rowNumber, boolean isTaken) {
        SEAT_NUMBER = seatNumber;
        ROW_NUMBER = rowNumber;
        this.isTaken = isTaken;
    }

    public boolean getIsTaken() {
        return isTaken;
    }

    public void setIsTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }

}
