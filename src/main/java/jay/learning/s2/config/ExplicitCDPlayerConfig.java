package jay.learning.s2.config;

import jay.learning.s2.CDPlayer;
import jay.learning.s2.CompactDisc;
import jay.learning.s2.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExplicitCDPlayerConfig {

    @Bean(name="lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }


    // 3 different ways to explicit config beans

//    @Bean
//    public CDPlayer cdPlayer() {
//        return new CDPlayer(sgtPeppers());
//    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
//
//    @Bean
//    public CDPlayer cdPlayer(CompactDisc compactDisc) {
//        CDPlayer cdPlayer = new CDPlayer(compactDisc);
//        cdPlayer.setCompactDisc(compactDisc);
//        return cdPlayer;
//    }

}
