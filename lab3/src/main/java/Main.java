package main.java;

import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        int parametersCount = 1;

        // Way 1 (via Reflections)
        Reflections reflections = new Reflections("main.java");
        Set<Class<? extends Enum>> enumClasses = reflections.getSubTypesOf(java.lang.Enum.class);

        for (Class<?> class_: enumClasses) {
            Constructor<?>[] constructors = class_.getDeclaredConstructors();
            for (Constructor<?> constructor: constructors) {
                if (constructor.getParameterCount() == parametersCount + 2)
                    System.out.println(class_.getName());
            }
        }

//        // Way 2
//        String[] classNames = {
//                "Main", "Food", "Furniture", "Place", "CharacterBuilder", "CharacterEngineer",
//                "Bear", "Buffet", "Building", "Character", "Human", "Kangaroo", "Pig", "Tiger",
//                "Gender", "Tone", "CantBeHuggedException", "EnvironmentVariableNotFoundException", "ObjectNotFoundException"
//        };
//        String[] prefixes = {"absclasses", "classes", "enums", "exceptions"};
//
//        for (String className: classNames) {
//            Class<?> class_ = null;
//            for(String prefix: prefixes) {
//                try {
//                    class_ = Class.forName("main.java." + prefix + "." + className);
//                } catch (ClassNotFoundException ignored) {}
//                if (class_ != null) {
//                    break;
//                }
//            }
//
//            if (class_ != null && class_.isEnum()) {
//                Constructor<?>[] constructors = class_.getDeclaredConstructors();
//                for (Constructor<?> constructor: constructors) {
//                    if (constructor.getParameterCount() == parametersCount + 2)
//                        System.out.println(class_.getName());
//                }
//            }
//        }

    }
}
