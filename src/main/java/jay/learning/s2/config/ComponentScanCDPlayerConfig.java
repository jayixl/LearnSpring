package jay.learning.s2.config;

import jay.learning.s2.App;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = App.class)
public class ComponentScanCDPlayerConfig {
}