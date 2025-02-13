package ByteArrayStream;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ImageByteArrayConverterTest {
    @Test
    void testImageConversion() throws IOException {
        String inputImage = "C:\\Users\\scc\\Pictures\\Saved Pictures\\GroClaDia.jpg";
        String outputImage = "C:\\Users\\scc\\Pictures\\Saved Pictures\\SchObjDia.jpg";

        byte[] imageBytes = ImageByteArrayConverter.imageToByteArray(inputImage);
        ImageByteArrayConverter.byteArrayToImage(imageBytes, outputImage);

        byte[] outputBytes = ImageByteArrayConverter.imageToByteArray(outputImage);
        assertArrayEquals(imageBytes, outputBytes, "The byte arrays should be identical.");
    }

    @Test
    void testInvalidFile() {
        assertThrows(IOException.class, () -> ImageByteArrayConverter.imageToByteArray("invalid.jpg"));
    }

}