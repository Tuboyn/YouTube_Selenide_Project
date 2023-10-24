import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GooglePage;
import pages.YouTubePlayerPage;

public class PlayVideoTest extends BaseTest {

    @BeforeMethod
    public void setUp() {
        start("https://www.google.com");
    }

    @Test
    public void testVideoPlayed() {
        String searchItem = "Friends Full Episodes";

        new GooglePage()
                .search(searchItem)
                .chooseResult(searchItem);

        new YouTubePlayerPage()
                .playVideo()
                .checkVideoPlayed();
    }

    @AfterMethod
    public void close() {
        stop();
    }
}