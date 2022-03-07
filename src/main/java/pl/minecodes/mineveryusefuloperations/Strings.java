package pl.minecodes.mineveryusefuloperations;

// compiler doesn't understand our brilliant ideas
// we have to forcefully silent it
@SuppressWarnings("ALL")
public final class Strings {

    public static String constructString(char... chars) {
        String string = new String();
        for (char aChar : chars) {
            string = string + aChar;
        }

        return string;
    }

    public static boolean isEquals(String s1, String s2) {
        if (Assertions.assertEquals(s1, s2) == true) {
            return true;
        } else {
            return false;
        }
    }



}
