package colorcoder;

/**
 * @author Shrinidhi Muralidhar Karanam on 2021-02-23
 */
class ColorPairTester {

    private ColorPairTester() {
    }

    static void testNumberToPair(
        int pairNumber,
        MajorColor expectedMajor,
        MinorColor expectedMinor
    )
    {
        ColorPair colorPair = EnumHelper.getColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.toString());
        assert (colorPair.getMajor() == expectedMajor);
        assert (colorPair.getMinor() == expectedMinor);
    }

    static void testPairToNumber(
        MajorColor major,
        MinorColor minor,
        int expectedPairNumber
    )
    {
        int pairNumber = EnumHelper.getPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert (pairNumber == expectedPairNumber);
    }

}
