import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomNumbersIterator(this.min, this.max);
    }

    private class RandomNumbersIterator implements Iterator<Integer> {
        private final Random random;
        private final int min;
        private final int max;

        public RandomNumbersIterator(int min, int max) {
            random = new Random();
            this.min = min;
            this.max = max;
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return randomInt(this.min, this.max);
        }

        private int randomInt(int min, int max) {
            int randomNumber = random.nextInt((max - min + 1)) + min;
            return randomNumber;
        }
    }

}
