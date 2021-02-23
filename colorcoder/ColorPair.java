package colorcoder;

/**
 * @author Shrinidhi Muralidhar Karanam on 2021-02-23
 */
class ColorPair {

    private final MajorColor majorColor;
    private final MinorColor minorColor;

    ColorPair(
        MajorColor major,
        MinorColor minor
    )
    {
        majorColor = major;
        minorColor = minor;
    }

    public MajorColor getMajor() {
        return majorColor;
    }

    public MinorColor getMinor() {
        return minorColor;
    }

    @Override
    public String toString() {
        String colorPairStr = Constants.MAJOR_COLOR_NAMES[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += Constants.MINOR_COLOR_NAMES[minorColor.getIndex()];
        return colorPairStr;
    }
}