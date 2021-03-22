package guru.springframework.services;

import guru.springframework.commands.UnitOfMeasureCommand;
Cimport reactor.core.publisher.Flux;

/**
 * Created by jt on 6/28/17.
 */
public interface UnitOfMeasureService {

    Flux<UnitOfMeasureCommand> listAllUoms();
}
