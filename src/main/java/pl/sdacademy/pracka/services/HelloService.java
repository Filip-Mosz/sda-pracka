package pl.sdacademy.pracka.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private int licznik = 0;

    public String fetchHelloMessage() {
        return "Witaj programisto! Jesteś " + (++licznik) + " odwiedzającym moją stronę!";
    }
}
