package in.pabreja.exercise.industrybuying.searchliteral.stereotype;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;


/**
 * This component would be over all the Factory classes to uniquely identify factory layer
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface IndustryBuyingFactory {

    /**
     * The value may indicate a suggestion for a logical component name,
     * to be turned into a Spring bean in case of an autodetected component.
     * @return the suggested component name, if any (or empty String otherwise)
     */
    String value() default "";
}
