package some.example.hibernate;

import org.springframework.web.bind.annotation.*;
import some.example.hibernate.model.Bar;
import some.example.hibernate.model.Foo;
import some.example.hibernate.repo.BarRepository;
import some.example.hibernate.repo.FooRepository;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class RestEndpoints {

    private final FooRepository fooRepository;
    private final BarRepository barRepository;

    public RestEndpoints(FooRepository fooRepository, BarRepository barRepository) {
        this.fooRepository = fooRepository;
        this.barRepository = barRepository;
    }

    @PostMapping(value = "/foo")
    public Foo createFoo(@RequestBody Foo foo) {
        return fooRepository.save(foo);
    }

    @GetMapping(value = "/foo/{id}")
    public Foo getFoo(@PathVariable int id) {
        return fooRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @GetMapping(value = "/foo")
    public List<Foo> getAllFoo(){
        return fooRepository.findAll();
    }

    @PostMapping(value = "/bar")
    public Bar createFoo(@RequestBody Bar bar) {
        return barRepository.save(bar);
    }

}
