package peaksoft.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestApi {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @GetMapping("/bye")
    public String getBye(){
        return "Bye";
    }
}
