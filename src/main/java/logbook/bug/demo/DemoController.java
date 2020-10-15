package logbook.bug.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @PostMapping("/form")
    public ModelAndView handlePost(@RequestParam String field1, @RequestParam String field2) {
        log.info("field1: {}, field2: {}", field1, field2);
        return new ModelAndView("result")
                .addObject("field1", field1)
                .addObject("field2", field2);
    }
}
