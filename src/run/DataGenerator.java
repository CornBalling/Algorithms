package run;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Contains static methods that generate data in various data types.
 */
public final class DataGenerator {
    private static final Random rng = new Random();

    private DataGenerator() {    }

    /**
     * Set the seed used by the internal Random Number Generator.
     * @param seed The new seed of the Random Number Generator.
     */
    public static void setGeneratorSeed(long seed) {
        rng.setSeed(seed);
    }

    public static byte getByte() {
        int temp = rng.nextInt(Byte.MAX_VALUE - Byte.MIN_VALUE) - Byte.MIN_VALUE;
        return (byte) temp;
    }

    public static short getShort() {
        int temp = rng.nextInt(Short.MAX_VALUE - Short.MIN_VALUE) - Short.MIN_VALUE;
        return (short) temp;
    }

    /**
     * Randomly generates an integer in the range of low to high - 1.
     *
     * @param low The low end of the range (inclusive)
     * @param high The high end of the range (exclusive)
     * @return An int in the range of low (inclusive) and high (exclusive)
     */
    public static int getInt(int low, int high) {
        return rng.nextInt(high - low) + low;
    }

    /**
     * Randomly generates a long in the range of low to high - 1.
     *
     * @param low The low end of the range (inclusive)
     * @param high The high end of the range (exclusive)
     * @return A long in the range of low (inclusive) and high (exclusive)
     */
    public static long getLong(long low, long high) {
        return rng.nextLong(high - low) + low;
    }

    public static boolean getBoolean() {
        return rng.nextBoolean();
    }

    public static double getDouble() {
        return rng.nextDouble();
    }

    public static float getFloat() {
        return rng.nextFloat();
    }

    /**
     * Returns a char in the range of 33 (!) - 126 (~). This range includes common punctuation, numbers, and lower and
     * uppercase letters.
     * @return A randomly generated char.
     */
    public static char getChar() {
        return (char) (rng.nextInt(127 - 33) + 33);
    }

    /**
     * Creates an array of objects of type clazz and length size.
     *
     * @param clazz The class to fill the array
     * @param size The length of the array
     * @return The created array
     * @param <T> The type to fill the array
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] getArray(Class<T> clazz, int size) {
        return (T[]) Array.newInstance(clazz, size);
    }

    /**
     * Constructs an array of ints with random values between low (inclusive) and high (exclusive).
     *
     * @param size the size of the array
     * @param low the lowest possible value of an element
     * @param high one higher than the highest possible element
     * @return the constructed array
     */
    public static int[] getArray(int size, int low, int high) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = getInt(low, high);
        }
        return arr;
    }


}
