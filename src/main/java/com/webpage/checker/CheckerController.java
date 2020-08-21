package com.webpage.checker;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class CheckerController {

    private final CheckerService checkerService;

    @GetMapping("/two")
    public String two() throws IOException {
        return checkerService.retrieveHTML(Checker.TWO_BEDROOM);
    }

    @GetMapping("/three")
    public String three() throws IOException {
        return checkerService.retrieveHTML(Checker.THREE_BEDROOM);
    }
}
