package colorcoder;

public class Main {

    public static void main(String[] args) {
        ColorPairTester.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorPairTester.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

        ColorPairTester.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorPairTester.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

        printAllColorCoding();
    }

    private static void printAllColorCoding() {
        System.out.println("-------------------------");
        System.out.println("| Pair No | Color Pair |");
        System.out.println("-------------------------");
        for (int i = 1; i <= Constants.MAX_COLOR_PAIR; i++) {
            System.out.println("| " + i + " | " + EnumHelper.getColorFromPairNumber(i) + " |");
            System.out.println("-------------------------");
        }
    }
}
