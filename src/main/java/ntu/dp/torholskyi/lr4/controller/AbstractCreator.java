package ntu.dp.torholskyi.lr4.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import ntu.dp.torholskyi.lr4.model.Human;
import ntu.dp.torholskyi.lr4.model.StructuralUnit;

import java.util.List;

@Data
@NoArgsConstructor
public abstract class AbstractCreator<T> extends StructuralUnit<T> {

    public AbstractCreator(String name, Human human, List<T> children) {
        super(name, human, children);
    }
    public abstract StructuralUnit<T> create(String name, Human human, List<T> children);
}
