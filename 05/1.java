import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class One {
    public static void main(String[] args) {
        String inputString = "BFFBFBBRLR\n" +
                "FFFFBBBLRR\n" +
                "FFFFBBFLRL\n" +
                "BFFBBFFLRR\n" +
                "BFFBFBBLRR\n" +
                "FBBBBBFLLR\n" +
                "BBFFBFFRRR\n" +
                "BFFBBBBLLL\n" +
                "BBFFFBFRLL\n" +
                "BFBFFBBRRR\n" +
                "FFFBBBFLLR\n" +
                "BFFFBFBRRR\n" +
                "FBFBFFFRLR\n" +
                "BFFBFBBRLL\n" +
                "FFBBBFBRRR\n" +
                "BBFBFBBRRR\n" +
                "BFFBFFFLLL\n" +
                "FBBFFBBRLL\n" +
                "FBFFBFBRRR\n" +
                "BFFFBFBRLL\n" +
                "FBFBBFBRRL\n" +
                "FBFFBFBRLL\n" +
                "FBFFFFBLRR\n" +
                "BFBBBFBLLR\n" +
                "FFBBBBBLRR\n" +
                "BFBBBFBRRR\n" +
                "FFBFBBFLLL\n" +
                "BFFFFFBLRL\n" +
                "FBBBBFBRRR\n" +
                "FBBBFBFLRL\n" +
                "BBFFFFFRLR\n" +
                "BBFFBFBLLL\n" +
                "BBFBBFFRLL\n" +
                "FBBFFBFRRL\n" +
                "BFBBFFFRLL\n" +
                "BFFBFFBLRL\n" +
                "BFBBBBFLLR\n" +
                "BBFFFFBLLR\n" +
                "FBBBFBBRLR\n" +
                "BFFFBFFLLR\n" +
                "BFBBFBFRLL\n" +
                "FBBBBFBLLL\n" +
                "FBFBBBFLLL\n" +
                "FFFBBBBRLR\n" +
                "FBBBFFBRLL\n" +
                "BBFFBFBLRR\n" +
                "FBFFBFFRRL\n" +
                "FBBBFFFLLR\n" +
                "FBBFFFFRLR\n" +
                "BFBFFBFLLR\n" +
                "FFBFBBBRRL\n" +
                "FBBFFBBLLL\n" +
                "FFBFFBBRLL\n" +
                "FFBBFFFRRR\n" +
                "FBBFBFBRRR\n" +
                "FBBFFFFLLR\n" +
                "FBFBFBFLLL\n" +
                "BFBFFFBLRL\n" +
                "FFBBBBFLRR\n" +
                "FFBFFFFLRR\n" +
                "FBFBFFBRRR\n" +
                "FFFBBBFRRL\n" +
                "FBBBFBBLRL\n" +
                "BFFBBBFLLL\n" +
                "FFFBFBFRLR\n" +
                "BFBFBFBLLL\n" +
                "FBBBFFFRRL\n" +
                "FBBBBFFRLR\n" +
                "FFBFFBFLRR\n" +
                "BFBFFBFLRL\n" +
                "BFFBFBFRRR\n" +
                "BFBFFBFRRR\n" +
                "BBFFBBFLRL\n" +
                "BFFFBBBLLL\n" +
                "FBFFBBBLRL\n" +
                "FFBBFBBLRL\n" +
                "BFBBFFBRLL\n" +
                "FFBFFFFRRL\n" +
                "FBFFBBBRLL\n" +
                "FBBFBFBRLL\n" +
                "BBFBFBBRLR\n" +
                "FBFFFBFLRR\n" +
                "BFBBFFFLRR\n" +
                "BFBBBFFRRR\n" +
                "FFBFFBBRLR\n" +
                "BFBBBBBRRL\n" +
                "FFBFFBFLRL\n" +
                "FFFFBFFRLL\n" +
                "FBFBBBBRLL\n" +
                "FBFBBFFLLL\n" +
                "FFBBFBFRLR\n" +
                "FBBFFBBRLR\n" +
                "BBFFFBBLLR\n" +
                "FBBFFBBRRL\n" +
                "FFBFFBBRRL\n" +
                "BFFFFBBRLL\n" +
                "FBFBFFBRLR\n" +
                "FFFBFFBRRL\n" +
                "BFFBFFFRLL\n" +
                "FFBBBFFLLL\n" +
                "FBFFFBFRRR\n" +
                "BFBFBBFRRR\n" +
                "BFBFFBFLLL\n" +
                "FBFBBFFLLR\n" +
                "FBBBFFBLRL\n" +
                "FFBFFFFLLR\n" +
                "FFFBBBFRLR\n" +
                "FBBFBFFRLL\n" +
                "FFBFBFBLRL\n" +
                "BFBFBBBLRR\n" +
                "BBFBBBFLLR\n" +
                "FFFBBFBRRL\n" +
                "FBFBBFBLRL\n" +
                "BFFFBBBLRL\n" +
                "FFFBFFBRRR\n" +
                "FBBBFFFLRL\n" +
                "FBBBBBBRRL\n" +
                "BFBBBBBRRR\n" +
                "FFBFBBFRLL\n" +
                "FFBBBBFRRR\n" +
                "FBBFFBFLRL\n" +
                "FBBBBFBLLR\n" +
                "BBFFBBFLLL\n" +
                "FBBBBFBLRR\n" +
                "BFFFFFFLRL\n" +
                "FBBFFFBRLL\n" +
                "BBFFFBBLRL\n" +
                "FFBBFFFRLL\n" +
                "BFBBFBBLLR\n" +
                "BFBFBBBRLR\n" +
                "BFFFFBFLRR\n" +
                "FFBBFFBRRR\n" +
                "BFFFBBBRRL\n" +
                "FBFFBBBLRR\n" +
                "FFFFBFFLRR\n" +
                "FFBBFBFLLR\n" +
                "BFBBFFBLRL\n" +
                "BFFBFFFLLR\n" +
                "FFBBBFBLLL\n" +
                "BBFFFBBRLR\n" +
                "FBBBFBBRLL\n" +
                "FBFFBBFRLR\n" +
                "BBFBFBBLLR\n" +
                "BFBFFFBLLL\n" +
                "BBFBBFFLRR\n" +
                "BFBBFBFRRL\n" +
                "FFFBBFBRRR\n" +
                "BFBFBBFLLL\n" +
                "FFFFBFBRLL\n" +
                "FBFFFFBRLL\n" +
                "FBBFFBBLLR\n" +
                "FBBBFFBLRR\n" +
                "FBFFFFFLLL\n" +
                "BBFBFFFLLR\n" +
                "BFFFBBFLRR\n" +
                "FBBBBFFRRL\n" +
                "BFFBBBBLLR\n" +
                "FFBBFBBLLR\n" +
                "BFFBBBBRRR\n" +
                "BFFBFFBRRL\n" +
                "BBFBBFBLRL\n" +
                "FFBFFFBRRL\n" +
                "BBFBBFBLLL\n" +
                "FFBFBFBLLR\n" +
                "FFBBFBFRRL\n" +
                "BFFFFFBRLL\n" +
                "FBBBBBBRLL\n" +
                "FBBFBBBLLR\n" +
                "FFFFBBFRRR\n" +
                "FBBBFBFLLL\n" +
                "FBFFBFBRRL\n" +
                "BBFFFFBRLL\n" +
                "FBBBBFBLRL\n" +
                "BBFFBBBRRL\n" +
                "BFFBFFFRLR\n" +
                "FFBFBFFLLL\n" +
                "FFBBBBFLRL\n" +
                "BFFBBBFRRR\n" +
                "BFFBFFBLLL\n" +
                "FFBFFBBLRL\n" +
                "FBFFBBFRLL\n" +
                "FBFBBBFRRR\n" +
                "FBFFBFFLLR\n" +
                "BBFFBBFRRL\n" +
                "BFBFFBFRLR\n" +
                "FBBBFFBRRR\n" +
                "FFFBBBFRRR\n" +
                "BFFBBFBLRL\n" +
                "BBFFFBFLRL\n" +
                "FBBFFBBLRL\n" +
                "FBFBBFFRLR\n" +
                "BFFBBBFLRR\n" +
                "BBFFFFBLLL\n" +
                "BBFBBFBLLR\n" +
                "FFBBBBBRRR\n" +
                "FBFBFFFLRR\n" +
                "FBFBFFFLLR\n" +
                "FFBFFFBLLR\n" +
                "FFBFFBFRLR\n" +
                "BFFBFBBRRR\n" +
                "BBFFFBBLRR\n" +
                "BFBFBFFRLR\n" +
                "FFBBBBFLLR\n" +
                "FFBBFFBLRR\n" +
                "BBFBBFFRLR\n" +
                "BBFFFBFLLR\n" +
                "BBFFBBBLRL\n" +
                "BFFBBFBRRL\n" +
                "FFFBFBBLLR\n" +
                "BBFFBFFRLR\n" +
                "BFFFFBBLLR\n" +
                "FBBFBFFLLR\n" +
                "FFFFBFBRLR\n" +
                "FBBFFFFLLL\n" +
                "BFBFBBFRLR\n" +
                "BFFBFFBRLR\n" +
                "FFFBFFFLLR\n" +
                "FFBBBBFRLR\n" +
                "FBBBFBBLLL\n" +
                "FFBFBFBRRR\n" +
                "FBFFFBBLRR\n" +
                "BFBBFFFLRL\n" +
                "FBFFBFBRLR\n" +
                "BFBFFBFLRR\n" +
                "BBFFFBFLLL\n" +
                "FFBFFBBLRR\n" +
                "BFBFFFFRRR\n" +
                "BFFFBBBRLL\n" +
                "BBFBBFBLRR\n" +
                "FFFFBFBRRL\n" +
                "BFFBBFFRLL\n" +
                "FBFFBBBRRL\n" +
                "BBFFFFFLRL\n" +
                "BFFBBBFRLR\n" +
                "BFFFBFFRRL\n" +
                "BFBFFFBRLR\n" +
                "FFFBFBFLLL\n" +
                "BFBFFBBLLL\n" +
                "FBFBBBFRLR\n" +
                "FBFFBBFLLL\n" +
                "BFBFBBBLRL\n" +
                "FFBFBFBLRR\n" +
                "BFBBBBBLLL\n" +
                "BFFBBBBRRL\n" +
                "FFFFBBBRLR\n" +
                "BFBFBBFLLR\n" +
                "FBBBBBFRRR\n" +
                "FBBFBFFRLR\n" +
                "BBFBBFBRRL\n" +
                "FFBFBBBLRL\n" +
                "BFBFBFBLRL\n" +
                "FBFBBBFLRL\n" +
                "FBFBBBBLLL\n" +
                "FBFBBBBRRR\n" +
                "FBBFBFBLLR\n" +
                "FBFBFBBRLR\n" +
                "FFBFFFBLRR\n" +
                "BFFBBFBRLL\n" +
                "BFFBFBBLLL\n" +
                "FBFBFFBLRL\n" +
                "BFFFFFFRLR\n" +
                "BBFFFFFRLL\n" +
                "FFBFBFBRRL\n" +
                "FBBFFBFRRR\n" +
                "BFFFFBBLRL\n" +
                "FBBFBBFLRL\n" +
                "FBBFBBFRLL\n" +
                "BBFBFBBLRR\n" +
                "FBFBFBBLRL\n" +
                "BFBBBFFRLL\n" +
                "FBBBBBBLLL\n" +
                "FBBBBBBLRR\n" +
                "BBFFBFBRRL\n" +
                "FBFBFBFRRR\n" +
                "FBBFBFFRRR\n" +
                "BBFBBFFRRR\n" +
                "FFBFBBFLRL\n" +
                "FFBFBBBRRR\n" +
                "BFFFFFFLRR\n" +
                "BFBFFBBLRR\n" +
                "BFBFBFBRLL\n" +
                "FBFBBBBLLR\n" +
                "BFFFFBBLLL\n" +
                "FBBFFFBLLR\n" +
                "BFBFBFBRLR\n" +
                "BBFFFFBLRL\n" +
                "BFBFBBBLLR\n" +
                "FFFBBBBRRL\n" +
                "FBFFFBFRLL\n" +
                "FBBFBBBLRL\n" +
                "BFBFFBBRLR\n" +
                "FBBFFFBLRR\n" +
                "FBBBBBFRLL\n" +
                "BBFBFFBLRL\n" +
                "BFFFBFFRLL\n" +
                "FBFBFFBLLR\n" +
                "BFFFFFBRRR\n" +
                "FBBFBBBRRL\n" +
                "FFFBBFFRRR\n" +
                "BFBBFBFLLL\n" +
                "BFFBBFBRLR\n" +
                "FFBBBBBLLL\n" +
                "FBFFBBBRLR\n" +
                "FFFBFFBRLR\n" +
                "BFBFFFFLRR\n" +
                "BFFFBFFLRR\n" +
                "BFFFFBBRLR\n" +
                "FBFBBBFLLR\n" +
                "BFFBFBBRRL\n" +
                "FBBFBBBRLL\n" +
                "FBBFBBFRLR\n" +
                "FFBFBFFLRR\n" +
                "FFFBFFFLLL\n" +
                "BFBFBFFLLL\n" +
                "FFFBFBFRRR\n" +
                "BFFBFFFLRL\n" +
                "FFBFBFBLLL\n" +
                "BFFFBFFLRL\n" +
                "BFBBBFFLRL\n" +
                "FFFFBFBLLL\n" +
                "FBBBBFFLLR\n" +
                "FBFBBFBRRR\n" +
                "FFFBBBBLRR\n" +
                "BBFBBFFLRL\n" +
                "FBFFBFFRLR\n" +
                "FFFBFBBLRL\n" +
                "BBFBFBFLLR\n" +
                "FFBFBFFRRL\n" +
                "BFFFFBFRLL\n" +
                "FFBFBFFLRL\n" +
                "FBBBBFBRLR\n" +
                "FBFBFFFRRR\n" +
                "BFBBBBFRRL\n" +
                "BBFFFFBLRR\n" +
                "FFFFBFBRRR\n" +
                "FFFBFFFRRR\n" +
                "BFBBBFFLLR\n" +
                "BBFBFBFRLR\n" +
                "FFFBFBBLLL\n" +
                "FFBFBBBRLR\n" +
                "BBFFBFBLRL\n" +
                "FFBFFFBLLL\n" +
                "FBFFFFFLRR\n" +
                "FBBFBBBRLR\n" +
                "FBFFFBBLLR\n" +
                "FFBFBFBRLR\n" +
                "FFBBFBFLRL\n" +
                "FBFBFBBLRR\n" +
                "FBBFFBFLRR\n" +
                "BBFFBBBLLR\n" +
                "FFFBFFFRRL\n" +
                "FFBFFFFRLL\n" +
                "BFBFBFFRRL\n" +
                "FBFBBBFLRR\n" +
                "FFBBFBBRRL\n" +
                "BFBBBFBLRL\n" +
                "FFFFBFFRLR\n" +
                "FFFBBBBLLR\n" +
                "FBBBFFFLLL\n" +
                "BFFBFFFRRR\n" +
                "FFFFBBBLRL\n" +
                "BFFFBBFLLR\n" +
                "FBFBFFFLRL\n" +
                "BFFFFBFLRL\n" +
                "FBFFBBBLLL\n" +
                "FFBBBFFRLL\n" +
                "BFBFFFBRRL\n" +
                "BFFFFFBLLR\n" +
                "FFBFBBFRRR\n" +
                "FBFBFBFRLR\n" +
                "BFBFBFFLLR\n" +
                "BFBBBBBLRL\n" +
                "FFFBBFFLRL\n" +
                "FBFFBFFRLL\n" +
                "FFFFBFFRRR\n" +
                "FBFFFBFLLL\n" +
                "BBFBFBFRLL\n" +
                "FBBFBFBLLL\n" +
                "FBFFFBBRRR\n" +
                "FFBBBFFRRL\n" +
                "FBBFBBFLRR\n" +
                "FBBBFFBRLR\n" +
                "FFFBBFFRRL\n" +
                "FFFBFFFRLR\n" +
                "FBFFBFBLLL\n" +
                "FFBFBFFRRR\n" +
                "BFFBBBBRLR\n" +
                "BBFFBBFLLR\n" +
                "BBFBFFBRLR\n" +
                "FBBFBBFLLL\n" +
                "FBBFBBFRRL\n" +
                "BBFBBFBRLL\n" +
                "BFFFFBFRRL\n" +
                "FBFBBFFRRR\n" +
                "BFFFFBFLLL\n" +
                "BBFFFBFLRR\n" +
                "FBBBFBFRLR\n" +
                "FFFBFFBLRR\n" +
                "FBBFBBFLLR\n" +
                "FBBFFFFLRR\n" +
                "BFBBBBFRRR\n" +
                "FBFFFFBRLR\n" +
                "FBBBBBFLRL\n" +
                "BFBFFBBLRL\n" +
                "BFBBBBFLRL\n" +
                "FBFBFBBRRR\n" +
                "FFFFBBBRRR\n" +
                "FBBFFFBRRL\n" +
                "FBFFBFFLRL\n" +
                "FFBFFFBRRR\n" +
                "BFFBBFFLLR\n" +
                "FBBBBBFRRL\n" +
                "FBBBFBBRRL\n" +
                "FFFBFBBRLL\n" +
                "BBFFBFBRRR\n" +
                "FBFBFBFLRL\n" +
                "FBBFFBFLLR\n" +
                "FFBFFFFRRR\n" +
                "BFFBBFFLLL\n" +
                "BFBBBFFLRR\n" +
                "FFBFBBFRLR\n" +
                "BBFFBFFLLL\n" +
                "BBFBFBFRRR\n" +
                "BFFBFFBRRR\n" +
                "BBFFBBBRLR\n" +
                "BFBFBBBRLL\n" +
                "BBFBFFFRLR\n" +
                "FFFFBBBLLR\n" +
                "FBBFBFBRLR\n" +
                "FFBBFBBLRR\n" +
                "FBFFFBBLRL\n" +
                "BBFFBFBRLL\n" +
                "BFFBFFFRRL\n" +
                "FFBBBBBRRL\n" +
                "FBFFFFFRLR\n" +
                "FFBFFFBRLR\n" +
                "FFFBFBBRRR\n" +
                "BFFBFBBLLR\n" +
                "FFFBBFFRLL\n" +
                "BBFFBFFLRL\n" +
                "FFFBBFFLLR\n" +
                "BFFFBFBLRR\n" +
                "FBBFBFBLRL\n" +
                "BFBBFFFRRR\n" +
                "BFBBBFBLRR\n" +
                "FFBBBFBRRL\n" +
                "FFBBBBFRRL\n" +
                "FFBFFFBLRL\n" +
                "BFBFBBFLRL\n" +
                "BFFBBFFRLR\n" +
                "FFBBBFFLRL\n" +
                "BFBFFFBLRR\n" +
                "FFFBBFBLRL\n" +
                "FFFBFFBLLL\n" +
                "BFBFBFBLRR\n" +
                "FBFBBFBRLR\n" +
                "BBFFBBBRRR\n" +
                "FFFBFBBRLR\n" +
                "BFFBBFFRRL\n" +
                "BFBBBBBRLL\n" +
                "BBFBFFFLRL\n" +
                "FFFFBFBLRL\n" +
                "BFBBFBFLLR\n" +
                "FBFBFFFRLL\n" +
                "BFBBFBFLRR\n" +
                "FBFBFBFLRR\n" +
                "BBFFFBFRRL\n" +
                "FFFFBFFRRL\n" +
                "FBFBFFBLRR\n" +
                "BFBFBFFLRR\n" +
                "FFFBBBBLLL\n" +
                "BBFBBFBRRR\n" +
                "BFFBBBFLRL\n" +
                "BBFFBFBLLR\n" +
                "BFBBFBBLLL\n" +
                "FFFBFBFRRL\n" +
                "FBBBFBBRRR\n" +
                "FFFBBFFLLL\n" +
                "BFBBBFBLLL\n" +
                "FBFFBFBLRL\n" +
                "BBFFFFBRRL\n" +
                "BBFFBFFLRR\n" +
                "FBFFFFBRRL\n" +
                "FBBFFBFRLR\n" +
                "FBFBBBBLRR\n" +
                "BBFFBBBLLL\n" +
                "BBFFFFFLLR\n" +
                "FBFFBBFRRR\n" +
                "FBBFFBFLLL\n" +
                "FBFFBFBLLR\n" +
                "BBFFFFBRRR\n" +
                "FBFFFBFRLR\n" +
                "BFBFBFBRRR\n" +
                "BFBBBFFLLL\n" +
                "FBBFFBBRRR\n" +
                "FFBBFBBRLL\n" +
                "FFBBFBBRRR\n" +
                "BBFBFFFLLL\n" +
                "FBFFBBFRRL\n" +
                "BFFFBFBLLR\n" +
                "FBFBBBFRRL\n" +
                "FBFBFBBRRL\n" +
                "FBFFBBBRRR\n" +
                "BBFBFBFLLL\n" +
                "FFBBFFFRLR\n" +
                "FBBFFFBLLL\n" +
                "FFBFFBBRRR\n" +
                "BFFFBBFLLL\n" +
                "FBFBFBBLLL\n" +
                "FBBFFFFRRL\n" +
                "FFBBFBFRLL\n" +
                "FBBBBBFRLR\n" +
                "BFBBFBBLRL\n" +
                "BFFFFBFRLR\n" +
                "BFFFFFFRRR\n" +
                "FBFBBFFLRL\n" +
                "FFBBFFBLRL\n" +
                "FBBFFFBLRL\n" +
                "FBBBBFFRLL\n" +
                "BBFBFFFRLL\n" +
                "FBFFFFFRLL\n" +
                "FFBFFBBLLL\n" +
                "FBFFFFBLRL\n" +
                "BFBFBBBLLL\n" +
                "BBFBBFBRLR\n" +
                "BBFFFBFRRR\n" +
                "FBBFBFBRRL\n" +
                "BFFBFFFLRR\n" +
                "BFBBFFBRRR\n" +
                "BFBBBFBRLL\n" +
                "BFBBBFFRRL\n" +
                "FBFBFBFLLR\n" +
                "FFBFBFBRLL\n" +
                "FFBBBFFLLR\n" +
                "BFBFBBBRRR\n" +
                "BBFFBFBRLR\n" +
                "FFBBBFBRLL\n" +
                "FFFBBFFLRR\n" +
                "BFBFFFBLLR\n" +
                "FFBFBBFRRL\n" +
                "BBFFBBFRLR\n" +
                "BBFBFBBLLL\n" +
                "FBFBBFBLRR\n" +
                "BBFBFBFLRL\n" +
                "FBBFFFBRRR\n" +
                "FBFBBFFRRL\n" +
                "FBBBFBFRRR\n" +
                "BFFFFFFRRL\n" +
                "BBFFFFFRRR\n" +
                "BFBBBFBRLR\n" +
                "BBFFFBBRRR\n" +
                "FBFFFFFRRR\n" +
                "BBFFFFFLRR\n" +
                "FFFBFBBRRL\n" +
                "FFBBBFBRLR\n" +
                "FFFBFFBLRL\n" +
                "FFFBBBBRLL\n" +
                "FBFBBBBLRL\n" +
                "BFBBBBBRLR\n" +
                "FBFBFFBRRL\n" +
                "BFBBFFBLLR\n" +
                "BFFFFFBLLL\n" +
                "BFBBBBFLRR\n" +
                "FFBFBBBLLR\n" +
                "BBFBBFFLLR\n" +
                "BFBFFBFRLL\n" +
                "FBBBBFBRRL\n" +
                "FBFFFBFLRL\n" +
                "FFBBFFBLLR\n" +
                "BFFBFFBLLR\n" +
                "FFBBBFBLRL\n" +
                "FBBBBFFLRR\n" +
                "BFFBFBFLRL\n" +
                "BFFBFFBLRR\n" +
                "FFBFBBBLLL\n" +
                "FBFBFFBRLL\n" +
                "FBBBFFFRRR\n" +
                "FBBBBBBLRL\n" +
                "FFBFFBFLLL\n" +
                "BBFFBFFRRL\n" +
                "FFFBBBFLRL\n" +
                "BFBBFBBRLR\n" +
                "FFFBFBFLRR\n" +
                "FBBBFBFRLL\n" +
                "BFBBFFFLLR\n" +
                "FBFBFFFLLL\n" +
                "BFFBBBFLLR\n" +
                "BBFBFFBRRL\n" +
                "FFBBBBBLLR\n" +
                "FFFBBBFLRR\n" +
                "BFBFBBBRRL\n" +
                "BFFFFFBRRL\n" +
                "FBFFBBBLLR\n" +
                "BBFBBBFLRR\n" +
                "BFFBBBBLRR\n" +
                "BBFBFFFLRR\n" +
                "FBBBFBFLLR\n" +
                "BBFFBFFRLL\n" +
                "FFBBFFFLRL\n" +
                "BBFBFFBLRR\n" +
                "BFFBBFBLLR\n" +
                "BFBBBBBLLR\n" +
                "BFFFBBFRLL\n" +
                "FBFBBBBRRL\n" +
                "FFBFBFFLLR\n" +
                "BFFFBFBLLL\n" +
                "FFFBBBFRLL\n" +
                "FBFFBBFLLR\n" +
                "FFFBBFBRLL\n" +
                "BFBFFFBRLL\n" +
                "BFFFBFFLLL\n" +
                "BBFFFFBRLR\n" +
                "FBBFFBBLRR\n" +
                "BBFFBBBRLL\n" +
                "BFBFFFFRLL\n" +
                "FBBBBBBRLR\n" +
                "FFFBFFBLLR\n" +
                "FFFBBBBRRR\n" +
                "FFFBBBBLRL\n" +
                "FBBBFFBLLR\n" +
                "BFBFBFBRRL\n" +
                "FFFFBBFRLR\n" +
                "FFBFFBFLLR\n" +
                "FFFFBBBRRL\n" +
                "FBBFFFFRLL\n" +
                "BFFBBBFRRL\n" +
                "FFFFBBFRRL\n" +
                "BFBFFBBRLL\n" +
                "FBFFFFFLRL\n" +
                "FFFBBFBLRR\n" +
                "FBFFFBFRRL\n" +
                "BFBFFBBLLR\n" +
                "FFFFBBFLLL\n" +
                "FBFFFBBRRL\n" +
                "BFFBBBFRLL\n" +
                "BFFFBFBRLR\n" +
                "BBFBFBBRLL\n" +
                "FBFBFBBRLL\n" +
                "BFBFFFBRRR\n" +
                "BFFFBBBLRR\n" +
                "FFBFBFFRLL\n" +
                "BFBBFBFRRR\n" +
                "BBFBBFFRRL\n" +
                "BBFFFBBLLL\n" +
                "FBFBFFBLLL\n" +
                "FBFFFFBLLR\n" +
                "FBFBBFFRLL\n" +
                "BBFBBBFLLL\n" +
                "FFBFBBFLRR\n" +
                "BFFBFBFLLR\n" +
                "BFFBBBBLRL\n" +
                "FFBFBBBLRR\n" +
                "FBBBFFFRLL\n" +
                "FFBFFFFLLL\n" +
                "FBFFFFBLLL\n" +
                "FBBBBBBRRR\n" +
                "BFBFFBBRRL\n" +
                "FFBBFFFLLL\n" +
                "FFBBBFBLRR\n" +
                "FFBBBBBLRL\n" +
                "BBFFBBFRLL\n" +
                "FFBBFBFLLL\n" +
                "BFFFFFFLLL\n" +
                "BFBBFBFRLR\n" +
                "BBFFFFFRRL\n" +
                "FFBBFFFRRL\n" +
                "FFFFBFBLRR\n" +
                "BFFFBBBLLR\n" +
                "FBFFBFFRRR\n" +
                "BFBFFFFLLL\n" +
                "FBBFBFFLRR\n" +
                "FFBBBFFRRR\n" +
                "FBBBFFFRLR\n" +
                "FFFFBBFLRR\n" +
                "FBFBFBBLLR\n" +
                "BFFFFFBRLR\n" +
                "BFFBFBFRLR\n" +
                "FBFFBFBLRR\n" +
                "FBFFFBFLLR\n" +
                "FBFFBBFLRR\n" +
                "FFBBFBBRLR\n" +
                "BFFFBFBRRL\n" +
                "BFBBFBBRLL\n" +
                "BBFFFFFLLL\n" +
                "FFBBBBBRLR\n" +
                "BBFBFFBLLL\n" +
                "BBFFFBBRLL\n" +
                "BBFBFFBRLL\n" +
                "BFFBFBFRRL\n" +
                "FFBFFBFRRL\n" +
                "BFBBFFBRRL\n" +
                "BFFFFFFRLL\n" +
                "FFBBBBFRLL\n" +
                "FFFBFBFLRL\n" +
                "FBBBBFFLLL\n" +
                "BBFBBFFLLL\n" +
                "BFFFFBBRRL\n" +
                "BFFFBFBLRL\n" +
                "FFFBFBBLRR\n" +
                "BFFFBFFRRR\n" +
                "FFBBBFFRLR\n" +
                "BFBFBBFRRL\n" +
                "BFFBBFFRRR\n" +
                "BFFBBFFLRL\n" +
                "FBBBBFBRLL\n" +
                "FFFFBBFLLR\n" +
                "BFBFFFFRLR\n" +
                "BBFFBFFLLR\n" +
                "BBFBFFBLLR\n" +
                "FFFBBFBLLL\n" +
                "BFBFBFFRRR\n" +
                "FBBFBFFLRL\n" +
                "BFFBFBFRLL\n" +
                "FFBBFFBLLL\n" +
                "FBBBBFFLRL\n" +
                "FFBBFFFLLR\n" +
                "FFFBBFBLLR\n" +
                "BFBBFFFLLL\n" +
                "BFFBFBFLLL\n" +
                "BFFBBFBLRR\n" +
                "BFFBFBFLRR\n" +
                "FBBFFFFRRR\n" +
                "BFBBFFBRLR\n" +
                "BFFFBBFRRR\n" +
                "BFBBBFBRRL\n" +
                "FFBBFBBLLL\n" +
                "FBBBFBBLLR\n" +
                "BBFBFBBRRL\n" +
                "FFBFFBFRLL\n" +
                "FFFFBBFRLL\n" +
                "BBFFBBFLRR\n" +
                "FBFBFBFRRL\n" +
                "FBBBFBBLRR\n" +
                "FBFFBFFLRR\n" +
                "FFFBFBFLLR\n" +
                "FBBFBFFRRL\n" +
                "FBFFFBBRLL\n" +
                "FFBFFBBLLR\n" +
                "FFBFBFFRLR\n" +
                "FFBFBBBRLL\n" +
                "FFFBFFFLRL\n" +
                "FFFBBFFRLR\n" +
                "FBFBBFBRLL\n" +
                "BFFFBBFLRL\n" +
                "BFBBFBBRRR\n" +
                "FBBFBBFRRR\n" +
                "FFBBFBFRRR\n" +
                "BFFBFBBLRL\n" +
                "FFFFBBBLLL\n" +
                "BFFFFFBLRR\n" +
                "FBBFBBBLRR\n" +
                "FBBBBBFLLL\n" +
                "FFBFFBFRRR\n" +
                "BBFFBBFRRR\n" +
                "FFBFBBFLLR\n" +
                "FFBBBFFLRR\n" +
                "BFFFBBFRRL\n" +
                "BFBFBFFLRL\n" +
                "BFBBFBFLRL\n" +
                "FFBBFBFLRR\n" +
                "FFFBBFBRLR\n" +
                "FBFBBBBRLR\n" +
                "BFFFBBFRLR\n" +
                "FFFBFFFLRR\n" +
                "BFBBFFFRRL\n" +
                "BFBBBBBLRR\n" +
                "FBFFFFBRRR\n" +
                "FBBFBBBLLL\n" +
                "FFFFBBBRLL\n" +
                "BBFFFBBRRL\n" +
                "BBFBFFFRRR\n" +
                "FFBFFFFRLR\n" +
                "FFBBFFBRLL\n" +
                "FBFFFBBLLL\n" +
                "BBFBFBFLRR\n" +
                "FBBBFBFLRR\n" +
                "BFBFBFFRLL\n" +
                "BBFBBBFLRL\n" +
                "FBFFFFFLLR\n" +
                "BFBFBFBLLR\n" +
                "BBFBBBFRLR\n" +
                "BFBBBFFRLR\n" +
                "FFBBFFFLRR\n" +
                "FBFFFBBRLR\n" +
                "FFBFFFBRLL\n" +
                "BFBBFBBRRL\n" +
                "FFBBFFBRLR\n" +
                "BFBBFFBLLL\n" +
                "FFBBBBFLLL\n" +
                "BBFBFFFRRL\n" +
                "FBFBBBFRLL\n" +
                "FBFBBFFLRR\n" +
                "FBBFBFFLLL\n" +
                "BFBFFBFRRL\n" +
                "FBFBFFFRRL\n" +
                "BFBFBBFRLL\n" +
                "BFFFBFFRLR\n" +
                "FBFBFBFRLL\n" +
                "BFBBFBBLRR\n" +
                "FBBFBFBLRR\n" +
                "BFFBFFBRLL\n" +
                "FFFBFFFRLL\n" +
                "FFBFFFFLRL\n" +
                "FBBBFFFLRR\n" +
                "FFFBFFBRLL\n" +
                "BFFFBBBRLR\n" +
                "FBFBBFBLLR\n" +
                "BFBBBBFRLL\n" +
                "BBFFBBBLRR\n" +
                "FBFFFFFRRL\n" +
                "BFBFFFFRRL\n" +
                "FBBBBBBLLR\n" +
                "FBBFFFBRLR\n" +
                "FBBBFFBLLL\n" +
                "BBFBBBFRLL\n" +
                "BFFBBFBLLL\n" +
                "BFFFFFFLLR\n" +
                "FBBFBBBRRR\n" +
                "BFFFFBBLRR\n" +
                "BBFFFBFRLR\n" +
                "FFFBBBFLLL\n" +
                "BFFBBBBRLL\n" +
                "BFBBBBFLLL\n" +
                "BFBFBBFLRR\n" +
                "BFBFFFFLLR\n" +
                "BBFBFBFRRL\n" +
                "FFBBFFBRRL\n" +
                "BFBBBBFRLR\n" +
                "FBBBFFBRRL\n" +
                "BBFBFBBLRL\n" +
                "BFBBFFBLRR\n" +
                "FBBFFFFLRL\n" +
                "FBBBBFFRRR\n" +
                "FFBBBFBLLR\n" +
                "FBBFFBFRLL\n" +
                "FBFBBFBLLL\n" +
                "FFFFBFBLLR\n" +
                "FBBBFBFRRL\n" +
                "FBFFBBFLRL\n" +
                "BFBBFFFRLR\n" +
                "BFFFFBBRRR\n" +
                "FFBBBBBRLL\n" +
                "BFFFBBBRRR\n" +
                "FBBBBBFLRR\n" +
                "BFFFFBFRRR\n" +
                "BFBFFFFLRL\n" +
                "FFFBFBFRLL\n" +
                "BFFFFBFLLR\n" +
                "BBFBFFBRRR\n" +
                "FBFFBFFLLL";

        String[] inputArray = inputString.split("\n");
        List<Integer> ids = new ArrayList<Integer>();

        for (String input : inputArray) {
            char[] in = input.toCharArray();
            double minRow = 0;
            double maxRow = 127;
            double minColumn = 0;
            double maxColumn = 7;

            for (int i = 0; i<7; i++) {
                switch (in[i]) {
                    case 'F' -> maxRow = Math.floor(maxRow - ((maxRow - minRow) / 2));
                    case 'B' -> minRow = Math.ceil(minRow + ((maxRow - minRow) / 2));
                }
            }

            for (int i = 7; i<10; i++) {
                switch (in[i]) {
                    case 'L' -> maxColumn = Math.floor(maxColumn - ((maxColumn - minColumn) / 2));
                    case 'R' -> minColumn = Math.ceil(minColumn + ((maxColumn - minColumn) / 2));
                }
            }

            ids.add((int) (minRow * 8 + minColumn));
        }

        System.out.println(Collections.max(ids));
    }
}
