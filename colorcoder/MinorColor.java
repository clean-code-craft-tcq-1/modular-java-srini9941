package colorcoder;

/**
 * @author Shrinidhi Muralidhar Karanam on 2021-02-23
 */
enum MinorColor implements Color {
    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);
    private final int index;

    MinorColor(int index) {
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
