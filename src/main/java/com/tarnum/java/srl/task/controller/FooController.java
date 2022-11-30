package com.tarnum.java.srl.task.controller;

import java.time.Duration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import com.tarnum.java.srl.task.domain.Foo;

/**
 * @author imran
 *
 */
@RestController
@RequestMapping("/foo")
public class FooController {

	private static final String SEPARATOR = " - ";
	private static final String NAME = "Gerardo Roza";

	@GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Foo> getAll() {
		return Flux.interval(Duration.ofSeconds(1)).log()
				.map(id -> Foo.builder().id(id).name(NAME.concat(SEPARATOR).concat(String.valueOf(id))).build());
	}

}
