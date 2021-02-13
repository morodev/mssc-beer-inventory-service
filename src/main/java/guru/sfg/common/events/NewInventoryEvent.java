package guru.sfg.common.events;

import lombok.NoArgsConstructor;

/**
 * Created By Luca Moro on 13/02/2021
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
