package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Sludge_Bomb extends SpecialMove {
    public Sludge_Bomb() { super(Type.POISON,90,100); }
    @Override
    protected void applyOppEffects(Pokemon p){ if (Math.random() <= 0.3) Effect.poison(p); }
}
