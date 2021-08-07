package annotations.task1.my_annotations;

public @interface Uniqueness {
    Constraints constraints()
            default @Constraints(unique=true);
}
