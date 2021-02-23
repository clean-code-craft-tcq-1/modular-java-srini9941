package colorcoder;

/**
 * @author Shrinidhi Muralidhar Karanam
 */
enum MajorColor implements Color {
    WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);
    private final int index;

    MajorColor(int index) {
        this.index = index;
    }

    int getIndex() {
        return index;
    }

    @Override
    public int fetchIndex() {
        return getIndex();
    }
}
