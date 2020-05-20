
public class Reverse {
    public static void main(String[] args) {

        reverse(new byte[]{7, 33, 127, -5, -33, 0});

    }

    public static void reverse(byte[] toFlip) {
        for (int i = 0; i < toFlip.length; i++) {
            int tmp = toFlip[i];

            tmp = ((tmp & 0x55) << 1) | ((tmp >> 1) & 0x55);
            tmp = ((tmp & 0x33) << 2) | ((tmp >> 2) & 0x33);
            tmp = ((tmp & 0x0F) << 4) | ((tmp >> 4) & 0x0F);

            System.out.format("%d byte revers to %d\n", toFlip[i], (byte) tmp);
            toFlip[i] = (byte) tmp;
        }
    }
}
