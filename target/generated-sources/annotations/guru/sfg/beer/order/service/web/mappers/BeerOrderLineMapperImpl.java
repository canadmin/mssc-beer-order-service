package guru.sfg.beer.order.service.web.mappers;

import guru.sfg.beer.order.service.domain.BeerOrderLine;
import guru.sfg.beer.order.service.web.model.BeerOrderLineDto;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-11-19T23:53:06+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.4 (Ubuntu)"
)
@Component
@Primary
public class BeerOrderLineMapperImpl extends BeerOrderLineMapperDecorator implements BeerOrderLineMapper {

    @Autowired
    @Qualifier("delegate")
    private BeerOrderLineMapper delegate;

    @Override
    public BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto)  {
        return delegate.dtoToBeerOrderLine( dto );
    }
}
