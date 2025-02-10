package bitwiseandnumbersystems;

public class FlippingAnImage {

    // leetcode 832

    // optimized
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // reverse
            for (int i = 0; i < (image[0].length - 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }

    // brute force
    public int[][] flipAndInvertImageOptional(int[][] image) {
        // flip (reverse)
        for (int i = 0; i < image.length; i++) {
            int start = 0;
            int end = image[0].length - 1;

            while (start <= end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }

        // invert
        for(int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
