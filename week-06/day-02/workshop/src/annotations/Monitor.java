package annotations;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Monitor {

  String aspectRatio() default "4:3";
  String classification() default "TFT";
}
