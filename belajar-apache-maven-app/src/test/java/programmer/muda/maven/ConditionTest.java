package programmer.muda.maven;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

@Tag("integration-test")
public class ConditionTest {

    @Test
    public void testSystemProperty(){
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + ": " + value));
    }


    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyWindows(){

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisableWindows(){

    }

    @Test
    @EnabledOnJre({JRE.JAVA_23})
    public void testEnabledOnJava23(){

    }

    @Test
    @DisabledOnJre({JRE.JAVA_23})
    public void testDisabledOnJava23(){

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_20, max = JRE.JAVA_23)
    public void tesEnabledOnJava20To23(){

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_20, max = JRE.JAVA_23)
    public void tesDisabledOnJava20To23(){

    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    public void testEnabledOnJavaVendorOracle(){

    }

    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    public void testDisabledOnJavaVendorOracle(){

    }

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    public void testEnabledOnProfileDev(){

    }

    @Test
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    public void testDisabledOnProfileDev(){

    }
}
