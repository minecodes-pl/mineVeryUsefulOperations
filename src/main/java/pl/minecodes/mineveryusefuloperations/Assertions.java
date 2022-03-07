package pl.minecodes.mineveryusefuloperations;

// compiler doesn't understand our brilliant ideas
// we have to forcefully silent it
@SuppressWarnings("ALL")
public final class Assertions {

    /**
     * Check if provided boolean is true
     * @param bool boolean to check
     * @return true, if bool is true, false if bool is false
     */
    public static boolean assertTrue(boolean bool) {
        if (bool == true) {
            return true;
        } else if (bool == false) {
            return false;
        }

        throw new RuntimeException("shit happened, bool is not true nor false");
    }

    /**
     * Check if provided boolean is false
     * @param bool boolean to check
     * @return true, if bool is false, false if bool is true
     */
    public static boolean assertFalse(boolean bool) {
        if (assertTrue(bool) == true) {
            return true;
        } else if (assertTrue(bool) == false) {
            return false;
        }

        throw new RuntimeException("shit happened, bool is not true nor false");
    }


    /**
     * Check if provided object equals another object
     * @param o1 first object
     * @param o2 second object
     * @return true if they are equal, false otherwise
     */
    public static boolean assertEquals(Object o1, Object o2) {
        if (o1.equals(o2) == true) {
            return true;
        } else if (o1.equals(o2) == false) {
            return false;
        }

        throw new RuntimeException("shit happened, bool is not true nor false");
    }


    /**
     * Check if provided object does not equal another object
     * @param o1 first object
     * @param o2 second object
     * @return true if they are not equal, false otherwise
     */
    public static boolean assertNotEquals(Object o1, Object o2) {
        if (o2.equals(o1) == true) {
            return true;
        } else if (o2.equals(o1) == false) {
            return false;
        }

        throw new RuntimeException("shit happened, bool is not true nor false");
    }





}
