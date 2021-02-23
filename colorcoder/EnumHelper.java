package colorcoder;

import java.util.Arrays;

/**
 * @author Shrinidhi Muralidhar Karanam on 2021-02-23
 */
class EnumHelper {

    private EnumHelper() {
    }

    public static <E extends Enum<E> & Color, P> E getEnum(
        Class<E> type,
        P value
    )
    {
        return Arrays.stream(type.getEnumConstants())
            .filter(constant -> value.equals(constant.fetchIndex()))
            .findFirst()
            .orElse(null);
    }

    static ColorPair getColorFromPairNumber(int pairNumber) {
        assert (pairNumber <= Constants.MAX_COLOR_PAIR && pairNumber >= 1);
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor =
            getEnum(MajorColor.class, zeroBasedPairNumber / Constants.NUMBER_OF_MINOR_COLORS);
        MinorColor minorColor =
            getEnum(MinorColor.class, zeroBasedPairNumber % Constants.NUMBER_OF_MINOR_COLORS);
        return new ColorPair(majorColor, minorColor);
    }

    static int getPairNumberFromColor(
        MajorColor major,
        MinorColor minor
    )
    {
        return major.getIndex() * Constants.NUMBER_OF_MINOR_COLORS + minor.getIndex() + 1;
    }

}
