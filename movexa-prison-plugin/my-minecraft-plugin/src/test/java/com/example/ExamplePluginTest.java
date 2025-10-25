import org.bukkit.plugin.java.JavaPlugin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExamplePluginTest {

    private ExamplePlugin plugin;

    @BeforeEach
    public void setUp() {
        plugin = new ExamplePlugin();
    }

    @Test
    public void testPluginInitialization() {
        assertNotNull(plugin);
    }

    // Additional tests for other methods in ExamplePlugin can be added here
}