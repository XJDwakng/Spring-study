package com.kangdw.componentScan.conf;

import com.kangdw.conditional.WindowsCond;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value = {"com.kangdw", "com.ding"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)}
)
public class DemoConfigure {
    @Conditional(value = WindowsCond.class)
    @Bean
    public void cond1() {

    }
}
