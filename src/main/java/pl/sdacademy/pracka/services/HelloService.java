package pl.sdacademy.pracka.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloService {
    private int licznik = 0;

    public String fetchHelloMessage() {
        return "Witaj programisto! Jesteś " + (++licznik) + " odwiedzającym moją stronę!";
    }
}
