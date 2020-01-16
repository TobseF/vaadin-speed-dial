package github.tobsef.vaadin.paperfab;

import org.junit.Test;

import com.vaadin.testbench.TestBenchElement;

import static org.junit.Assert.assertTrue;

public class ViewIT extends AbstractViewTest {

    /**
     * Check that {@link SpeedDial} contains at least one other element, which means that
     * is has been upgraded to a custom element and not just rendered as an empty tag.
     */
    @Test
    public void componentExists() {
        final TestBenchElement speedDial = $("paper-fab-speed-dial").first();
        assertTrue(speedDial.$(TestBenchElement.class).all().size() > 0);
    }
}
