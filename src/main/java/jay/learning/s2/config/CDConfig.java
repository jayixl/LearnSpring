package jay.learning.s2.config;

import jay.learning.s2.CompactDisc;
import jay.learning.s2.SgtPeppers;
import org.springframework.context.annotation.Bean;

public class CDConfig {

    @Bean(name="lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
}
