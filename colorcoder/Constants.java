package colorcoder;

/**
 * @author Shrinidhi Muralidhar Karanam on 2021-02-23
 */
class Constants {

    static final String MAJOR_COLOR_NAMES[] = {
        "White", "Red", "Black", "Yellow", "Violet"
    };
    static final int NUMBER_OF_MAJOR_COLORS = MAJOR_COLOR_NAMES.length;
    static final String MINOR_COLOR_NAMES[] = {
        "Blue", "Orange", "Green", "Brown", "Slate"
    };
    static final int NUMBER_OF_MINOR_COLORS = MINOR_COLOR_NAMES.length;
    static final int MAX_COLOR_PAIR = NUMBER_OF_MAJOR_COLORS * NUMBER_OF_MINOR_COLORS;

    private Constants() {
    }
}
